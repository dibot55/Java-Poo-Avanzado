package module;

import module.interfaz.ISchedule;


public class AppointmentDoctor implements ISchedule {
    // Atributos
    private int id;
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String time;
    // Constructor

    public AppointmentDoctor(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    // Metodos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time + "hrs.";
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void schedule(String date, String time) {
        this.date=date;
        this.time=time;
    }
}
