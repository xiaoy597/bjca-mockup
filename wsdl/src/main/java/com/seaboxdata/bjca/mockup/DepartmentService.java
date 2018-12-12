package com.seaboxdata.bjca.mockup;

import com.seaboxdata.bjca.mockup.bean.DepartmentInformation;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface DepartmentService {
//    public DepartmentInformation findDepartByDepartID(String in0);
//    public Object[] getAllDepart();
//    public DepartmentInformation findDepartByDepartCode(String in0);
    public DepartmentInformation findDepartByDepartCodeForDC(@WebParam(name="departCode") String departCode);
    public Object[] getAllDepartForDC();
}
