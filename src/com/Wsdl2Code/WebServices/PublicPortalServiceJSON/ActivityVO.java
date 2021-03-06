package com.Wsdl2Code.WebServices.PublicPortalServiceJSON;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.5
//
// Date Of Creation: 6/12/2014 1:13:09 AM
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

public class ActivityVO implements KvmSerializable {
    
    public String category;
    public long id;
    public boolean idSpecified;
    public String name;
    public boolean required;
    public boolean requiredSpecified;
    
    public ActivityVO(){}
    
    public ActivityVO(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("category"))
        {
            Object obj = soapObject.getProperty("category");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                category = j.toString();
            }else if (obj!= null && obj instanceof String){
                category = (String) obj;
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
        if (soapObject.hasProperty("required"))
        {
            Object obj = soapObject.getProperty("required");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                required = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                required = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("requiredSpecified"))
        {
            Object obj = soapObject.getProperty("requiredSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                requiredSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                requiredSpecified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return category;
            case 1:
                return id;
            case 2:
                return idSpecified;
            case 3:
                return name;
            case 4:
                return required;
            case 5:
                return requiredSpecified;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 6;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "category";
                break;
            case 1:
                info.type = Long.class;
                info.name = "id";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idSpecified";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "name";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "required";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "requiredSpecified";
                break;
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
