package entities.Bookings;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    private String vehicleId;
    private VehicleType vehicleType;
    private VehicleModel vehicleModel;
    private Integer totalKmTravelled;
    private double ratings;
    private Date lastMaintainenceDate;
    private List<String> Reviews;
}
