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
                // Mes
                int monthSelected = response;
                System.out.println("Mes " + monthSelected + " . " + "Mes Confirmado " + UIMenu.MONTHS[monthSelected]);
                // Fecha
                System.out.println("Inserta la fecha en este formato: [dd/mm/yyyy]");
                String date = sc.nextLine();
                // Cambiar fecha
                System.out.println("La fecha de tu cita es: " + date + "\n1.-Correcto\n2.-Cambiar la fecha");
                int responseDate = Integer.valueOf(sc.nextLine());
                if(responseDate == 2){
                    continue;
                }
                // Hora
                int responseTime = 0;
                String time = "";
                do {
                    // date
                    System.out.println("Ingresa la hora disponible para esta fecha " + date + " [03:00]");
                    time = sc.nextLine();
                    // Confirmacion
                    System.out.println("La fecha de tu cita es: " + date + "\n1.-Correcto\n2.-Cambiar la fecha");
                    responseTime = Integer.valueOf(sc.nextLine());
                } while (responseTime == 2);
                UIMenu.doctorLogged.addAvailableAppointment(date , time);
            } else if (response == 0) {
                dotorMenuUI();
            }
        } while (response != 0);
    }
}