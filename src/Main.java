public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("yeyo-san", "Amar a Erika chan");
        doctor.printId();
        doctor.printData();

        Doctor doctora = new Doctor("Erika-chan", "Amar yeyo-san");
        doctora.printId();
        doctora.printData();

        Peliculas.pelicula();
    }
}
