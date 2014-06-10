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

public class LunchTransactionVO implements KvmSerializable {
    
    public double cash;
    public boolean cashSpecified;
    public double credit;
    public boolean creditSpecified;
    public String dateValue;
    public boolean dateValueSpecified;
    public double debit;
    public boolean debitSpecified;
    public String description;
    public long id;
    public boolean idSpecified;
    public double mealprice;
    public boolean mealpriceSpecified;
    public double neteffect;
    public boolean neteffectSpecified;
    public int time;
    public boolean timeSpecified;
    
    public LunchTransactionVO(){}
    
    public LunchTransactionVO(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("cash"))
        {
            Object obj = soapObject.getProperty("cash");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                cash = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                cash = (Double) obj;
            }
        }
        if (soapObject.hasProperty("cashSpecified"))
        {
            Object obj = soapObject.getProperty("cashSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                cashSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                cashSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("credit"))
        {
            Object obj = soapObject.getProperty("credit");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                credit = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                credit = (Double) obj;
            }
        }
        if (soapObject.hasProperty("creditSpecified"))
        {
            Object obj = soapObject.getProperty("creditSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                creditSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                creditSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("debit"))
        {
            Object obj = soapObject.getProperty("debit");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                debit = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                debit = (Double) obj;
            }
        }
        if (soapObject.hasProperty("debitSpecified"))
        {
            Object obj = soapObject.getProperty("debitSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                debitSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                debitSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("mealprice"))
        {
            Object obj = soapObject.getProperty("mealprice");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                mealprice = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                mealprice = (Double) obj;
            }
        }
        if (soapObject.hasProperty("mealpriceSpecified"))
        {
            Object obj = soapObject.getProperty("mealpriceSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                mealpriceSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                mealpriceSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("neteffect"))
        {
            Object obj = soapObject.getProperty("neteffect");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                neteffect = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                neteffect = (Double) obj;
            }
        }
        if (soapObject.hasProperty("neteffectSpecified"))
        {
            Object obj = soapObject.getProperty("neteffectSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                neteffectSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                neteffectSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("time"))
        {
            Object obj = soapObject.getProperty("time");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                time = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                time = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("timeSpecified"))
        {
            Object obj = soapObject.getProperty("timeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                timeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                timeSpecified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return cash;
            case 1:
                return cashSpecified;
            case 2:
                return credit;
            case 3:
                return creditSpecified;
            case 4:
                return dateValue;
            case 5:
                return dateValueSpecified;
            case 6:
                return debit;
            case 7:
                return debitSpecified;
            case 8:
                return description;
            case 9:
                return id;
            case 10:
                return idSpecified;
            case 11:
                return mealprice;
            case 12:
                return mealpriceSpecified;
            case 13:
                return neteffect;
            case 14:
                return neteffectSpecified;
            case 15:
                return time;
            case 16:
                return timeSpecified;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 17;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = Double.class;
                info.name = "cash";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "cashSpecified";
                break;
            case 2:
                info.type = Double.class;
                info.name = "credit";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "creditSpecified";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "dateValue";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "dateValueSpecified";
                break;
            case 6:
                info.type = Double.class;
                info.name = "debit";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "debitSpecified";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "description";
                break;
            case 9:
                info.type = Long.class;
                info.name = "id";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idSpecified";
                break;
            case 11:
                info.type = Double.class;
                info.name = "mealprice";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "mealpriceSpecified";
                break;
            case 13:
                info.type = Double.class;
                info.name = "neteffect";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "neteffectSpecified";
                break;
            case 15:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "time";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "timeSpecified";
                break;
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
