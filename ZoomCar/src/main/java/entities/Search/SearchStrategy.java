package entities.Search;

import entities.Bookings.Vehicle;
import entities.User.User;

import java.util.List;

public interface SearchStrategy {
    List<Vehicle> search(User user);
}
