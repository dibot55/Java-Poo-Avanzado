public class Enums {
    public enum day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public enum Day{
        Monday("Lunes");

        private String spanish;
        private Day(String s) {
            spanish = s;
        }

        private String getSpanish(){
           return spanish;
        }
    }
}
