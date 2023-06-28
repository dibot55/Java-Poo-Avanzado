package module;

import module.User;

import java.util.ArrayList;

public class Patient extends User {
    // Atributos
    // Modificadores de acceso
    private String birthday;
    private double weight;
    private double height;
    private String blood;
    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurse = new ArrayList<>();
    // Metodos
    // Get & Set
    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }
    public void addAppointmentDoctors(Doctor doctor, String date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date,  time);
        appointmentDoctors.add(appointmentDoctor);
    }
    public ArrayList<AppointmentNurse> getAppointmentNurse() {
        return appointmentNurse;
    }
    public void addAppointmentNurse(ArrayList<AppointmentNurse> appointmentNurse) {
        this.appointmentNurse = appointmentNurse;
    }

    // Sobreescritura de constructores - polimorfisimo
    public Patient(String name, String email, int phoneNumber, double weight){
        super(name, email, phoneNumber);
        this.weight=weight;
    }

    // Encapsulamiento
    public String getWeight() {
        return weight + "kg";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + " birithday: "+ birthday + " blood:" + blood + " height:" + height + " weight: " + getWeight();
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz roja");
        System.out.println("Departamento: Sala de espera");
    }
}
