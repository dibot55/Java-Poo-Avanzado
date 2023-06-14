public class Acceso {
    // Modificadores de acceso
    private String name;
    private String email;
    private String address;
    private int phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Acceso(String name, String email){
        this.name=name;
        this.email=email;
    }

    // Encapsulamiento
    public String getWeight() {
        return weight + "kg";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        if (phoneNumber > 8) {
            System.out.println("No se permiten colocar numeros mayores a 8 digitos");
        } else if(phoneNumber==8){
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("No se permiten numeros menores a 8 digitos");
        }
    }
}
