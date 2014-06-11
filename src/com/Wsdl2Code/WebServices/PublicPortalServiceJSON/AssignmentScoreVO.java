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

public class AssignmentScoreVO implements KvmSerializable {
    
    public long assignmentId;
    public boolean assignmentIdSpecified;
    public boolean collected;
    public boolean collectedSpecified;
    public String comment;
    public boolean exempt;
    public boolean exemptSpecified;
    public long id;
    public boolean idSpecified;
    public boolean late;
    public boolean lateSpecified;
    public String letterGrade;
    public boolean missing;
    public boolean missingSpecified;
    public String percent;
    public String score;
    public int scoretype;
    public boolean scoretypeSpecified;
    
    public AssignmentScoreVO(){}
    
    public AssignmentScoreVO(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("assignmentId"))
        {
            Object obj = soapObject.getProperty("assignmentId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                assignmentId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                assignmentId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("assignmentIdSpecified"))
        {
            Object obj = soapObject.getProperty("assignmentIdSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                assignmentIdSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                assignmentIdSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("collected"))
        {
            Object obj = soapObject.getProperty("collected");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                collected = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                collected = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("collectedSpecified"))
        {
            Object obj = soapObject.getProperty("collectedSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                collectedSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                collectedSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("comment"))
        {
            Object obj = soapObject.getProperty("comment");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                comment = j.toString();
            }else if (obj!= null && obj instanceof String){
                comment = (String) obj;
            }
        }
        if (soapObject.hasProperty("exempt"))
        {
            Object obj = soapObject.getProperty("exempt");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                exempt = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                exempt = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("exemptSpecified"))
        {
            Object obj = soapObject.getProperty("exemptSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                exemptSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                exemptSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("late"))
        {
            Object obj = soapObject.getProperty("late");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                late = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                late = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("lateSpecified"))
        {
            Object obj = soapObject.getProperty("lateSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                lateSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                lateSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("letterGrade"))
        {
            Object obj = soapObject.getProperty("letterGrade");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                letterGrade = j.toString();
            }else if (obj!= null && obj instanceof String){
                letterGrade = (String) obj;
            }
        }
        if (soapObject.hasProperty("missing"))
        {
            Object obj = soapObject.getProperty("missing");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                missing = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                missing = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("missingSpecified"))
        {
            Object obj = soapObject.getProperty("missingSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                missingSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                missingSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("percent"))
        {
            Object obj = soapObject.getProperty("percent");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                percent = j.toString();
            }else if (obj!= null && obj instanceof String){
                percent = (String) obj;
            }
        }
        if (soapObject.hasProperty("score"))
        {
            Object obj = soapObject.getProperty("score");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                score = j.toString();
            }else if (obj!= null && obj instanceof String){
                score = (String) obj;
            }
        }
        if (soapObject.hasProperty("scoretype"))
        {
            Object obj = soapObject.getProperty("scoretype");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                scoretype = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                scoretype = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("scoretypeSpecified"))
        {
            Object obj = soapObject.getProperty("scoretypeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                scoretypeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                scoretypeSpecified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return assignmentId;
            case 1:
                return assignmentIdSpecified;
            case 2:
                return collected;
            case 3:
                return collectedSpecified;
            case 4:
                return comment;
            case 5:
                return exempt;
            case 6:
                return exemptSpecified;
            case 7:
                return id;
            case 8:
                return idSpecified;
            case 9:
                return late;
            case 10:
                return lateSpecified;
            case 11:
                return letterGrade;
            case 12:
                return missing;
            case 13:
                return missingSpecified;
            case 14:
                return percent;
            case 15:
                return score;
            case 16:
                return scoretype;
            case 17:
                return scoretypeSpecified;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 18;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = Long.class;
                info.name = "assignmentId";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "assignmentIdSpecified";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "collected";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "collectedSpecified";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "comment";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "exempt";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "exemptSpecified";
                break;
            case 7:
                info.type = Long.class;
                info.name = "id";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idSpecified";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "late";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "lateSpecified";
                break;
            case 11:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "letterGrade";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "missing";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "missingSpecified";
                break;
            case 14:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "percent";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "score";
                break;
            case 16:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "scoretype";
                break;
            case 17:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "scoretypeSpecified";
                break;
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
