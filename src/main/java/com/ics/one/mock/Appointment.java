package com.ics.one.mock;

public class Appointment {
    //private Long appointmentId;
    private Long studentNumber;
    private Long teacherId;

    private Appointment() {
    }

    public Appointment(Long studentNumber, Long teacherId) {
        this.studentNumber = studentNumber;
        this.teacherId = teacherId;
    }

    public Long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
}
