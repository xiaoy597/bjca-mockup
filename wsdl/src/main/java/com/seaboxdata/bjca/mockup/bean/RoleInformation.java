package com.seaboxdata.bjca.mockup.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class RoleInformation {
    private String urFlowno;
    private String userRoleCode;
    private String userRoleDescribe;
    private String userRoleName;
    private String userRoleState;

    public RoleInformation() {
    }

    public RoleInformation(
            String urFlowno,
            String userRoleCode,
            String userRoleDescribe,
            String userRoleName,
            String userRoleState) {
        this.urFlowno = urFlowno;
        this.userRoleCode = userRoleCode;
        this.userRoleDescribe = userRoleDescribe;
        this.userRoleName = userRoleName;
        this.userRoleState = userRoleState;
    }


    /**
     * Gets the urFlowno value for this RoleInformation.
     *
     * @return urFlowno
     */
    public String getUrFlowno() {
        return urFlowno;
    }


    /**
     * Sets the urFlowno value for this RoleInformation.
     *
     * @param urFlowno
     */
    public void setUrFlowno(String urFlowno) {
        this.urFlowno = urFlowno;
    }


    /**
     * Gets the userRoleCode value for this RoleInformation.
     *
     * @return userRoleCode
     */
    public String getUserRoleCode() {
        return userRoleCode;
    }


    /**
     * Sets the userRoleCode value for this RoleInformation.
     *
     * @param userRoleCode
     */
    public void setUserRoleCode(String userRoleCode) {
        this.userRoleCode = userRoleCode;
    }


    /**
     * Gets the userRoleDescribe value for this RoleInformation.
     *
     * @return userRoleDescribe
     */
    public String getUserRoleDescribe() {
        return userRoleDescribe;
    }


    /**
     * Sets the userRoleDescribe value for this RoleInformation.
     *
     * @param userRoleDescribe
     */
    public void setUserRoleDescribe(String userRoleDescribe) {
        this.userRoleDescribe = userRoleDescribe;
    }


    /**
     * Gets the userRoleName value for this RoleInformation.
     *
     * @return userRoleName
     */
    public String getUserRoleName() {
        return userRoleName;
    }


    /**
     * Sets the userRoleName value for this RoleInformation.
     *
     * @param userRoleName
     */
    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
    }


    /**
     * Gets the userRoleState value for this RoleInformation.
     *
     * @return userRoleState
     */
    public String getUserRoleState() {
        return userRoleState;
    }


    /**
     * Sets the userRoleState value for this RoleInformation.
     *
     * @param userRoleState
     */
    public void setUserRoleState(String userRoleState) {
        this.userRoleState = userRoleState;
    }

}
