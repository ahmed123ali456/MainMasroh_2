
package mainmasroh;

import java.util.ArrayList;
import java.util.List;

public class Guard extends Person {
    private String jobTitle;
    private String shiftTime;
    private List<Visit> visits;
    private List<Prisoner> prisoners;

    public Guard(String jobTitle, String shiftTime, List<Visit> visits, List<Prisoner> prisoners, String name, int id) {
        super(name, id);
        this.jobTitle = jobTitle;
        this.shiftTime = shiftTime;
        this.visits =new ArrayList<>();
        this.prisoners = prisoners;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getShiftTime() {
        return shiftTime;
    }

    public void setShiftTime(String shiftTime) {
        this.shiftTime = shiftTime;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    public List<Prisoner> getPrisoners() {
        return prisoners;
    }

    public void setPrisoners(List<Prisoner> prisoners) {
        this.prisoners = prisoners;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

}

