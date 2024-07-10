package org.lld.elevator;

import org.lld.elevator.domain.Elevator;
import org.lld.elevator.domain.Floor;
import org.lld.elevator.domain.Person;

public interface ElevatorSystemInf {
   Elevator getElevator(Floor floor, Person person);
   void addElevator(Elevator elevator);
}
