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

public class StartStopDateVO implements KvmSerializable {
    
    public long sectionEnrollmentId;
    public boolean sectionEnrollmentIdSpecified;
    public String start;
    public boolean startSpecified;
    public String stop;
    public boolean stopSpecified;
    
    public StartStopDateVO(){}
    
    public StartStopDateVO(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("sectionEnrollmentId"))
        {
            Object obj = soapObject.getProperty("sectionEnrollmentId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                sectionEnrollmentId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                sectionEnrollmentId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("sectionEnrollmentIdSpecified"))
        {
            Object obj = soapObject.getProperty("sectionEnrollmentIdSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                sectionEnrollmentIdSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                sectionEnrollmentIdSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("start"))
        {
            Object obj = soapObject.getProperty("start");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                start = j.toString();
            }else if (obj!= null && obj instanceof String){
                start = (String) obj;
            }
        }
        if (soapObject.hasProperty("startSpecified"))
        {
            Object obj = soapObject.getProperty("startSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                startSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                startSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("stop"))
        {
            Object obj = soapObject.getProperty("stop");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                stop = j.toString();
            }else if (obj!= null && obj instanceof String){
                stop = (String) obj;
            }
        }
        if (soapObject.hasProperty("stopSpecified"))
        {
            Object obj = soapObject.getProperty("stopSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                stopSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                stopSpecified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return sectionEnrollmentId;
            case 1:
                return sectionEnrollmentIdSpecified;
            case 2:
                return start;
            case 3:
                return startSpecified;
            case 4:
                return stop;
            case 5:
                return stopSpecified;
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
                info.type = Long.class;
                info.name = "sectionEnrollmentId";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "sectionEnrollmentIdSpecified";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "start";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "startSpecified";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "stop";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "stopSpecified";
                break;
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
