package entities.Search;

import entities.Bookings.Vehicle;
import entities.Bookings.VehicleModel;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class SearchManager implements SearchInterface {

    SearchStrategy strategy;

    @Override
    public List<Vehicle> searchByModel(VehicleModel vehicleModel) {
        return Collections.emptyList();
    }

    @Override
    public List<Vehicle> searchByAvailability(Date startDate, Date enddate) {
        return Collections.emptyList();
    }
}
