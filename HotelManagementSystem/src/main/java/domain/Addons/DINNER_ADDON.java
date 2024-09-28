package domain.Addons;

import domain.Bookings;
import domain.RoomAddons;

public class DINNER_ADDON implements Addons {
    Bookings bookings;
    RoomAddons roomAddons;

    public DINNER_ADDON(Bookings bookings) {
        this.roomAddons = RoomAddons.EXTRA_BED;
        this.bookings = bookings;
        this.bookings.setTotalRoomCharge(bookings.getTotalRoomCharge() + roomAddons.cost);
    }
}
