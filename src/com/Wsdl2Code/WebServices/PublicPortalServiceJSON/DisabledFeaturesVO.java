package com.Wsdl2Code.WebServices.PublicPortalServiceJSON;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.5
//
// Date Of Creation: 6/12/2014 1:13:10 AM
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

public class DisabledFeaturesVO implements KvmSerializable {
    
    public boolean activities;
    public boolean activitiesSpecified;
    public boolean assignments;
    public boolean assignmentsSpecified;
    public boolean attendance;
    public boolean attendanceSpecified;
    public boolean citizenship;
    public boolean citizenshipSpecified;
    public boolean currentGpa;
    public boolean currentGpaSpecified;
    public boolean emailalerts;
    public boolean emailalertsSpecified;
    public boolean fees;
    public boolean feesSpecified;
    public boolean finalGrades;
    public boolean finalGradesSpecified;
    public boolean meals;
    public boolean mealsSpecified;
    public boolean standards;
    public boolean standardsSpecified;
    
    public DisabledFeaturesVO(){}
    
    public DisabledFeaturesVO(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("activities"))
        {
            Object obj = soapObject.getProperty("activities");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                activities = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                activities = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("activitiesSpecified"))
        {
            Object obj = soapObject.getProperty("activitiesSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                activitiesSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                activitiesSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("assignments"))
        {
            Object obj = soapObject.getProperty("assignments");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                assignments = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                assignments = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("assignmentsSpecified"))
        {
            Object obj = soapObject.getProperty("assignmentsSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                assignmentsSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                assignmentsSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("attendance"))
        {
            Object obj = soapObject.getProperty("attendance");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                attendance = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                attendance = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("attendanceSpecified"))
        {
            Object obj = soapObject.getProperty("attendanceSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                attendanceSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                attendanceSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("citizenship"))
        {
            Object obj = soapObject.getProperty("citizenship");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                citizenship = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                citizenship = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("citizenshipSpecified"))
        {
            Object obj = soapObject.getProperty("citizenshipSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                citizenshipSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                citizenshipSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("currentGpa"))
        {
            Object obj = soapObject.getProperty("currentGpa");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                currentGpa = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                currentGpa = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("currentGpaSpecified"))
        {
            Object obj = soapObject.getProperty("currentGpaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                currentGpaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                currentGpaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("emailalerts"))
        {
            Object obj = soapObject.getProperty("emailalerts");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                emailalerts = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                emailalerts = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("emailalertsSpecified"))
        {
            Object obj = soapObject.getProperty("emailalertsSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                emailalertsSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                emailalertsSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("fees"))
        {
            Object obj = soapObject.getProperty("fees");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fees = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fees = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("feesSpecified"))
        {
            Object obj = soapObject.getProperty("feesSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                feesSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                feesSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("finalGrades"))
        {
            Object obj = soapObject.getProperty("finalGrades");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                finalGrades = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                finalGrades = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("finalGradesSpecified"))
        {
            Object obj = soapObject.getProperty("finalGradesSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                finalGradesSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                finalGradesSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("meals"))
        {
            Object obj = soapObject.getProperty("meals");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                meals = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                meals = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("mealsSpecified"))
        {
            Object obj = soapObject.getProperty("mealsSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                mealsSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                mealsSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("standards"))
        {
            Object obj = soapObject.getProperty("standards");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                standards = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                standards = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("standardsSpecified"))
        {
            Object obj = soapObject.getProperty("standardsSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                standardsSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                standardsSpecified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return activities;
            case 1:
                return activitiesSpecified;
            case 2:
                return assignments;
            case 3:
                return assignmentsSpecified;
            case 4:
                return attendance;
            case 5:
                return attendanceSpecified;
            case 6:
                return citizenship;
            case 7:
                return citizenshipSpecified;
            case 8:
                return currentGpa;
            case 9:
                return currentGpaSpecified;
            case 10:
                return emailalerts;
            case 11:
                return emailalertsSpecified;
            case 12:
                return fees;
            case 13:
                return feesSpecified;
            case 14:
                return finalGrades;
            case 15:
                return finalGradesSpecified;
            case 16:
                return meals;
            case 17:
                return mealsSpecified;
            case 18:
                return standards;
            case 19:
                return standardsSpecified;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 20;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "activities";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "activitiesSpecified";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "assignments";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "assignmentsSpecified";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "attendance";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "attendanceSpecified";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "citizenship";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "citizenshipSpecified";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "currentGpa";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "currentGpaSpecified";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "emailalerts";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "emailalertsSpecified";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fees";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "feesSpecified";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "finalGrades";
                break;
            case 15:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "finalGradesSpecified";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "meals";
                break;
            case 17:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "mealsSpecified";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "standards";
                break;
            case 19:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "standardsSpecified";
                break;
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
