/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainmasroh;

public class Visit {
    private int visitId;
    private int duration;
    private String date;
    private String visitorName;
    private Prisoner prisoner;
    private Guard guard;

    public Visit(int visitId, int duration, String date, String visitorName, Prisoner prisoner, Guard guard) {
        this.visitId = visitId;
        this.duration = duration;
        this.date = date;
        this.visitorName = visitorName;
        this.prisoner = prisoner;
        this.guard = guard;
    }

    public int getVisitId() {
        return visitId;
    }

    public void setVisitId(int visitId) {
        this.visitId = visitId;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public Prisoner getPrisoner() {
        return prisoner;
    }

    public void setPrisoner(Prisoner prisoner) {
        this.prisoner = prisoner;
    }

    public Guard getGuard() {
        return guard;
    }

    public void setGuard(Guard guard) {
        this.guard = guard;
    }

    @Override
    public String toString() {
        return "Visit{" + "visitId=" + visitId + ", duration=" + duration + ", date=" + date + ", visitorName=" + visitorName + ", prisoner=" + prisoner + ", guard=" + guard + '}';
    }

   
}

