package com.patika.notificationservice.model.dto;

import com.patika.notificationservice.model.enums.NotificationType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class NotificationRequest {

    private String message;

    private NotificationType notificationType;

    private String contact;

}

