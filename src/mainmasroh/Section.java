/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainmasroh;

import java.util.List;

public class Section {
    private int sectionId;
    private int numberOfCells;
    private String name;
    private List<Cell> cells;

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public int getNumberOfCells() {
        return numberOfCells;
    }

    public void setNumberOfCells(int numberOfCells) {
        this.numberOfCells = numberOfCells;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cell> getCells() {
        return cells;
    }

    public void setCells(List<Cell> cells) {
        this.cells = cells;
    }

    public Section(int sectionId, int numberOfCells, String name, List<Cell> cells) {
        this.sectionId = sectionId;
        this.numberOfCells = numberOfCells;
        this.name = name;
        this.cells = cells;
    }

    @Override
    public String toString() {
        return "Section{" + "sectionId=" + sectionId + ", numberOfCells=" + numberOfCells + ", name=" + name + ", cells=" + cells + '}';
    }

    
}
