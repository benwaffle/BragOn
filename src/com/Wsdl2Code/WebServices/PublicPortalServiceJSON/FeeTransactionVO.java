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

public class FeeTransactionVO implements KvmSerializable {
    
    public double adjustment;
    public boolean adjustmentSpecified;
    public String courseName;
    public String courseNumber;
    public String creationdate;
    public boolean creationdateSpecified;
    public String dateValue;
    public boolean dateValueSpecified;
    public String departmentName;
    public String description;
    public double feeAmount;
    public boolean feeAmountSpecified;
    public double feeBalance;
    public boolean feeBalanceSpecified;
    public String feeCategoryName;
    public double feePaid;
    public boolean feePaidSpecified;
    public long feeTypeId;
    public boolean feeTypeIdSpecified;
    public String feeTypeName;
    public double feecharged;
    public boolean feechargedSpecified;
    public long groupTransactionId;
    public boolean groupTransactionIdSpecified;
    public long id;
    public boolean idSpecified;
    public String modificationdate;
    public boolean modificationdateSpecified;
    public double originalfee;
    public boolean originalfeeSpecified;
    public int priority;
    public boolean prioritySpecified;
    public int proRated;
    public boolean proRatedSpecified;
    public long schoolfeeId;
    public boolean schoolfeeIdSpecified;
    public long schoolid;
    public boolean schoolidSpecified;
    public long termid;
    public boolean termidSpecified;
    
    public FeeTransactionVO(){}
    
