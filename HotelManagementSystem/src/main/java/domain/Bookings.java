package domain;

import domain.Addons.Addons;
import domain.Addons.BED_ADDONS;
import domain.Addons.DINNER_ADDON;
import domain.Notification.NotificationStrategy;
import domain.enums.PaymentMode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bookings {
    Room room;
    List<Person> guest;
    Date startDateTime;
    Date endDateTime;
    Double totalRoomCharge;
    PaymentStatus paymentStatus;
    PaymentInvoice invoice;
    List<NotificationStrategy> notificationStrategy;
    List<Addons> roomAddonsList;
    PaymentMode payment;

    public void addAddon(RoomAddons roomAddons) {
        Addons addons = null;
        switch (roomAddons) {
            case EXTRA_BED:
                addons = new BED_ADDONS(this);
            case DINNER:
                addons = new DINNER_ADDON(this);
        }
        roomAddonsList.add(addons);
    }


}
