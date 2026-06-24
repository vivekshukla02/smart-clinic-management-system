package com.project.back_end.services;

import com.project.back_end.models.Appointment;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppointmentService {

    private final List<Appointment> appointments = new ArrayList<>();

    public Appointment bookAppointment(Appointment appointment) {

        // Save appointment
        appointments.add(appointment);

        return appointment;
    }

    public List<Appointment> getAppointmentsByDoctorAndDate(
            Long doctorId,
            LocalDate date) {

        return appointments.stream()
                .filter(a -> a.getDoctor() != null
                        && a.getDoctor().getId().equals(doctorId)
                        && a.getAppointmentTime() != null
                        && a.getAppointmentTime().toLocalDate().equals(date))
                .collect(Collectors.toList());
    }
}
