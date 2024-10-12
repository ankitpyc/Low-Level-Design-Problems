package entities.Respository;

import entities.Bookings.Bookings;
import entities.Repository;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class BookingsRepository implements Repository<Bookings> {

    private static AtomicInteger bookingId;
    private static BookingsRepository instance = null;
    private static ConcurrentHashMap<Integer, Bookings> bookingsConcurrentHashMap;


    private BookingsRepository() {
        bookingId = new AtomicInteger(0);
        bookingsConcurrentHashMap = new ConcurrentHashMap<>();
    }

    public static synchronized BookingsRepository getInstance() {
        if (instance == null) {
            instance = new BookingsRepository();
        }
        return instance;
    }

    @Override
    public Bookings save(Bookings bookings) {
        bookingsConcurrentHashMap.put(bookingId.incrementAndGet(), bookings);
        bookings.setBookingId(bookingId.get());
        return bookings;
    }
}
