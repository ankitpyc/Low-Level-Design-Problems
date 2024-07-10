package org.lld.elevator.domain;

public interface IElevator {
    boolean addDestinationFloor(Floor floor);
    boolean isOverloaded(Double weight);

    void EnterLift(Person person);

    void ExitLift(Person person);
}
