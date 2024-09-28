package domain.Notification;

import domain.Humans.Guest;

import java.util.Objects;

public class SMSNotification implements NotificationStrategy {

    Guest guest;

    public SMSNotification(Guest guest) {
        this.guest = guest;
    }

    @Override
    public void sendNotification(String message) {
        if (Objects.nonNull(guest.getMobileNumber())) {
            System.out.println("Sending SMS Notification to " + guest.getMobileNumber());
        }
    }
}
