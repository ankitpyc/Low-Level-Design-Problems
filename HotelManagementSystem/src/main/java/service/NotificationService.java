package service;

import domain.Bookings;
import domain.Notification.NotificationStrategy;

public class NotificationService {

    public void sendNotification(Bookings bookings, String message) {
        for (NotificationStrategy notificationStrategy : bookings.getNotificationStrategy()) {
            notificationStrategy.sendNotification(message);
        }
    }

}
