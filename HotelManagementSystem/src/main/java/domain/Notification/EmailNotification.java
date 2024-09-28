package domain.Notification;

import domain.Humans.Guest;

import java.util.Objects;

public class EmailNotification implements NotificationStrategy {

    Guest guest;

    public EmailNotification(Guest guest) {
        this.guest = guest;
    }

    @Override
    public void sendNotification(String message) {
        if (Objects.nonNull(guest.getEmail())) {
            System.out.println("Sending SMS Notification to " + guest.getMobileNumber());
        }
    }
}
