package domain.repository;

import domain.Doctor;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class DoctorsRepository {

    private static AtomicInteger id = new AtomicInteger();

    private Map<Integer, Doctor> doctorMap;


    public void save(Doctor doctor) {
        doctorMap.put(id.incrementAndGet(), doctor);
    }

}
