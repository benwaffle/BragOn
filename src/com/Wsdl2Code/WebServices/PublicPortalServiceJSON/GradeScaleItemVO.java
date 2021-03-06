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

public class GradeScaleItemVO implements KvmSerializable {
    
    public double cutoffPercent;
    public boolean cutoffPercentSpecified;
    public boolean defaultZeroCutoff;
    public boolean defaultZeroCutoffSpecified;
    public String description;
    public String gradeLabel;
    public long id;
    public boolean idSpecified;
    public double percentValue;
    public boolean percentValueSpecified;
    public double pointsValue;
    public boolean pointsValueSpecified;
    public int sortOrder;
    public boolean sortOrderSpecified;
    
    public GradeScaleItemVO(){}
    
    public GradeScaleItemVO(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("cutoffPercent"))
        {
            Object obj = soapObject.getProperty("cutoffPercent");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                cutoffPercent = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                cutoffPercent = (Double) obj;
            }
        }
        if (soapObject.hasProperty("cutoffPercentSpecified"))
        {
            Object obj = soapObject.getProperty("cutoffPercentSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                cutoffPercentSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                cutoffPercentSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("defaultZeroCutoff"))
        {
            Object obj = soapObject.getProperty("defaultZeroCutoff");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                defaultZeroCutoff = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                defaultZeroCutoff = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("defaultZeroCutoffSpecified"))
        {
            Object obj = soapObject.getProperty("defaultZeroCutoffSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                defaultZeroCutoffSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                defaultZeroCutoffSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("gradeLabel"))
        {
            Object obj = soapObject.getProperty("gradeLabel");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                gradeLabel = j.toString();
            }else if (obj!= null && obj instanceof String){
                gradeLabel = (String) obj;
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
        if (soapObject.hasProperty("percentValue"))
        {
            Object obj = soapObject.getProperty("percentValue");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                percentValue = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                percentValue = (Double) obj;
            }
        }
        if (soapObject.hasProperty("percentValueSpecified"))
        {
            Object obj = soapObject.getProperty("percentValueSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                percentValueSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                percentValueSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("pointsValue"))
        {
            Object obj = soapObject.getProperty("pointsValue");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pointsValue = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                pointsValue = (Double) obj;
            }
        }
        if (soapObject.hasProperty("pointsValueSpecified"))
        {
            Object obj = soapObject.getProperty("pointsValueSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pointsValueSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                pointsValueSpecified = (Boolean) obj;
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
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return cutoffPercent;
            case 1:
                return cutoffPercentSpecified;
            case 2:
                return defaultZeroCutoff;
            case 3:
                return defaultZeroCutoffSpecified;
            case 4:
                return description;
            case 5:
                return gradeLabel;
            case 6:
                return id;
            case 7:
                return idSpecified;
            case 8:
                return percentValue;
            case 9:
                return percentValueSpecified;
            case 10:
                return pointsValue;
            case 11:
                return pointsValueSpecified;
            case 12:
                return sortOrder;
            case 13:
                return sortOrderSpecified;
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
                info.type = Double.class;
                info.name = "cutoffPercent";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "cutoffPercentSpecified";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "defaultZeroCutoff";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "defaultZeroCutoffSpecified";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "description";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "gradeLabel";
                break;
            case 6:
                info.type = Long.class;
                info.name = "id";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idSpecified";
                break;
            case 8:
                info.type = Double.class;
                info.name = "percentValue";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "percentValueSpecified";
                break;
            case 10:
                info.type = Double.class;
                info.name = "pointsValue";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "pointsValueSpecified";
                break;
            case 12:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "sortOrder";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "sortOrderSpecified";
                break;
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
