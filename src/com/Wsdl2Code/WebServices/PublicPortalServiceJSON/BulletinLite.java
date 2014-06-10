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

public class BulletinLite implements KvmSerializable {
    
    public long audience;
    public boolean audienceSpecified;
    public String body;
    public String endDate;
    public boolean endDateSpecified;
    public long id;
    public boolean idSpecified;
    public String name;
    public long schoolId;
    public boolean schoolIdSpecified;
    public int sortOrder;
    public boolean sortOrderSpecified;
    public String startDate;
    public boolean startDateSpecified;
    
    public BulletinLite(){}
    
    public BulletinLite(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("audience"))
        {
            Object obj = soapObject.getProperty("audience");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                audience = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                audience = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("audienceSpecified"))
        {
            Object obj = soapObject.getProperty("audienceSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                audienceSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                audienceSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("body"))
        {
            Object obj = soapObject.getProperty("body");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                body = j.toString();
            }else if (obj!= null && obj instanceof String){
                body = (String) obj;
            }
        }
        if (soapObject.hasProperty("endDate"))
        {
            Object obj = soapObject.getProperty("endDate");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                endDate = j.toString();
            }else if (obj!= null && obj instanceof String){
                endDate = (String) obj;
            }
        }
        if (soapObject.hasProperty("endDateSpecified"))
        {
            Object obj = soapObject.getProperty("endDateSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                endDateSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                endDateSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("id"))
        {
            Object obj = soapObject.getProperty("id");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                id = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                id = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("idSpecified"))
        {
            Object obj = soapObject.getProperty("idSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("name"))
        {
            Object obj = soapObject.getProperty("name");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                name = j.toString();
            }else if (obj!= null && obj instanceof String){
                name = (String) obj;
            }
        }
        if (soapObject.hasProperty("schoolId"))
        {
            Object obj = soapObject.getProperty("schoolId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                schoolId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                schoolId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("schoolIdSpecified"))
        {
            Object obj = soapObject.getProperty("schoolIdSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                schoolIdSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                schoolIdSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("sortOrder"))
        {
            Object obj = soapObject.getProperty("sortOrder");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                sortOrder = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                sortOrder = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("sortOrderSpecified"))
        {
            Object obj = soapObject.getProperty("sortOrderSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                sortOrderSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                sortOrderSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("startDate"))
        {
            Object obj = soapObject.getProperty("startDate");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                startDate = j.toString();
            }else if (obj!= null && obj instanceof String){
                startDate = (String) obj;
            }
        }
        if (soapObject.hasProperty("startDateSpecified"))
        {
            Object obj = soapObject.getProperty("startDateSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                startDateSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                startDateSpecified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return audience;
            case 1:
                return audienceSpecified;
            case 2:
                return body;
            case 3:
                return endDate;
            case 4:
                return endDateSpecified;
            case 5:
                return id;
            case 6:
                return idSpecified;
            case 7:
                return name;
            case 8:
                return schoolId;
            case 9:
                return schoolIdSpecified;
            case 10:
                return sortOrder;
            case 11:
                return sortOrderSpecified;
            case 12:
                return startDate;
            case 13:
                return startDateSpecified;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 14;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = Long.class;
                info.name = "audience";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "audienceSpecified";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "body";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "endDate";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "endDateSpecified";
                break;
            case 5:
                info.type = Long.class;
                info.name = "id";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idSpecified";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "name";
                break;
            case 8:
                info.type = Long.class;
                info.name = "schoolId";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "schoolIdSpecified";
                break;
            case 10:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "sortOrder";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "sortOrderSpecified";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "startDate";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "startDateSpecified";
                break;
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
