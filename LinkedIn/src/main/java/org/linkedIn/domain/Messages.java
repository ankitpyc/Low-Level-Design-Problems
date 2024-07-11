package org.linkedIn.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Messages {
    private String messageID;
    private String messageText;
    private String senderID;
    private String receiverID;
    private Date sentTimeStamp;
    private MessageStatus status;
}
