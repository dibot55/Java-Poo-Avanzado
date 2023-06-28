import module.Doctor;
import module.Patient;
import module.User;
import ui.UIMenu;

public class Main {
    public static void main(String[] args) {
        /*
        Doctor doctor = new Doctor("Yeyo-san", "Yeyosan@amor.com",234234 , "Amar a Erika chan");
        System.out.println(doctor);

        Doctor doctora = new Doctor("Erika-chan", "Erikachan@amor.com", 234324,"Amar yeyo-san");
        System.out.println(doctora);
        */
        // Instanciar una clase anidada
        //Appointment fecha = new Appointment();
        /*
        fecha.addAvailableAppointment(new Date(), new Date().getTime());
        fecha.addAvailableAppointment(new Date(), new Date().getTime());
        fecha.addAvailableAppointment(new Date(), new Date().getTime());
        System.out.println(fecha);
        */
        /*
        for (module.Appointment.AvailableAppointment arr: fecha.getAvailableAppointment()
             ) {
            System.out.println(arr.getDate() + " " + arr.getTime());
        }
        */
        /*
        Patient paciente = new Patient("yego", "yego@amor.com", 294234, 56.2);
        System.out.println(paciente);
        */
        // Clase Anonima
        User user = new User("Diego", "dieibots@adsad.mp3", 3123213) {
            @Override
            public void showDataUser() {
                System.out.println(getName() + " " + getEmail() + " " + getPhoneNumber());
            }
        };
        user.showDataUser();

        // Scanner
        ui.UIMenu.menuHospital();
    }
}