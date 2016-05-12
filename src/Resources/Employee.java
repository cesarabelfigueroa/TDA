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
        while (!materials.isEmpty()) {
            Material material = (Material) materials.dequeue();
            Product product = (Product) products.at(0);
            int time = 1;
            while (time != product.getTime()) {
                try {
                    System.out.println(this.getNames() + " está construyendo: " + material);
                    Thread.sleep(1000);
                    time++;
                } catch (InterruptedException ex) {
                    Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}   