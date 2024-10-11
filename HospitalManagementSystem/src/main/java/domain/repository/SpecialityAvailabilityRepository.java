package domain.repository;

import domain.Doctor;
import domain.Speciality;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SpecialityAvailabilityRepository {


    Map<Speciality, List<Doctor>> doctors;

    public void save(Doctor doctor) {
        List<Doctor> docs = doctors.getOrDefault(doctor.getSpeciality(), new ArrayList<>());
        docs.add((doctor));
        doctors.put(doctor.getSpeciality(), docs);
    }

    public List<Doctor> findSpecialistAndAvailableDoctors(Speciality speciality) {
        return doctors.get(speciality);
    }
}
