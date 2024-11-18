package com.example.EskeApplication.repos;

import com.example.EskeApplication.models.PushNotification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PushNotificationRepo extends JpaRepository<PushNotification, Integer> {
}
