package com.example.EskeApplication.dto;

public class PushNotificationDto {

    private Integer notificationId;
    private Boolean notificationApproval;
    private String notificationMessage;
    private Boolean noticationReached;

    public Integer getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Integer notificationId) {
        this.notificationId = notificationId;
    }

    public Boolean getNotificationApproval() {
        return notificationApproval;
    }

    public void setNotificationApproval(Boolean notificationApproval) {
        this.notificationApproval = notificationApproval;
    }

    public String getNotificationMessage() {
        return notificationMessage;
    }

    public void setNotificationMessage(String notificationMessage) {
        this.notificationMessage = notificationMessage;
    }

    public Boolean getNoticationReached() {
        return noticationReached;
    }

    public void setNoticationReached(Boolean noticationReached) {
        this.noticationReached = noticationReached;
    }
}
