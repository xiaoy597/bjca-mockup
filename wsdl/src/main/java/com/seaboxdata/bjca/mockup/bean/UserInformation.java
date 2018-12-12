package com.seaboxdata.bjca.mockup.bean;

public class UserInformation  implements java.io.Serializable {
    private String default1;
    private String uniqueid;
    private String userIdcode;
    private String userState;
    private String userType;

    public UserInformation() {
    }

    public UserInformation(
           String default1,
           String uniqueid,
           String userIdcode,
           String userState,
           String userType) {
           this.default1 = default1;
           this.uniqueid = uniqueid;
           this.userIdcode = userIdcode;
           this.userState = userState;
           this.userType = userType;
    }


    /**
     * Gets the default1 value for this UserInformation.
     * 
     * @return default1
     */
    public String getDefault1() {
        return default1;
    }


    /**
     * Sets the default1 value for this UserInformation.
     * 
     * @param default1
     */
    public void setDefault1(String default1) {
        this.default1 = default1;
    }


    /**
     * Gets the uniqueid value for this UserInformation.
     * 
     * @return uniqueid
     */
    public String getUniqueid() {
        return uniqueid;
    }


    /**
     * Sets the uniqueid value for this UserInformation.
     * 
     * @param uniqueid
     */
    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }


    /**
     * Gets the userIdcode value for this UserInformation.
     * 
     * @return userIdcode
     */
    public String getUserIdcode() {
        return userIdcode;
    }


    /**
     * Sets the userIdcode value for this UserInformation.
     * 
     * @param userIdcode
     */
    public void setUserIdcode(String userIdcode) {
        this.userIdcode = userIdcode;
    }


    /**
     * Gets the userState value for this UserInformation.
     * 
     * @return userState
     */
    public String getUserState() {
        return userState;
    }


    /**
     * Sets the userState value for this UserInformation.
     * 
     * @param userState
     */
    public void setUserState(String userState) {
        this.userState = userState;
    }


    /**
     * Gets the userType value for this UserInformation.
     * 
     * @return userType
     */
    public String getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this UserInformation.
     * 
     * @param userType
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

}
