package org.example.domain;

public enum Floor {
    GROUND(0),
    FIRST(1),
    SECOND(2);
    private int floorNumber;
    Floor (int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Integer getFloorNumber(){
        return this.floorNumber;
    }
}
