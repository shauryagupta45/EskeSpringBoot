package com.example.EskeApplication.dto;

public class CampaignDto {

    private Integer campaignId;
    private Float campaignBudget;
    private Boolean campaignApproval;
    private String campaignPlatform;
    private String campaignStartDate;
    private String campaignEndDate;
    private String campaignHiredAgency;

    public Integer getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Integer campaignId) {
        this.campaignId = campaignId;
    }

    public Float getCampaignBudget() {
        return campaignBudget;
    }

    public void setCampaignBudget(Float campaignBudget) {
        this.campaignBudget = campaignBudget;
    }

    public Boolean getCampaignApproval() {
        return campaignApproval;
    }

    public void setCampaignApproval(Boolean campaignApproval) {
        this.campaignApproval = campaignApproval;
    }

    public String getCampaignPlatform() {
        return campaignPlatform;
    }

    public void setCampaignPlatform(String campaignPlatform) {
        this.campaignPlatform = campaignPlatform;
    }

    public String getCampaignStartDate() {
        return campaignStartDate;
    }

    public void setCampaignStartDate(String campaignStartDate) {
        this.campaignStartDate = campaignStartDate;
    }

    public String getCampaignEndDate() {
        return campaignEndDate;
    }

    public void setCampaignEndDate(String campaignEndDate) {
        this.campaignEndDate = campaignEndDate;
    }

    public String getCampaignHiredAgency() {
        return campaignHiredAgency;
    }

    public void setCampaignHiredAgency(String campaignHiredAgency) {
        this.campaignHiredAgency = campaignHiredAgency;
    }


    @Override
    public String toString() {
        return "CampaignDto{" +
                "campaignId=" + campaignId +
                ", campaignBudget=" + campaignBudget +
                ", campaignApproval=" + campaignApproval +
                ", campaignPlatform='" + campaignPlatform + '\'' +
                ", campaignStartDate='" + campaignStartDate + '\'' +
                ", campaignEndDate='" + campaignEndDate + '\'' +
                ", campaignHiredAgency='" + campaignHiredAgency + '\'' +
                '}';
    }
}
