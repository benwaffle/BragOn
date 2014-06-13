package com.bragon;

import java.io.StringWriter;
import java.io.Writer;
import java.net.URLEncoder;
import java.util.Arrays;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import android.os.AsyncTask;
import android.os.Message;
import android.util.Log;

import com.bragon.data.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PSApi {
	public static final String BASEURL = "https://ps01.bergen.org/pearson-rest/services/PublicPortalServiceJSON/";
	public static final String AUTH_U = "pearson", AUTH_P = "m0bApP5";

	private RestTemplate rest;
	private UserSessionVO session; 
	
	public PSApi() {
		System.setProperty("log.tag.RestTemplate", "VERBOSE");
		rest = new RestTemplate(true, 
				new HttpComponentsClientHttpRequestFactory(makeAuthClient()));
		rest.getMessageConverters().add(
				new MappingJackson2HttpMessageConverter());
		rest.getMessageConverters().add(
				new StringHttpMessageConverter());
	}

	private HttpClient makeAuthClient(){
		AuthScope scope = new AuthScope("ps01.bergen.org", 443, AuthScope.ANY_REALM);
		Credentials creds = new UsernamePasswordCredentials(AUTH_U, AUTH_P);
		
		CredentialsProvider provider = new BasicCredentialsProvider();
		provider.setCredentials(scope, creds);
		
		DefaultHttpClient client = new DefaultHttpClient();
		client.setCredentialsProvider(provider);
		
		return client;
	}
	
	public boolean login(final String username, final String password){
		try {
			return new AsyncTask<Void, Void, Boolean>() {
				@Override
				protected Boolean doInBackground(Void... params) {
					return loginNet(username, password);
				}
			}.execute().get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	private boolean loginNet(final String username, final String password) {
		String request = "username=" + username + "&password=" + password + "&userType=2&response=application/json";
		
		ReturnData sess;
		
		try {
			 sess = rest.getForObject(BASEURL + "login?" + request, ReturnData.class);
		} catch (RestClientException e) {
			Log.e("com.bragon","error :(");
			e.printStackTrace();
			return false;
		}

		session = sess.ret.userSessionVO;
		return true;
	}
	
	public ResultsVO getStudentData(){
		if (session == null)
			return null;
		
		try {
			return new AsyncTask<Void, Void, ResultsVO>(){
				@Override
				protected ResultsVO doInBackground(Void... params) {
					return getStudentDataNet();
				}
			}.execute().get();
		} catch (Exception e){
			return null;
		}
	}
	
	private ResultsVO getStudentDataNet(){
		try {
			ResultsVOWrapper result;
			try {
				GetStudentData getData = new GetStudentData();
				getData.studentIDs = 1L;
				getData.qil = new QueryIncludeListVO(1);
				getData.userSessionVO = session;
				
				HttpHeaders requestHeaders = new HttpHeaders();
				requestHeaders.setContentType(new MediaType("application","json"));
				HttpEntity<GetStudentData> requestEntity = new HttpEntity<GetStudentData>(getData, requestHeaders);
				
				result = rest.exchange(BASEURL + "getStudentData?response=application/json",
						HttpMethod.POST, requestEntity, ResultsVOWrapper.class).getBody();
//				result = rest.postForObject(BASEURL + "getStudentData?response=application/json", getData, ResultsVOWrapper.class);
				
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			
			Log.d("com.bragon", "returned: \n" + result);
			
			return null;
		} catch (Exception e){
			Log.e("com.bragon","error :(");
			e.printStackTrace();
			return null;
		}
	}
}
