package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {
    String city;
    String state;
    String streetNo;
    Double Lat;
    Double Long;
}
