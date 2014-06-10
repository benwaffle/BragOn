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

public class AttendanceCodeVO implements KvmSerializable {
    
    public String attCode;
    public int codeType;
    public boolean codeTypeSpecified;
    public String description;
    public long id;
    public boolean idSpecified;
    public long schoolid;
    public boolean schoolidSpecified;
    public int sortorder;
    public boolean sortorderSpecified;
    public int yearid;
    public boolean yearidSpecified;
    
    public AttendanceCodeVO(){}
    
    public AttendanceCodeVO(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("attCode"))
        {
            Object obj = soapObject.getProperty("attCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                attCode = j.toString();
            }else if (obj!= null && obj instanceof String){
                attCode = (String) obj;
            }
        }
        if (soapObject.hasProperty("codeType"))
        {
            Object obj = soapObject.getProperty("codeType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codeType = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                codeType = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("codeTypeSpecified"))
        {
            Object obj = soapObject.getProperty("codeTypeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codeTypeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                codeTypeSpecified = (Boolean) obj;
            }
        }
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
        if (soapObject.hasProperty("schoolid"))
        {
            Object obj = soapObject.getProperty("schoolid");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                schoolid = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                schoolid = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("schoolidSpecified"))
        {
            Object obj = soapObject.getProperty("schoolidSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                schoolidSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                schoolidSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("sortorder"))
        {
            Object obj = soapObject.getProperty("sortorder");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                sortorder = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                sortorder = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("sortorderSpecified"))
        {
            Object obj = soapObject.getProperty("sortorderSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                sortorderSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                sortorderSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("yearid"))
        {
            Object obj = soapObject.getProperty("yearid");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                yearid = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                yearid = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("yearidSpecified"))
        {
            Object obj = soapObject.getProperty("yearidSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                yearidSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                yearidSpecified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return attCode;
            case 1:
                return codeType;
            case 2:
                return codeTypeSpecified;
            case 3:
                return description;
            case 4:
                return id;
            case 5:
                return idSpecified;
            case 6:
                return schoolid;
            case 7:
                return schoolidSpecified;
            case 8:
                return sortorder;
            case 9:
                return sortorderSpecified;
            case 10:
                return yearid;
            case 11:
                return yearidSpecified;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 12;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "attCode";
                break;
            case 1:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "codeType";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "codeTypeSpecified";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "description";
                break;
            case 4:
                info.type = Long.class;
                info.name = "id";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idSpecified";
                break;
            case 6:
                info.type = Long.class;
                info.name = "schoolid";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "schoolidSpecified";
                break;
            case 8:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "sortorder";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "sortorderSpecified";
                break;
            case 10:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "yearid";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "yearidSpecified";
                break;
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}