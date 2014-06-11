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

public class PeriodVO implements KvmSerializable {
    
    public String abbreviation;
    public long id;
    public boolean idSpecified;
    public String name;
    public int periodNumber;
    public boolean periodNumberSpecified;
    public long schoolid;
    public boolean schoolidSpecified;
    public int sortOrder;
    public boolean sortOrderSpecified;
    public int yearid;
    public boolean yearidSpecified;
    
    public PeriodVO(){}
    
    public PeriodVO(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("abbreviation"))
        {
            Object obj = soapObject.getProperty("abbreviation");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                abbreviation = j.toString();
            }else if (obj!= null && obj instanceof String){
                abbreviation = (String) obj;
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
        if (soapObject.hasProperty("periodNumber"))
        {
            Object obj = soapObject.getProperty("periodNumber");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                periodNumber = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                periodNumber = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("periodNumberSpecified"))
        {
            Object obj = soapObject.getProperty("periodNumberSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                periodNumberSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                periodNumberSpecified = (Boolean) obj;
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
                return abbreviation;
            case 1:
                return id;
            case 2:
                return idSpecified;
            case 3:
                return name;
            case 4:
                return periodNumber;
            case 5:
                return periodNumberSpecified;
            case 6:
                return schoolid;
            case 7:
                return schoolidSpecified;
            case 8:
                return sortOrder;
            case 9:
                return sortOrderSpecified;
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
                info.name = "abbreviation";
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
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "periodNumber";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "periodNumberSpecified";
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
                info.name = "sortOrder";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "sortOrderSpecified";
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
