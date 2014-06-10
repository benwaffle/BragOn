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

public class CourseRequestRulesVO implements KvmSerializable {
    
    public String description;
    public double maxCredits;
    public boolean maxCreditsSpecified;
    public double minCredits;
    public boolean minCreditsSpecified;
    
    public CourseRequestRulesVO(){}
    
    public CourseRequestRulesVO(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("description"))
        {
            Object obj = soapObject.getProperty("description");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                description = j.toString();
            }else if (obj!= null && obj instanceof String){
                description = (String) obj;
            }
        }
        if (soapObject.hasProperty("maxCredits"))
        {
            Object obj = soapObject.getProperty("maxCredits");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                maxCredits = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                maxCredits = (Double) obj;
            }
        }
        if (soapObject.hasProperty("maxCreditsSpecified"))
        {
            Object obj = soapObject.getProperty("maxCreditsSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                maxCreditsSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                maxCreditsSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("minCredits"))
        {
            Object obj = soapObject.getProperty("minCredits");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                minCredits = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                minCredits = (Double) obj;
            }
        }
        if (soapObject.hasProperty("minCreditsSpecified"))
        {
            Object obj = soapObject.getProperty("minCreditsSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                minCreditsSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                minCreditsSpecified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return description;
            case 1:
                return maxCredits;
            case 2:
                return maxCreditsSpecified;
            case 3:
                return minCredits;
            case 4:
                return minCreditsSpecified;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 5;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "description";
                break;
            case 1:
                info.type = Double.class;
                info.name = "maxCredits";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "maxCreditsSpecified";
                break;
            case 3:
                info.type = Double.class;
                info.name = "minCredits";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "minCreditsSpecified";
                break;
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
