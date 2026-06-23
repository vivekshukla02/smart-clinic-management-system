package com.project.back_end.services;

import com.project.back_end.models.Appointment;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentService {

    public Appointment bookAppointment(Appointment appointment) {

        // Simulate saving appointment
        return appointment;
    }

    public List<Appointment> getAppointmentsByDoctorAndDate(
            Long doctorId,
            LocalDate date) {

        // Simulate fetching appointments
        return new ArrayList<>();
    }
}
