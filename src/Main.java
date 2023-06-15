import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("yeyo-san", "yeyosan@amor.com", "Amar a Erika chan");
        doctor.printId();
        doctor.printData();

        Doctor doctora = new Doctor("Erika-chan", "Erikachan@amor.com","Amar yeyo-san");
        doctora.printId();
        doctora.printData();

        // Instanciar una clase anidada
        Anidacion fecha = new Anidacion();
        fecha.addAvailableAppointment(new Date(), new Date().getTime());
        fecha.addAvailableAppointment(new Date(), new Date().getTime());
        fecha.addAvailableAppointment(new Date(), new Date().getTime());

        for (Anidacion.AvailableAppointment arr: fecha.getAvailableAppointment()
             ) {
            System.out.println(arr.getDate() + " " + arr.getTime());
        }

    }
}
