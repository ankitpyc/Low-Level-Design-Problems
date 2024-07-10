package org.example;

import org.example.domain.Elevator;
import org.example.domain.Floor;
import org.example.domain.Person;

public interface ElevatorSystemInf {
   Elevator getElevator(Floor floor, Person person);
   void addElevator(Elevator elevator);
}
