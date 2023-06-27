package module;

import java.util.ArrayList;

public class Doctor extends User {
    // Atributos
    static int id = 0;
    String speacilty;

    // Constructor
    public Doctor(String name, String email, int phoneNumber, String speacilty){
        super(name, email, phoneNumber);
        this.speacilty=speacilty;
        id++;
    }


    // Metodos
    public void printData(){
        System.out.println(getName() + " " + speacilty);
    }
    public void printId(){
        System.out.println(id);
    }

    // Clase estatica anidada
    public static class AvailableAppointment{
        private String date;
        private String time;
        public AvailableAppointment(String date, String time){
            this.date = date;
            this.time = time;
        }

        public String getDate() {
            return date;
        }

        public String getTime(){
            return time;
        }

        @Override
        public String toString() {
            return "Available Apointment \nDate: " + getDate() + "\nTime: " + getTime();
        }
    }

    // Coleccion
    ArrayList<Doctor.AvailableAppointment> availableAppointment = new ArrayList<>();
    public void addAvailableAppointment(String date, String time){
        availableAppointment.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<Doctor.AvailableAppointment> getAvailableAppointment(){
        return availableAppointment;
    }

    @Override
    public String toString() {
        return "\n" +
                super.toString() + " Specialiity: " + speacilty + " Available: " + availableAppointment.toString() +
                "\n";
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz roja");
        System.out.println("Departamento: Cancerologiia");
    }
}
