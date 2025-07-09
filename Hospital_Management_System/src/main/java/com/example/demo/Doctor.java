package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;


@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @Column(name = "doctorId", nullable = false, unique = true)
    private String doctorId;

    @Column(name = "doctorName", nullable = false)
    private String doctorName;

    @Column(name = "doctorEmail", nullable = false, unique = true)
    private String doctorEmail;

    @Column(name = "doctorSpecialization")
    private String doctorSpecialization;

    @Column(name = "doctorPhno")
    private String doctorPhno;

    @Column(name = "startTime")
    private String startTime;

    @Column(name = "endTime")
    private String endTime;

    public Doctor() {}

    public Doctor(String doctorId, String doctorName, String doctorEmail,
                  String doctorSpecialization, String doctorPhno,
                  String startTime, String endTime) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.doctorEmail = doctorEmail;
        this.doctorSpecialization = doctorSpecialization;
        this.doctorPhno = doctorPhno;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getDoctorId() { return doctorId; }
    public void setDoctorId(String doctorId) { this.doctorId = doctorId; }

    public String getDoctorName() { return doctorName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }

    public String getDoctorEmail() { return doctorEmail; }
    public void setDoctorEmail(String doctorEmail) { this.doctorEmail = doctorEmail; }

    public String getDoctorSpecialization() { return doctorSpecialization; }
    public void setDoctorSpecialization(String doctorSpecialization) { this.doctorSpecialization = doctorSpecialization; }

    public String getDoctorPhno() { return doctorPhno; }
    public void setDoctorPhno(String doctorPhno) { this.doctorPhno = doctorPhno; }

    public String getStartTime() { return startTime; }
    public void setStartTime(String startTime) { this.startTime = startTime; }

    public String getEndTime() { return endTime; }
    public void setEndTime(String endTime) { this.endTime = endTime; }

    @Override
    public String toString() {
        return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorEmail=" + doctorEmail
                + ", doctorSpecialization=" + doctorSpecialization + ", doctorPhno=" + doctorPhno
                + ", startTime=" + startTime + ", endTime=" + endTime + "]";
    }
}