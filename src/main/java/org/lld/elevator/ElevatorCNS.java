package org.lld.elevator;

import java.util.ArrayList;
import java.util.List;

import org.lld.elevator.domain.Elevator;
import org.lld.elevator.domain.Floor;
import org.lld.elevator.domain.Person;
import org.lld.elevator.observer.ElevatorEvent;
import org.lld.elevator.observer.ElevatorObserver;

public class ElevatorCNS implements ElevatorObserver,ElevatorSystemInf {
    private List<Elevator> elevators;


    public ElevatorCNS() {
        this.elevators = new ArrayList<>();
    }


    /**
     * @param elevatorEvent
     */
    @Override
    public void onEvent(ElevatorEvent elevatorEvent) {

    }


    /**
     * @param floor
     * @param person
     * @return
     */
    @Override
    public Elevator getElevator(Floor floor, Person person) {
        Elevator elevator = findOptimalElevator(floor,person);
        elevator.addDestinationFloor(floor);
        elevator.addDestinationFloor(person.getDestinationFloor());
        return elevator;
    }

    private Elevator findOptimalElevator(Floor floor, Person person) {
        Elevator elev = null;
        Integer minMovement = Integer.MAX_VALUE;
        for (Elevator elevator : elevators){
            Integer re = Math.abs(elevator.getCurrentFloor().getFloorNumber() - floor.getFloorNumber());
            minMovement = Integer.min(re,minMovement);
            if (minMovement != re && elevator.isOverloaded(person.getWeight())) {
                elev = elevator;
            }
        }
        return elev;
    }

    /**
     * @param elevator
     */
    @Override
    public void addElevator(Elevator elevator) {
        this.addElevator(elevator);
    }
}
