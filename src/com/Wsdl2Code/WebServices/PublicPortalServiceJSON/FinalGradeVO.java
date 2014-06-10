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

public class FinalGradeVO implements KvmSerializable {
    
    public String commentValue;
    public String dateStored;
    public boolean dateStoredSpecified;
    public String grade;
    public long id;
    public boolean idSpecified;
    public double percent;
    public boolean percentSpecified;
    public long reportingTermId;
    public boolean reportingTermIdSpecified;
    public long sectionid;
    public boolean sectionidSpecified;
    public int storeType;
    public boolean storeTypeSpecified;
    
    public FinalGradeVO(){}
    
    public FinalGradeVO(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("commentValue"))
        {
            Object obj = soapObject.getProperty("commentValue");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                commentValue = j.toString();
            }else if (obj!= null && obj instanceof String){
                commentValue = (String) obj;
            }
        }
        if (soapObject.hasProperty("dateStored"))
        {
            Object obj = soapObject.getProperty("dateStored");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dateStored = j.toString();
            }else if (obj!= null && obj instanceof String){
                dateStored = (String) obj;
            }
        }
        if (soapObject.hasProperty("dateStoredSpecified"))
        {
            Object obj = soapObject.getProperty("dateStoredSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dateStoredSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                dateStoredSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("grade"))
        {
            Object obj = soapObject.getProperty("grade");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                grade = j.toString();
            }else if (obj!= null && obj instanceof String){
                grade = (String) obj;
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
        if (soapObject.hasProperty("percent"))
        {
            Object obj = soapObject.getProperty("percent");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                percent = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                percent = (Double) obj;
            }
        }
        if (soapObject.hasProperty("percentSpecified"))
        {
            Object obj = soapObject.getProperty("percentSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                percentSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                percentSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("reportingTermId"))
        {
            Object obj = soapObject.getProperty("reportingTermId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                reportingTermId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                reportingTermId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("reportingTermIdSpecified"))
        {
            Object obj = soapObject.getProperty("reportingTermIdSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                reportingTermIdSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                reportingTermIdSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("sectionid"))
        {
            Object obj = soapObject.getProperty("sectionid");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                sectionid = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                sectionid = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("sectionidSpecified"))
        {
            Object obj = soapObject.getProperty("sectionidSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                sectionidSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                sectionidSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("storeType"))
        {
            Object obj = soapObject.getProperty("storeType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                storeType = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                storeType = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("storeTypeSpecified"))
        {
            Object obj = soapObject.getProperty("storeTypeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                storeTypeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                storeTypeSpecified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return commentValue;
            case 1:
                return dateStored;
            case 2:
                return dateStoredSpecified;
            case 3:
                return grade;
            case 4:
                return id;
            case 5:
                return idSpecified;
            case 6:
                return percent;
            case 7:
                return percentSpecified;
            case 8:
                return reportingTermId;
            case 9:
                return reportingTermIdSpecified;
            case 10:
                return sectionid;
            case 11:
                return sectionidSpecified;
            case 12:
                return storeType;
            case 13:
                return storeTypeSpecified;
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
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "commentValue";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "dateStored";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "dateStoredSpecified";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "grade";
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
                info.type = Double.class;
                info.name = "percent";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "percentSpecified";
                break;
            case 8:
                info.type = Long.class;
                info.name = "reportingTermId";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "reportingTermIdSpecified";
                break;
            case 10:
                info.type = Long.class;
                info.name = "sectionid";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "sectionidSpecified";
                break;
            case 12:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "storeType";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "storeTypeSpecified";
                break;
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}