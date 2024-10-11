package domain.service;


import domain.Bookings;
import domain.Doctor;
import domain.Patient;
import domain.Slot;

import java.util.Date;
import java.util.Map;

public class BookingService {

    public Bookings createBooking(Patient patient, String desc, Doctor doctor, Integer slot) {
        if (patient.getBookings().containsKey(slot)){
            return null;
        }

        if (doctor.getAvailableSlot().containsKey(slot)){
            return null;
        }

        Bookings bookings = Bookings.builder().bookingStartTime().getBookingEndTime().





    }

}
