package com.seaboxdata.bjca.mockup.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class LoginInformation {
    private String loginName;
    private String loginNickName;
    private String loginPwd;
    private String loginType;

    public LoginInformation() {
    }

    public LoginInformation(
            String loginName,
            String loginNickName,
            String loginPwd,
            String loginType) {
        this.loginName = loginName;
        this.loginNickName = loginNickName;
        this.loginPwd = loginPwd;
        this.loginType = loginType;
    }


    /**
     * Gets the loginName value for this LoginInformation.
     *
     * @return loginName
     */
    public String getLoginName() {
        return loginName;
    }


    /**
     * Sets the loginName value for this LoginInformation.
     *
     * @param loginName
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }


    /**
     * Gets the loginNickName value for this LoginInformation.
     *
     * @return loginNickName
     */
    public String getLoginNickName() {
        return loginNickName;
    }


    /**
     * Sets the loginNickName value for this LoginInformation.
     *
     * @param loginNickName
     */
    public void setLoginNickName(String loginNickName) {
        this.loginNickName = loginNickName;
    }


    /**
     * Gets the loginPwd value for this LoginInformation.
     *
     * @return loginPwd
     */
    public String getLoginPwd() {
        return loginPwd;
    }


    /**
     * Sets the loginPwd value for this LoginInformation.
     *
     * @param loginPwd
     */
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }


    /**
     * Gets the loginType value for this LoginInformation.
     *
     * @return loginType
     */
    public String getLoginType() {
        return loginType;
    }


    /**
     * Sets the loginType value for this LoginInformation.
     *
     * @param loginType
     */
    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

}
