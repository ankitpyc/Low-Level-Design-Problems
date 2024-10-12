package entities.Search;

import entities.Bookings.Vehicle;
import entities.Bookings.VehicleModel;

import java.util.Date;
import java.util.List;

public interface SearchInterface {

    public List<Vehicle> searchByModel(VehicleModel vehicleModel);
    public List<Vehicle> searchByAvailability(Date startDate,Date enddate);
}
