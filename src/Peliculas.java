import java.util.Scanner;

public class Peliculas {
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

    public static void pelicula(){
        int response = 0;
        do {
            System.out.println("Selecciona el numero de la opcion deseada: /n");
            System.out.println("1.- Movies /n");
            System.out.println("2.- Series /n");
            System.out.println("0.- Salir");

            // Scanner
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine()); // Capturamos la respuesta del usuario

            switch (response) {
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Peliculas: /n" + PELICULAS + "/n");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("No hay nada :0");
                    break;
            };
        } while (response != 0);
    }
}
