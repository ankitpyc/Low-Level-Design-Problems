package org.linkedIn.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Notifications {
    private String NotificationId;
    private String text;
    private String receiverId;
    private String senderId;
}
