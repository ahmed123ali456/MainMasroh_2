/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainmasroh;

public class Judgment {
    private int judgmentId;
    private String type;
    private int duration;

    // Constructors, Getters, and Setters

    public Judgment(int judgmentId, String type, int duration) {
        this.judgmentId = judgmentId;
        this.type = type;
        this.duration = duration;
    }

    public int getJudgmentId() {
        return judgmentId;
    }

    public void setJudgmentId(int judgmentId) {
        this.judgmentId = judgmentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Judgment{" + "judgmentId=" + judgmentId + ", type=" + type + ", duration=" + duration + '}';
    }
    
}
