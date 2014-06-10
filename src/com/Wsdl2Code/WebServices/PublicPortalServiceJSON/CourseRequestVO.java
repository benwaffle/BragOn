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

public class CourseRequestVO implements KvmSerializable {
    
    public String courseName;
    public String courseNumber;
    public float creditHours;
    public boolean creditHoursSpecified;
    
    public CourseRequestVO(){}
    
    public CourseRequestVO(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("courseName"))
        {
            Object obj = soapObject.getProperty("courseName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                courseName = j.toString();
            }else if (obj!= null && obj instanceof String){
                courseName = (String) obj;
            }
        }
        if (soapObject.hasProperty("courseNumber"))
        {
            Object obj = soapObject.getProperty("courseNumber");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                courseNumber = j.toString();
            }else if (obj!= null && obj instanceof String){
                courseNumber = (String) obj;
            }
        }
        if (soapObject.hasProperty("creditHours"))
        {
            Object obj = soapObject.getProperty("creditHours");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                creditHours = Float.parseFloat(j.toString());
            }else if (obj!= null && obj instanceof Number){
                creditHours = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("creditHoursSpecified"))
        {
            Object obj = soapObject.getProperty("creditHoursSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                creditHoursSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                creditHoursSpecified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return courseName;
            case 1:
                return courseNumber;
            case 2:
                return creditHours;
            case 3:
                return creditHoursSpecified;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 4;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "courseName";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "courseNumber";
                break;
            case 2:
                info.type = Float.class;
                info.name = "creditHours";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "creditHoursSpecified";
                break;
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}