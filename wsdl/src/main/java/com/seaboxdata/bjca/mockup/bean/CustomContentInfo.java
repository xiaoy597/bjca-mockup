
package com.seaboxdata.bjca.mockup.bean;

public class CustomContentInfo  implements java.io.Serializable {
    private long contentFlowno;
    private long informationSystem;
    private String shareName;
    private String shareUserType;

    public CustomContentInfo() {
    }

    public CustomContentInfo(
           long contentFlowno,
           long informationSystem,
           String shareName,
           String shareUserType) {
           this.contentFlowno = contentFlowno;
           this.informationSystem = informationSystem;
           this.shareName = shareName;
           this.shareUserType = shareUserType;
    }


    /**
     * Gets the contentFlowno value for this CustomContentInfo.
     * 
     * @return contentFlowno
     */
    public long getContentFlowno() {
        return contentFlowno;
    }


    /**
     * Sets the contentFlowno value for this CustomContentInfo.
     * 
     * @param contentFlowno
     */
    public void setContentFlowno(long contentFlowno) {
        this.contentFlowno = contentFlowno;
    }


    /**
     * Gets the informationSystem value for this CustomContentInfo.
     * 
     * @return informationSystem
     */
    public long getInformationSystem() {
        return informationSystem;
    }


    /**
     * Sets the informationSystem value for this CustomContentInfo.
     * 
     * @param informationSystem
     */
    public void setInformationSystem(long informationSystem) {
        this.informationSystem = informationSystem;
    }


    /**
     * Gets the shareName value for this CustomContentInfo.
     * 
     * @return shareName
     */
    public String getShareName() {
        return shareName;
    }


    /**
     * Sets the shareName value for this CustomContentInfo.
     * 
     * @param shareName
     */
    public void setShareName(String shareName) {
        this.shareName = shareName;
    }


    /**
     * Gets the shareUserType value for this CustomContentInfo.
     * 
     * @return shareUserType
     */
    public String getShareUserType() {
        return shareUserType;
    }


    /**
     * Sets the shareUserType value for this CustomContentInfo.
     * 
     * @param shareUserType
     */
    public void setShareUserType(String shareUserType) {
        this.shareUserType = shareUserType;
    }

}
