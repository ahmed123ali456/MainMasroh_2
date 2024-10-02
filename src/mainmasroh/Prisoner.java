/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainmasroh;

import java.util.List;

public class Prisoner extends Person {
    private String crime;
    private List<Guard> guards;
 private String cell;

    public Prisoner(String crime, List<Guard> guards, String cell, String name, int id) {
        super(name, id);
        this.crime = crime;
        this.guards = guards;
        this.cell = cell;
    }

    public String getCrime() {
        return crime;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }

    public List<Guard> getGuards() {
        return guards;
    }

    public void setGuards(List<Guard> guards) {
        this.guards = guards;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
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
    

    @Override
    public String toString() {
        return "Prisoner{"+"name=" + name + ", id=" + id  + ",crime=" + crime + ", guards=" + guards + ", cell=" + cell + '}';
    }
   

}