package Resources;

import Structures.LinkedList;

public class Product {
    private String name;
    private String description;
    private int time;
    private LinkedList materials = new LinkedList();

    public Product(String name, String description, int time) {
        this.name = name;
        this.description = description;
        this.time = time;
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

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
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