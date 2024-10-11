package domain.repository;

import domain.BookingStatus;
import domain.Bookings;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@AllArgsConstructor
@Data
public class BookingsRepository {

    private final AtomicInteger id = new AtomicInteger();
    private ConcurrentHashMap<Integer, Bookings> bookingsMap;

    public void save(Bookings bookings) {
        bookingsMap.put(id.incrementAndGet(), bookings);
    }

    public boolean updateBookingStatus(Integer id, BookingStatus bookingStatus) {
        Bookings bookings = bookingsMap.get(id);
        bookings.setStatus(bookingStatus);
        bookingsMap.put(id, bookings);
        return true;
    }

}
