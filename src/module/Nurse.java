package module;

public class Nurse extends User{
    // Atributos
    private String Speciality;
    // Constructor
    public Nurse(String name, String email, int phoneNumber){
        super(name, email, phoneNumber);
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz roja");
        System.out.println("Departamento: Atender Pacientes");
    }

    // Get & Set
    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }
}
