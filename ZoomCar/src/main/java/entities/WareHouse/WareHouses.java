package entities.WareHouse;

import entities.Address;
import entities.Bookings.Vehicle;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class WareHouses {
    private Integer warehouseId;
    private List<Vehicle> vehicles;
    private Address warehouseAddress;
}
