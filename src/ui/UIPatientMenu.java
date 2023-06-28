package ui;

import module.Doctor;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {
    public static void patientMenuUI(){
        int response = 0;
        System.out.println("\n\n");
        System.out.println("Patient");
        System.out.println("Welcome " + UIMenu.patientLogged.getName());
        System.out.println("1.- Agenda una cita");
        System.out.println("2.- Citas disponibles");
        System.out.println("0.- Loggout");
        // Scanner
        do {
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response){
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientMyAppointments();
                    break;
                case 0:
                    break;
                default:
                    UIMenu.menuHospital();
                    break;
            }
        } while (response != 0);
    }

    private static void showBookAppointmentMenu(){
        int response = 0;
        do {
            System.out.println();
            System.out.println(":: Agendar cita disponible");
            System.out.println(":: Selecciona una fecha");
            // Map<LLave, Valor> = Map<indice, Map<Indice Fecha, Doctor>>
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointment.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments
                        = UIDoctorMenu.doctorsAvailableAppointment.get(i).getAvailableAppointment();
                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();
                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ".- " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointment.get(i));
                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }
            }
            // Scanner
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());
            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("","",0, "");
            // Buscar indice y datos de doctorAvailableSelected
            // entrySet() - Obtiene el par clave-valor de un Entry en un map
            for (Map.Entry<Integer, Doctor> doctorEntry: doctorAvailableSelected.entrySet()
                 ) {
                indexDate = doctorEntry.getKey();
                doctorSelected = doctorEntry.getValue();
            }
            System.out.println(doctorSelected.getName()
                    + ". Date: " + doctorSelected.getAvailableAppointment().get(indexDate).getDate()
                    + ". Time: " + doctorSelected.getAvailableAppointment().get(indexDate).getTime());
            System.out.println("confirma tu cita: \n1.- Si \n2.- Cambiar datos");
            response = Integer.valueOf(sc.nextLine());
            if (response == 1){
                UIMenu.patientLogged.addAppointmentDoctors(
                        doctorSelected,
                        doctorSelected.getAvailableAppointment().get(indexDate).getDate(),
                        doctorSelected.getAvailableAppointment().get(indexDate).getTime()
                        );
                patientMenuUI();
            } else if (response == 2 ){
                continue;
            }
        } while (response == 0);
    }

    private static void showPatientMyAppointments(){
        int response = 0;
        do {
            System.out.println(":: My appointments");
            if (UIMenu.patientLogged.getAppointmentDoctors().size() == 0){
                System.out.println("Don't have appointments");
                break;
            }
            for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
                int j = i + 1;
                System.out.println(
                    j +
                    ".- " +
                    "Date: " +
                    UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() +
                    "Time: " +
                    UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() +
                    "\nDoctor: " +
                    UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName()
                    );
            }
            System.out.println("0.- Salir");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
        } while (response != 0);
    }
}
