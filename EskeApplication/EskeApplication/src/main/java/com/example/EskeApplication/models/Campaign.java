package com.example.EskeApplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "campaign")
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "campaign_id")
    private Integer campaignId;

    @Column(name = "campaign_budget", nullable = false)
    private Float campaignBudget;

    @Column(name = "campaign_approval", nullable = false)
    private Boolean campaignApproval;

    @Column(name = "campaign_platform", nullable = false)
    private String campaignPlatform;

    @Column(name = "campaign_start_date", nullable = false)
    private String campaignStartDate;

    @Column(name = "campaign_end_date", nullable = false)
    private String campaignEndDate;

    @Column(name = "campaign_hired_agency", nullable = false)
    private String campaignHiredAgency;

    @Override
    public String toString() {
        return "Campaign{" +
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