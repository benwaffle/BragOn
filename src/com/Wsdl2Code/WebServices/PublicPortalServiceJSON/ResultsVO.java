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
import com.Wsdl2Code.WebServices.PublicPortalServiceJSON.VectorCourseRequestGroupVO;
import com.Wsdl2Code.WebServices.PublicPortalServiceJSON.CourseRequestRulesVO;
import com.Wsdl2Code.WebServices.PublicPortalServiceJSON.VectorStudentDataVO;
import com.Wsdl2Code.WebServices.PublicPortalServiceJSON.UserSessionVO;
import com.Wsdl2Code.WebServices.PublicPortalServiceJSON.VectorMessageVO;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class ResultsVO implements KvmSerializable {
    
    public VectorCourseRequestGroupVO courseRequestGroupsVOs;
    public CourseRequestRulesVO courseRequestRulesVO;
    public VectorStudentDataVO studentDataVOs;
    public UserSessionVO userSessionVO;
    public VectorMessageVO messageVOs;
    
    public ResultsVO(){}
    
    public ResultsVO(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("courseRequestGroupsVOs"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("courseRequestGroupsVOs");
            courseRequestGroupsVOs = new VectorCourseRequestGroupVO(j);
        }
        if (soapObject.hasProperty("courseRequestRulesVO"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("courseRequestRulesVO");
            courseRequestRulesVO =  new CourseRequestRulesVO (j);
            
        }
        if (soapObject.hasProperty("studentDataVOs"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("studentDataVOs");
            studentDataVOs = new VectorStudentDataVO(j);
        }
        if (soapObject.hasProperty("userSessionVO"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("userSessionVO");
            userSessionVO =  new UserSessionVO (j);
            
        }
        if (soapObject.hasProperty("messageVOs"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("messageVOs");
            messageVOs = new VectorMessageVO(j);
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return courseRequestGroupsVOs;
            case 1:
                return courseRequestRulesVO;
            case 2:
                return studentDataVOs;
            case 3:
                return userSessionVO;
            case 4:
                return messageVOs;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 5;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "courseRequestGroupsVOs";
                break;
            case 1:
                info.type = CourseRequestRulesVO.class;
                info.name = "courseRequestRulesVO";
                break;
            case 2:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "studentDataVOs";
                break;
            case 3:
                info.type = UserSessionVO.class;
                info.name = "userSessionVO";
                break;
            case 4:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "messageVOs";
                break;
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
