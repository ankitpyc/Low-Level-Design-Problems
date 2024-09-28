package domain;

public enum RoomAddons {
    EXTRA_BED(250.0), BREAKFAST(100.0), DINNER(375.0);

    public final Double cost;

    RoomAddons(Double cost) {
        this.cost = cost;
    }

}