    public FeeTransactionVO(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("adjustment"))
        {
            Object obj = soapObject.getProperty("adjustment");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                adjustment = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                adjustment = (Double) obj;
            }
        }
        if (soapObject.hasProperty("adjustmentSpecified"))
        {
            Object obj = soapObject.getProperty("adjustmentSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                adjustmentSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                adjustmentSpecified = (Boolean) obj;
            }
        }
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
        if (soapObject.hasProperty("creationdate"))
        {
            Object obj = soapObject.getProperty("creationdate");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                creationdate = j.toString();
            }else if (obj!= null && obj instanceof String){
                creationdate = (String) obj;
            }
        }
        if (soapObject.hasProperty("creationdateSpecified"))
        {
            Object obj = soapObject.getProperty("creationdateSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                creationdateSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                creationdateSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("dateValue"))
        {
            Object obj = soapObject.getProperty("dateValue");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dateValue = j.toString();
            }else if (obj!= null && obj instanceof String){
                dateValue = (String) obj;
            }
        }
        if (soapObject.hasProperty("dateValueSpecified"))
        {
            Object obj = soapObject.getProperty("dateValueSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dateValueSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                dateValueSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("departmentName"))
        {
            Object obj = soapObject.getProperty("departmentName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                departmentName = j.toString();
            }else if (obj!= null && obj instanceof String){
                departmentName = (String) obj;
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
        if (soapObject.hasProperty("feeAmount"))
        {
            Object obj = soapObject.getProperty("feeAmount");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                feeAmount = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                feeAmount = (Double) obj;
            }
        }
        if (soapObject.hasProperty("feeAmountSpecified"))
        {
            Object obj = soapObject.getProperty("feeAmountSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                feeAmountSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                feeAmountSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("feeBalance"))
        {
            Object obj = soapObject.getProperty("feeBalance");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                feeBalance = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                feeBalance = (Double) obj;
            }
        }
        if (soapObject.hasProperty("feeBalanceSpecified"))
        {
            Object obj = soapObject.getProperty("feeBalanceSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                feeBalanceSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                feeBalanceSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("feeCategoryName"))
        {
            Object obj = soapObject.getProperty("feeCategoryName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                feeCategoryName = j.toString();
            }else if (obj!= null && obj instanceof String){
                feeCategoryName = (String) obj;
            }
        }
        if (soapObject.hasProperty("feePaid"))
        {
            Object obj = soapObject.getProperty("feePaid");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                feePaid = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                feePaid = (Double) obj;
            }
        }
        if (soapObject.hasProperty("feePaidSpecified"))
        {
            Object obj = soapObject.getProperty("feePaidSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                feePaidSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                feePaidSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("feeTypeId"))
        {
            Object obj = soapObject.getProperty("feeTypeId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                feeTypeId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                feeTypeId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("feeTypeIdSpecified"))
        {
            Object obj = soapObject.getProperty("feeTypeIdSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                feeTypeIdSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                feeTypeIdSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("feeTypeName"))
        {
            Object obj = soapObject.getProperty("feeTypeName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                feeTypeName = j.toString();
            }else if (obj!= null && obj instanceof String){
                feeTypeName = (String) obj;
            }
        }
        if (soapObject.hasProperty("feecharged"))
        {
            Object obj = soapObject.getProperty("feecharged");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                feecharged = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                feecharged = (Double) obj;
            }
        }
        if (soapObject.hasProperty("feechargedSpecified"))
        {
            Object obj = soapObject.getProperty("feechargedSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                feechargedSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                feechargedSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("groupTransactionId"))
        {
            Object obj = soapObject.getProperty("groupTransactionId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                groupTransactionId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                groupTransactionId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("groupTransactionIdSpecified"))
        {
            Object obj = soapObject.getProperty("groupTransactionIdSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                groupTransactionIdSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                groupTransactionIdSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("modificationdate"))
        {
            Object obj = soapObject.getProperty("modificationdate");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                modificationdate = j.toString();
            }else if (obj!= null && obj instanceof String){
                modificationdate = (String) obj;
            }
        }
        if (soapObject.hasProperty("modificationdateSpecified"))
        {
            Object obj = soapObject.getProperty("modificationdateSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                modificationdateSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                modificationdateSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("originalfee"))
        {
            Object obj = soapObject.getProperty("originalfee");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                originalfee = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                originalfee = (Double) obj;
            }
        }
        if (soapObject.hasProperty("originalfeeSpecified"))
        {
            Object obj = soapObject.getProperty("originalfeeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                originalfeeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                originalfeeSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("priority"))
        {
            Object obj = soapObject.getProperty("priority");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                priority = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                priority = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("prioritySpecified"))
        {
            Object obj = soapObject.getProperty("prioritySpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                prioritySpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                prioritySpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("proRated"))
        {
            Object obj = soapObject.getProperty("proRated");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                proRated = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                proRated = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("proRatedSpecified"))
        {
            Object obj = soapObject.getProperty("proRatedSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                proRatedSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                proRatedSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("schoolfeeId"))
        {
            Object obj = soapObject.getProperty("schoolfeeId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                schoolfeeId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                schoolfeeId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("schoolfeeIdSpecified"))
        {
            Object obj = soapObject.getProperty("schoolfeeIdSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                schoolfeeIdSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                schoolfeeIdSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("termid"))
        {
            Object obj = soapObject.getProperty("termid");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                termid = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                termid = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("termidSpecified"))
        {
            Object obj = soapObject.getProperty("termidSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                termidSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                termidSpecified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return adjustment;
            case 1:
                return adjustmentSpecified;
            case 2:
                return courseName;
            case 3:
                return courseNumber;
            case 4:
                return creationdate;
            case 5:
                return creationdateSpecified;
            case 6:
                return dateValue;
            case 7:
                return dateValueSpecified;
            case 8:
                return departmentName;
            case 9:
                return description;
            case 10:
                return feeAmount;
            case 11:
                return feeAmountSpecified;
            case 12:
                return feeBalance;
            case 13:
                return feeBalanceSpecified;
            case 14:
                return feeCategoryName;
            case 15:
                return feePaid;
            case 16:
                return feePaidSpecified;
            case 17:
                return feeTypeId;
            case 18:
                return feeTypeIdSpecified;
            case 19:
                return feeTypeName;
            case 20:
                return feecharged;
            case 21:
                return feechargedSpecified;
            case 22:
                return groupTransactionId;
            case 23:
                return groupTransactionIdSpecified;
            case 24:
                return id;
            case 25:
                return idSpecified;
            case 26:
                return modificationdate;
            case 27:
                return modificationdateSpecified;
            case 28:
                return originalfee;
            case 29:
                return originalfeeSpecified;
            case 30:
                return priority;
            case 31:
                return prioritySpecified;
            case 32:
                return proRated;
            case 33:
                return proRatedSpecified;
            case 34:
                return schoolfeeId;
            case 35:
                return schoolfeeIdSpecified;
            case 36:
                return schoolid;
            case 37:
                return schoolidSpecified;
            case 38:
                return termid;
            case 39:
                return termidSpecified;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 40;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = Double.class;
                info.name = "adjustment";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "adjustmentSpecified";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "courseName";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "courseNumber";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "creationdate";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "creationdateSpecified";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "dateValue";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "dateValueSpecified";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "departmentName";
                break;
            case 9:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "description";
                break;
            case 10:
                info.type = Double.class;
                info.name = "feeAmount";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "feeAmountSpecified";
                break;
            case 12:
                info.type = Double.class;
                info.name = "feeBalance";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "feeBalanceSpecified";
                break;
            case 14:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "feeCategoryName";
                break;
            case 15:
                info.type = Double.class;
                info.name = "feePaid";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "feePaidSpecified";
                break;
            case 17:
                info.type = Long.class;
                info.name = "feeTypeId";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "feeTypeIdSpecified";
                break;
            case 19:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "feeTypeName";
                break;
            case 20:
                info.type = Double.class;
                info.name = "feecharged";
                break;
            case 21:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "feechargedSpecified";
                break;
            case 22:
                info.type = Long.class;
                info.name = "groupTransactionId";
                break;
            case 23:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "groupTransactionIdSpecified";
                break;
            case 24:
                info.type = Long.class;
                info.name = "id";
                break;
            case 25:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idSpecified";
                break;
            case 26:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "modificationdate";
                break;
            case 27:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "modificationdateSpecified";
                break;
            case 28:
                info.type = Double.class;
                info.name = "originalfee";
                break;
            case 29:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "originalfeeSpecified";
                break;
            case 30:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "priority";
                break;
            case 31:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "prioritySpecified";
                break;
            case 32:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "proRated";
                break;
            case 33:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "proRatedSpecified";
                break;
            case 34:
                info.type = Long.class;
                info.name = "schoolfeeId";
                break;
            case 35:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "schoolfeeIdSpecified";
                break;
            case 36:
                info.type = Long.class;
                info.name = "schoolid";
                break;
            case 37:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "schoolidSpecified";
                break;
            case 38:
                info.type = Long.class;
                info.name = "termid";
                break;
            case 39:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "termidSpecified";
                break;
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
