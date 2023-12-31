package module;

import module.interfaz.ISchedule;
import java.util.Date;
public class AppointmentNurse implements ISchedule {
    private int id;
    private Nurse nurse;
    private String date;
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void schedule(String date, String time) {
        this.date=date;
        this.time=time;
    }
}
