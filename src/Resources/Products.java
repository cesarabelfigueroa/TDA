package Resources;

import Structures.LinkedList;
import java.sql.Time;

public class Products {
    private String name;
    private String description;
    private Time time;
    private LinkedList materials;

    public Products(String name, String description, Time time, LinkedList materials) {
        this.name = name;
        this.description = description;
        this.time = time;
        this.materials = materials;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public LinkedList getMaterials() {
        return materials;
    }

    public void setMaterials(LinkedList materials) {
        this.materials = materials;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}