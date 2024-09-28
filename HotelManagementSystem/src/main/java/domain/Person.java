package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Person {
    String name;
    String Address;
    String mobileNumber;
    String email;

    public Person(String name, String address, String mobileNumber) {
    }
}
