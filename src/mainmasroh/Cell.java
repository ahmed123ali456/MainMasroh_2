/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainmasroh;

import java.util.List;

public class Cell {
    private int cellId;
    private String name;
    private List<Prisoner> prisoners;

    public int getCellId() {
        return cellId;
    }

    public void setCellId(int cellId) {
        this.cellId = cellId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Prisoner> getPrisoners() {
        return prisoners;
    }

    public void setPrisoners(List<Prisoner> prisoners) {
        this.prisoners = prisoners;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }
    private Section section;

    @Override
    public String toString() {
        return "Cell{" + "cellId=" + cellId + ", name=" + name + ", prisoners=" + prisoners + ", section=" + section + '}';
    }

   
}

