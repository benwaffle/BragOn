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

public class TermVO implements KvmSerializable {
    
    public String abbrev;
    public String endDate;
    public boolean endDateSpecified;
    public long id;
    public boolean idSpecified;
    public long parentTermId;
    public boolean parentTermIdSpecified;
    public String schoolNumber;
    public String startDate;
    public boolean startDateSpecified;
    public String title;
    
    public TermVO(){}
    
    public TermVO(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("abbrev"))
        {
            Object obj = soapObject.getProperty("abbrev");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                abbrev = j.toString();
            }else if (obj!= null && obj instanceof String){
                abbrev = (String) obj;
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
        if (soapObject.hasProperty("parentTermId"))
        {
            Object obj = soapObject.getProperty("parentTermId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                parentTermId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                parentTermId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("parentTermIdSpecified"))
        {
            Object obj = soapObject.getProperty("parentTermIdSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                parentTermIdSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                parentTermIdSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("schoolNumber"))
        {
            Object obj = soapObject.getProperty("schoolNumber");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                schoolNumber = j.toString();
            }else if (obj!= null && obj instanceof String){
                schoolNumber = (String) obj;
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
        if (soapObject.hasProperty("title"))
        {
            Object obj = soapObject.getProperty("title");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                title = j.toString();
            }else if (obj!= null && obj instanceof String){
                title = (String) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return abbrev;
            case 1:
                return endDate;
            case 2:
                return endDateSpecified;
            case 3:
                return id;
            case 4:
                return idSpecified;
            case 5:
                return parentTermId;
            case 6:
                return parentTermIdSpecified;
            case 7:
                return schoolNumber;
            case 8:
                return startDate;
            case 9:
                return startDateSpecified;
            case 10:
                return title;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 11;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "abbrev";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "endDate";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "endDateSpecified";
                break;
            case 3:
                info.type = Long.class;
                info.name = "id";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idSpecified";
                break;
            case 5:
                info.type = Long.class;
                info.name = "parentTermId";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "parentTermIdSpecified";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "schoolNumber";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "startDate";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "startDateSpecified";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "title";
                break;
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}