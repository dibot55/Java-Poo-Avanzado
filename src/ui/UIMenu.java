package ui;

import module.Doctor;
import module.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    // Constantes
    public static final double PI= 3.1415936;
    public static final String[] PELICULAS={
            "El coco",
            "Minecraft",
            "Invasion",
            "Transformes",
            "Rapidos y furiosos",
            "Godzilla Nes",
            "Animez",
            "douluo",
            "Cod of duty",
            "Scary movie 19",
            "Power Rangers",
            "Terror en cookiezi"};

    public static void menuHospital(){
        int response = 0;
        do {
            System.out.println("Selecciona el numero de la opcion deseada: /n");
            System.out.println("1.- Doctor /n");
            System.out.println("2.- Pacieintes /n");
            System.out.println("0.- Salir");

            // Scanner
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine()); // Capturamos la respuesta del usuario

            switch (response) {
                case 0:
                    System.out.println("Gracias por visitarnos vuelva pronto");
                    break;
                case 1:
                    System.out.println("Doctor: ");
                    for (int i=0; i<PELICULAS.length; i++) {
                        System.out.println(PELICULAS[i]);
                    }
                    break;
                case 2:
                    System.out.println("Pacientes: ");
                    break;
                default:
                    System.out.println("No hay nada :0");
                    break;
            }
        } while (response != 0);
    }
    public static void auth(int typeUser){
        // auth -  Doctor
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Yeyo-san", "yeyosan@gmail.com", 234345, "Amar a Erika Chan"));
        doctors.add(new Doctor("Erika-Chan", "erikachan@gmail.com", 234345, "Amar a Yeyo san"));

        // auth - Patient
        ArrayList<Patient> patient = new ArrayList<>();
        patient.add(new Patient("Diego Raciel", "diego@gmail.com", 1231234, 14.3));
        patient.add(new Patient("Erika", "erika@gmail.com", 1231234, 14.3));

        boolean emailCorrect = false;
        do {
            System.out.println("Inserta tu correo electronico: ");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            // if (email == )
        } while (!emailCorrect);
    }
}
