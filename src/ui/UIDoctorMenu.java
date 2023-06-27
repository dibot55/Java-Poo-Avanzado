package ui;

import java.util.Scanner;

public class UIDoctorMenu {
    public static void dotorMenuUI(){
        int response = 0;
        System.out.println("\n\n");
        System.out.println("Doctor");
        System.out.println("Bienvenido " + UIMenu.doctorLogged.getName());
        System.out.println("1.- Agregar cita disponible");
        System.out.println("2.- Mis citas disponibles");
        System.out.println("3.- Logout");
        // Scanner
        do {
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    break;
                default:
                    UIMenu.menuHospital();
                    break;
            }
        } while (response != 0);
    }

    public static void showAddAvailableAppointment(){
        int response = 0;
        do {
            System.out.println();
            System.out.println(":: Agregar cita disponible");
            System.out.println(":: Selecciona un mes");
            for (int i = 0; i < UIMenu.MONTHS.length; i++) {
                int j = i +1;
                System.out.println(j + ".- " + UIMenu.MONTHS[i]);
            }
            System.out.println("0.- Return");

            // Scanner
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response > 0 && response <= 12) {
                int monthSelected = response;
                System.out.println("Mes " + monthSelected + " . " + "Mes Confirmado " + UIMenu.MONTHS[monthSelected]);

                System.out.println("Inserta la fecha en este formato: [dd/mm/yyyy]");
                String date = sc.nextLine();

                System.out.println("La fecha de tu cita es: " + date + "\n1.-Correcto\n2.-Cambiar la fecha");

            } else if (response == 0) {
                dotorMenuUI();
            }
        } while (response != 0);
    }
}