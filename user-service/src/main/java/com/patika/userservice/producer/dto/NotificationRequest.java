package com.patika.userservice.producer.dto;

import com.patika.userservice.producer.dto.enums.NotificationType;
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
