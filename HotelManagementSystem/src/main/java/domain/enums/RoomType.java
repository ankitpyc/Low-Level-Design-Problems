package domain.enums;

public enum RoomType {
    DELUXE(3200.0, true), SINGLE(750.0, false), DOUBLE(1600.0, true);

    final Double RoomCharge;
    final Boolean isHouseKeeping;

    RoomType(Double roomCharge, Boolean isHouseKeeping) {
        this.isHouseKeeping = isHouseKeeping;
        this.RoomCharge = roomCharge;
    }
}
