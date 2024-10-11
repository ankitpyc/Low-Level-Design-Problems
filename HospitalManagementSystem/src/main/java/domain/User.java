package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class  User {
     private String name;
     private String email;
     private String address;
     private String phoneNumber;
}
