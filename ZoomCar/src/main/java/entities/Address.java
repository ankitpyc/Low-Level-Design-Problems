package entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
public class Address {
    private String LO1;
    private String LO2;
    private String city;
    private String state;
    private String pincode;
}
