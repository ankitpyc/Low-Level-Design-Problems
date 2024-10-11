package domain;

import lombok.Data;

import java.util.*;

@Data
public class Doctor extends User {
    private int doctorId;
    private TreeMap<Integer, Appointment> availableSlot;
    private Speciality speciality;
    private List<Bookings> bookings;

    public Doctor(String name, String email, String address, String phoneNumber, Speciality speciality) {
        super(name, email, address, phoneNumber);
        this.speciality = speciality;
        this.availableSlot = new TreeMap<>();
        this.bookings = new ArrayList<>();
    }

}
