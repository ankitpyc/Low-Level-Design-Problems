package entities.User;


import entities.Bookings.Bookings;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User extends Person {
    Boolean isVerified;
    List<Bookings> bookings;
    String aadharCardNo;
    Boolean isBlocked;
}
