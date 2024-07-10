package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.observer.ElevatorEvent;
import org.example.observer.ElevatorObserver;
import org.example.observer.EventPublisher;

import java.util.*;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class Elevator implements IElevator, EventPublisher {
    private String elevatorId;
    private Floor currentFloor;
    private Direction direction;
    private Integer noOfPersons;
    private Double weightCapacity;
    private Double currentWeight;
    private Integer currentHeadCount;
    private Set<Floor> floorMap;

    private ElevatorObserver[]elevatorObservers;

    public Elevator(Double weightCapacity,Integer noOfPersons) {
      this.weightCapacity = weightCapacity;
      this.noOfPersons = noOfPersons;
      this.floorMap = new TreeSet<>();
      this.currentFloor = Floor.GROUND;
      this.direction = null;
      this.currentWeight = 0.0;
      this.currentHeadCount = 0;
      this.elevatorId = UUID.randomUUID().toString();
    }


    /**
     * @param floor
     * @return
     */
    @Override
    public boolean addDestinationFloor(Floor floor) {
        if (this.currentFloor == Floor.GROUND) {
            this.direction = Direction.UP;
        } else {
            this.direction = (this.currentFloor.getFloorNumber() - floor.getFloorNumber()) > 0 ? Direction.DOWN : Direction.UP;
        }
        this.floorMap.add(floor);
        return true;
    }

    /**
     * @return
     */
    @Override
    public boolean isOverloaded(Double weight) {
        return (currentWeight + weight >= weightCapacity || currentHeadCount + 1 >= noOfPersons );
    }

    /**
     * @param person
     * @return
     */
    @Override
    public void EnterLift(Person person) {
        if (isOverloaded(person.getWeight())) {
            System.out.println("Beep Beep ... . Lift is overloaded");
            return;
        }
        currentHeadCount = currentHeadCount + 1;
        currentWeight = currentWeight + person.getWeight();
        addDestinationFloor(person.getDestinationFloor());
    }

    /**
     * @param person
     * @return
     */
    @Override
    public void ExitLift(Person person) {
        currentHeadCount = currentHeadCount - 1;
        currentWeight = currentWeight - person.getWeight();
    }

    /**
     * @param event
     */
    @Override
    public void publishEvent(ElevatorEvent event) {

    }
}
