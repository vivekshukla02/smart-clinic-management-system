package com.project.back_end.controllers;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

    @PostMapping("/{token}")
    public ResponseEntity<?> savePrescription(
            @PathVariable String token,
            @Valid @RequestBody Map<String, Object> prescription) {

        if (token == null || token.isBlank()) {
            return ResponseEntity.badRequest()
                    .body(Map.of(
                            "success", false,
                            "message", "Invalid token"
                    ));
        }

        if (prescription == null || prescription.isEmpty()) {
            return ResponseEntity.badRequest()
                    .body(Map.of(
                            "success", false,
                            "message", "Prescription data required"
                    ));
        }

        return ResponseEntity.ok(
                Map.of(
                        "success", true,
                        "message", "Prescription saved successfully"
                )
        );
    }
}
