package module;

import module.User;

public class Patient extends User {
    // Modificadores de acceso
    private String birthday;
    private double weight;
    private double height;
    private String blood;

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
