package com.Wsdl2Code.WebServices.PublicPortalServiceJSON;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.5
//
// Date Of Creation: 6/9/2014 3:15:59 AM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class ServerInfo implements KvmSerializable {
    
    public String apiVersion;
    public int dayLightSavings;
    public boolean dayLightSavingsSpecified;
    public int rawOffset;
    public boolean rawOffsetSpecified;
    public String serverTime;
    public boolean serverTimeSpecified;
    public String timeZoneName;
    
    public ServerInfo(){}
    
    public ServerInfo(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("apiVersion"))
        {
            Object obj = soapObject.getProperty("apiVersion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                apiVersion = j.toString();
            }else if (obj!= null && obj instanceof String){
                apiVersion = (String) obj;
            }
        }
        if (soapObject.hasProperty("dayLightSavings"))
        {
            Object obj = soapObject.getProperty("dayLightSavings");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dayLightSavings = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                dayLightSavings = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("dayLightSavingsSpecified"))
        {
            Object obj = soapObject.getProperty("dayLightSavingsSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dayLightSavingsSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                dayLightSavingsSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("rawOffset"))
        {
            Object obj = soapObject.getProperty("rawOffset");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                rawOffset = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                rawOffset = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("rawOffsetSpecified"))
        {
            Object obj = soapObject.getProperty("rawOffsetSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                rawOffsetSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                rawOffsetSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("serverTime"))
        {
            Object obj = soapObject.getProperty("serverTime");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                serverTime = j.toString();
            }else if (obj!= null && obj instanceof String){
                serverTime = (String) obj;
            }
        }
        if (soapObject.hasProperty("serverTimeSpecified"))
        {
            Object obj = soapObject.getProperty("serverTimeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                serverTimeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                serverTimeSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("timeZoneName"))
        {
            Object obj = soapObject.getProperty("timeZoneName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                timeZoneName = j.toString();
            }else if (obj!= null && obj instanceof String){
                timeZoneName = (String) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return apiVersion;
            case 1:
                return dayLightSavings;
            case 2:
                return dayLightSavingsSpecified;
            case 3:
                return rawOffset;
            case 4:
                return rawOffsetSpecified;
            case 5:
                return serverTime;
            case 6:
                return serverTimeSpecified;
            case 7:
                return timeZoneName;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 8;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "apiVersion";
                break;
            case 1:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "dayLightSavings";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "dayLightSavingsSpecified";
                break;
            case 3:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "rawOffset";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "rawOffsetSpecified";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "serverTime";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "serverTimeSpecified";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timeZoneName";
                break;
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
