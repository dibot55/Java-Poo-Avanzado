package module;

public class Nurse extends User{
    // Atributos
    private String Speciality;
    // Constructor
    public Nurse(String name, String email, int phoneNumber){
        super(name, email, phoneNumber);
    }

    // Get & Set
    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }
}
