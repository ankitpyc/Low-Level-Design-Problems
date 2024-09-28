package domain.Humans;

import domain.Person;
import domain.enums.Department;

public class StaffMember extends Person {

    private Department department;

    public StaffMember(String name, String Address, Department department) {
        super(name, Address);
        this.department = department;
    }
}
