public class Doctor extends User {
    // Atributos
    static int id = 0;
    String speacilty;

    // Constructor
    public Doctor(String name, String email, String speacilty){
        super(name, email);
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
}
