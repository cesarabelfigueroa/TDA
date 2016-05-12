package Resources;

import Structures.LinkedList;
import Structures.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Employee extends Thread {

    private String names;
    private String id_number;
    private int age;
    private String address;
    private double salary;
    Application application;

    public Employee(String names, String id_number, int age, String address, double salary, Application application) {
        this.names = names;
        this.id_number = id_number;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.application = application;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return names;
    }

    @Override
    public void run() {
        execute();
    }

    public void execute() {
        Queue materials = application.getMaterials();
        LinkedList products = application.getProducts();
        for (int i = 0; i < products.getSize(); i++) {
            LinkedList recentProductions = new LinkedList();
            try {
                Product product = (Product) products.at(i);
                LinkedList requiredMaterials = product.getMaterials();
                
                while (!materials.isEmpty()) {
                    for (int j = 0; j < requiredMaterials.getSize(); j++) {
                        if (materials != null && !materials.isEmpty()) {
                            if (requiredMaterials.find(materials.peek()) != -1) {
                                if (!materials.isEmpty()) {
                                    Material material = (Material) materials.dequeue();
                                    recentProductions.insert(recentProductions.getSize() > 0 ? recentProductions.getSize() - 1 : 0, material);
                                }
                            }
                        }
                    }
                }
                if (requiredMaterials.getSize() == recentProductions.getSize()) {
                    System.out.println("si ajustaron los materiales");
                } else {
                    System.out.println("No ajustaron los materiales");
                }
                
            } catch (Exception ex) {
                
            }
        }
    }
}
