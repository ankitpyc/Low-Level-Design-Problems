package domain.repository;

import domain.Patient;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class PatientsRepository {

    public static AtomicInteger id = new AtomicInteger();

    Map<Integer, Patient> patients;

    public void save(Patient patient) {
        patients.put(id.incrementAndGet(), patient);
    }

}
