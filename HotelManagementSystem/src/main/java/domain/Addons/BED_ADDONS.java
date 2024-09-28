package domain.Addons;

import domain.Bookings;
import domain.RoomAddons;

public class BED_ADDONS implements Addons {

    Bookings bookings;
    RoomAddons roomAddons;

    public BED_ADDONS(Bookings bookings) {
        this.roomAddons = RoomAddons.EXTRA_BED;
        this.bookings = bookings;
        this.bookings.setTotalRoomCharge(bookings.getTotalRoomCharge() + roomAddons.cost);
    }
}
