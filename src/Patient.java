public class Patient extends User{
    // Modificadores de acceso
    private int phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient(String name, String email){
        super(name, email);
    }

    // Encapsulamiento
    public String getWeight() {
        return weight + "kg";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPhoneNumber() {
        return getPhoneNumber();
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
