import java.util.ArrayList;
import java.util.Date;
public class Anidacion {
    // Clase estatica anidada
    public static class AvailableAppointment{
        private Date date;
        private long time;
        public AvailableAppointment(Date date, long time){
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public long getTime(){
            return time;
        }
    }

    // Coleccion
    ArrayList<AvailableAppointment> availableAppointment = new ArrayList<>();
    public void addAvailableAppointment(Date date, long time){
        availableAppointment.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointment(){
        return availableAppointment;
    }

}