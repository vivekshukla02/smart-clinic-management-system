package com.project.back_end.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String speciality;

    private String email;

    @ElementCollection
    private List<String> availableTimes;
}
