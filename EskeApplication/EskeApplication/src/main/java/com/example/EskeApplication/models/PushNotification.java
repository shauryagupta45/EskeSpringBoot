package com.example.EskeApplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "push_notification")
public class PushNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notification_id")
    private Integer notificationId;

    @Column(name = "notification_approval")
    private Boolean notificationApproval;

    @Column(name = "notification_message", nullable = false)
    private String notificationMessage;

    @Column(name = "notication_reached")
    private Boolean noticationReached;

    @Override
    public String toString() {
        return "PushNotification{" +
                "notificationId=" + notificationId +
                ", notificationApproval=" + notificationApproval +
                ", notificationMessage='" + notificationMessage + '\'' +
                ", noticationReached=" + noticationReached +
                '}';
    }
}