package module;

public class Doctor extends User {
    // Atributos
    static int id = 0;
    String speacilty;

    // Constructor
    public Doctor(String name, String email, int phoneNumber, String speacilty){
        super(name, email, phoneNumber);
        this.speacilty=speacilty;
        id++;
    }


    // Metodos
    public void printData(){
        System.out.println(getName() + " " + speacilty);
    }
    public void printId(){
        System.out.println(id);
    }

    @Override
    public String toString() {
        return super.toString() + " Specialiity: " + speacilty + " Avaiilable: ";
    }
}
