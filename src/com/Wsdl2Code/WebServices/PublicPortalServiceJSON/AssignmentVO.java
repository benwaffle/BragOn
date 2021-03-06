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

public class AssignmentVO implements KvmSerializable {
    
    public String abbreviation;
    public long assignmentid;
    public boolean assignmentidSpecified;
    public int categoryId;
    public boolean categoryIdSpecified;
    public String description;
    public String dueDate;
    public boolean dueDateSpecified;
    public long id;
    public boolean idSpecified;
    public int includeinfinalgrades;
    public boolean includeinfinalgradesSpecified;
    public String name;
    public double pointspossible;
    public boolean pointspossibleSpecified;
    public int publishDaysBeforeDue;
    public boolean publishDaysBeforeDueSpecified;
    public int publishState;
    public boolean publishStateSpecified;
    public String publishonspecificdate;
    public boolean publishonspecificdateSpecified;
    public int publishscores;
    public boolean publishscoresSpecified;
    public long sectionid;
    public boolean sectionidSpecified;
    public int type;
    public boolean typeSpecified;
    public double weight;
    public boolean weightSpecified;
    
    public AssignmentVO(){}
    
    public AssignmentVO(SoapObject soapObject)
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
        if (soapObject.hasProperty("assignmentid"))
        {
            Object obj = soapObject.getProperty("assignmentid");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                assignmentid = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                assignmentid = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("assignmentidSpecified"))
        {
            Object obj = soapObject.getProperty("assignmentidSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                assignmentidSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                assignmentidSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("categoryId"))
        {
            Object obj = soapObject.getProperty("categoryId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                categoryId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                categoryId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("categoryIdSpecified"))
        {
            Object obj = soapObject.getProperty("categoryIdSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                categoryIdSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                categoryIdSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("dueDate"))
        {
            Object obj = soapObject.getProperty("dueDate");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dueDate = j.toString();
            }else if (obj!= null && obj instanceof String){
                dueDate = (String) obj;
            }
        }
        if (soapObject.hasProperty("dueDateSpecified"))
        {
            Object obj = soapObject.getProperty("dueDateSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dueDateSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                dueDateSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("includeinfinalgrades"))
        {
            Object obj = soapObject.getProperty("includeinfinalgrades");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                includeinfinalgrades = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                includeinfinalgrades = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("includeinfinalgradesSpecified"))
        {
            Object obj = soapObject.getProperty("includeinfinalgradesSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                includeinfinalgradesSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                includeinfinalgradesSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("pointspossible"))
        {
            Object obj = soapObject.getProperty("pointspossible");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pointspossible = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                pointspossible = (Double) obj;
            }
        }
        if (soapObject.hasProperty("pointspossibleSpecified"))
        {
            Object obj = soapObject.getProperty("pointspossibleSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pointspossibleSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                pointspossibleSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("publishDaysBeforeDue"))
        {
            Object obj = soapObject.getProperty("publishDaysBeforeDue");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                publishDaysBeforeDue = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                publishDaysBeforeDue = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("publishDaysBeforeDueSpecified"))
        {
            Object obj = soapObject.getProperty("publishDaysBeforeDueSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                publishDaysBeforeDueSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                publishDaysBeforeDueSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("publishState"))
        {
            Object obj = soapObject.getProperty("publishState");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                publishState = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                publishState = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("publishStateSpecified"))
        {
            Object obj = soapObject.getProperty("publishStateSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                publishStateSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                publishStateSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("publishonspecificdate"))
        {
            Object obj = soapObject.getProperty("publishonspecificdate");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                publishonspecificdate = j.toString();
            }else if (obj!= null && obj instanceof String){
                publishonspecificdate = (String) obj;
            }
        }
        if (soapObject.hasProperty("publishonspecificdateSpecified"))
        {
            Object obj = soapObject.getProperty("publishonspecificdateSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                publishonspecificdateSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                publishonspecificdateSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("publishscores"))
        {
            Object obj = soapObject.getProperty("publishscores");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                publishscores = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                publishscores = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("publishscoresSpecified"))
        {
            Object obj = soapObject.getProperty("publishscoresSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                publishscoresSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                publishscoresSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("type"))
        {
            Object obj = soapObject.getProperty("type");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                type = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                type = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("typeSpecified"))
        {
            Object obj = soapObject.getProperty("typeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                typeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                typeSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("weight"))
        {
            Object obj = soapObject.getProperty("weight");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                weight = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                weight = (Double) obj;
            }
        }
        if (soapObject.hasProperty("weightSpecified"))
        {
            Object obj = soapObject.getProperty("weightSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                weightSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                weightSpecified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return abbreviation;
            case 1:
                return assignmentid;
            case 2:
                return assignmentidSpecified;
            case 3:
                return categoryId;
            case 4:
                return categoryIdSpecified;
            case 5:
                return description;
            case 6:
                return dueDate;
            case 7:
                return dueDateSpecified;
            case 8:
                return id;
            case 9:
                return idSpecified;
            case 10:
                return includeinfinalgrades;
            case 11:
                return includeinfinalgradesSpecified;
            case 12:
                return name;
            case 13:
                return pointspossible;
            case 14:
                return pointspossibleSpecified;
            case 15:
                return publishDaysBeforeDue;
            case 16:
                return publishDaysBeforeDueSpecified;
            case 17:
                return publishState;
            case 18:
                return publishStateSpecified;
            case 19:
                return publishonspecificdate;
            case 20:
                return publishonspecificdateSpecified;
            case 21:
                return publishscores;
            case 22:
                return publishscoresSpecified;
            case 23:
                return sectionid;
            case 24:
                return sectionidSpecified;
            case 25:
                return type;
            case 26:
                return typeSpecified;
            case 27:
                return weight;
            case 28:
                return weightSpecified;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 29;
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
                info.name = "assignmentid";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "assignmentidSpecified";
                break;
            case 3:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "categoryId";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "categoryIdSpecified";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "description";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "dueDate";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "dueDateSpecified";
                break;
            case 8:
                info.type = Long.class;
                info.name = "id";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idSpecified";
                break;
            case 10:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "includeinfinalgrades";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "includeinfinalgradesSpecified";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "name";
                break;
            case 13:
                info.type = Double.class;
                info.name = "pointspossible";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "pointspossibleSpecified";
                break;
            case 15:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "publishDaysBeforeDue";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "publishDaysBeforeDueSpecified";
                break;
            case 17:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "publishState";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "publishStateSpecified";
                break;
            case 19:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "publishonspecificdate";
                break;
            case 20:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "publishonspecificdateSpecified";
                break;
            case 21:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "publishscores";
                break;
            case 22:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "publishscoresSpecified";
                break;
            case 23:
                info.type = Long.class;
                info.name = "sectionid";
                break;
            case 24:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "sectionidSpecified";
                break;
            case 25:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "type";
                break;
            case 26:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "typeSpecified";
                break;
            case 27:
                info.type = Double.class;
                info.name = "weight";
                break;
            case 28:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "weightSpecified";
                break;
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
