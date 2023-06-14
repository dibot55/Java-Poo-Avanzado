public class Doctor {
    // Atributos
    static int id = 0;
    String name;
    String speacilty;

    // Constructor
    public Doctor(String name, String speacilty){
        this.name=name;
        this.speacilty=speacilty;
        id++;
    }

    // Metodos
    public void printData(){
        System.out.println(name + " " + speacilty);
    }
    public void printId(){
        System.out.println(id);
    }
}
