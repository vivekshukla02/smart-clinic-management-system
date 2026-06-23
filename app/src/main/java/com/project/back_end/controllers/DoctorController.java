package com.project.back_end.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @GetMapping("/availability")
    public ResponseEntity<?> getDoctorAvailability(
            @RequestParam Long doctorId,
            @RequestParam String date,
            @RequestHeader("Authorization") String token) {

        if (token == null || token.isBlank()) {
            return ResponseEntity.badRequest()
                    .body(Map.of(
                            "success", false,
                            "message", "Invalid token"
                    ));
        }

        List<String> availableSlots = Arrays.asList(
                "09:00 AM",
                "10:00 AM",
                "11:00 AM"
        );

        return ResponseEntity.ok(
                Map.of(
                        "success", true,
                        "doctorId", doctorId,
                        "date", date,
                        "availableSlots", availableSlots
                )
        );
    }
}
