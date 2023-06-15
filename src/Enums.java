public class Enums {
    public enum day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public enum Day{
        // Instancia
        Monday("Lunes");

        // Atributo
        private String spanish;
        // Constructor
        private Day(String s) {
            spanish = s;
        }
        // Metodo
        private String getSpanish(){
           return spanish;
        }
    }
}
