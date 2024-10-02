
package mainmasroh;
public class Crime {
    private int crimeId;
    private String type;
    private String description;
    private Judgment judgment;

    // Constructors, Getters, and Setters

    public Crime(int crimeId, String type, String description, Judgment judgment) {
        this.crimeId = crimeId;
        this.type = type;
        this.description = description;
        this.judgment = judgment;
    }

    public int getCrimeId() {
        return crimeId;
    }

    public void setCrimeId(int crimeId) {
        this.crimeId = crimeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Judgment getJudgment() {
        return judgment;
    }

    public void setJudgment(Judgment judgment) {
        this.judgment = judgment;
    }

    @Override
    public String toString() {
        return "Crime{" + "crimeId=" + crimeId + ", type=" + type + ", description=" + description + ", judgment=" + judgment + '}';
    }
    
}
