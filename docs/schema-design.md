# Smart Clinic Management System Database Design

## Doctor Table

| Field Name | Data Type |
|------------|-----------|
| id | BIGINT |
| name | VARCHAR(100) |
| speciality | VARCHAR(100) |
| email | VARCHAR(100) |
| phone | VARCHAR(20) |

## Patient Table

| Field Name | Data Type |
|------------|-----------|
| id | BIGINT |
| name | VARCHAR(100) |
| email | VARCHAR(100) |
| phone | VARCHAR(20) |
| address | VARCHAR(255) |

## Appointment Table

| Field Name | Data Type |
|------------|-----------|
| id | BIGINT |
| doctor_id | BIGINT |
| patient_id | BIGINT |
| appointment_time | DATETIME |
| status | VARCHAR(50) |

## Prescription Table

| Field Name | Data Type |
|------------|-----------|
| id | BIGINT |
| doctor_id | BIGINT |
| patient_id | BIGINT |
| medicine | TEXT |
| notes | TEXT |

## Relationships

- Appointment.doctor_id → Doctor.id
- Appointment.patient_id → Patient.id
- Prescription.doctor_id → Doctor.id
- Prescription.patient_id → Patient.id
