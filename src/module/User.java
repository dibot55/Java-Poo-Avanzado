package module;
// Clase abstracta
public abstract class User {
    private int id;
    private String name;
    private String email;
    private int phoneNumber;

    public User(String name, String email, int phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    // Sobrecarga de metodos - Polimorfisimo
    @Override
    public String toString() {
        return "module.User: " + name + ", Email: " + email + "\n Phone: " + phoneNumber;
    }
    // Metodo abstracto
    public abstract void showDataUser();
}
