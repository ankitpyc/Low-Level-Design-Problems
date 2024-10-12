package entities.Bookings;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Bookings {
    private Integer bookingId;
    private Vehicle vehicle;
    private Date startDate;
    private Date endDate;
    private String userId;
    private String pickUpLocation;
    private String dropLocation;
    private String city;
    private String state;
    private BookingStatus bookingStatus;
}
