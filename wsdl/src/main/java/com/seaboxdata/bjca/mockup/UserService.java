package com.seaboxdata.bjca.mockup;

import com.seaboxdata.bjca.mockup.bean.*;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface UserService {
    //    public Object[] findSystemInfosAccessedByUserID(String in0);
//
//    public UserInformation findUserInfosByUserIDForDC(String in0);
//
    public PersonInformation findPersonInfosByUserIDForDC(@WebParam(name="userId") String userId);

//    public UnitInformation findUnitInfosByUserIDFroDC(String in0);
//
//    public String getAuthorityByUsernameAndPw(String in0, String in1);
//
//    public Object[] findCustomContentInfosBySystemCodeAndUserType(String in0, String in1);
//
//    public SystemInformation findSystemInfoBySystemCode(String in0);
//
//    public UserCredenceInformation findCredenceInfoByUserID(String in0);
//
    public LoginInformation getLoginInformationByUserID(@WebParam(name="userId") String userId);

//    public Object[] findRoleInfosBySystemCodeAndUserID(String in0, String in1);
//
//    public UserInformation findUserInfosByUserSIDForDC(String in0);
//
//    public RoleInformation findRoleInfoByRoleId(String in0);
//
//    public DepartmentInformation findDepartByDepartID(String in0);
//
//    public SystemInformation findSystemInfoBySystemId(String in0);
//
//    public UserInformation findUserInfosByUserID(String in0);
//
//    public Object[] findRoleInfosByUserID(String in0);
//
//    public Object[] findRoleInfosBySystemID(String in0);
//
//    public Object[] findUserInfosBySystemID(String in0);
//
//    public int updateUserpw(String in0, String in1);
//
//    public PersonInformation findPersonInfosByUserID(String in0);
//
//    public UnitInformation findUnitInfosByUserID(String in0);
//
    public RoleInformation findRoleInfoByRoleCode(@WebParam(name="roleCode") String roleCode);
//
//    public String findRoleInfosByUserIDForStrType(String in0);
//
//    public String getAuthorityByUserIDAndPw(String in0, String in1);
//
//    public PersonInformation findWholePersonInfosByUserIDForDC(String in0);
//
//    public Object[] findUserInfosBySystemIDForDC(String in0);
//
//    public UserInformation findWholeUserInfosByUserIDForDC(String in0);
//
//    public String getAuthorityAndSystemIDByUsernameAndPw(String in0, String in1);
//
//    public CustomContentInfo findCustomContentInfoByCustomID(String in0);
//
//    public Object[] findAllSystemInfos();
//
//    public int updateUserpwByUserNameAndPwd(String in0, String in1);
//
//    public Object[] findDepartsByUserID(String in0);
//
//    public Object[] findResourceInfosByUserID(String in0);
//
//    public Object[] findResourceInfosBySystemCodeAndUserID(String in0, String in1);
//
//    public Object[] findResourceInfosBySystemCodeAndRolecodeAndUserID(String in0, String in1, String in2);
//
//    public Object[] findResourceInfosByRolecode(String in0);
}
