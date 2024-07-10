package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private Double weight;
    private Floor destinationFloor;

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Floor getDestinationFloor() {
        return destinationFloor;
    }

    public void setDestinationFloor(Floor destinationFloor) {
        this.destinationFloor = destinationFloor;
    }
}
