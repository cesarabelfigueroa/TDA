package Resources;

import Structures.LinkedList;
import Structures.Queue;
import Structures.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Employee  {

    private String names;
    private String id_number;
    private int age;
    private String address;
    private double salary;


    public Employee(String names, String id_number, int age, String address, double salary) {
        this.names = names;
        this.id_number = id_number;
        this.age = age;
        this.address = address;
        this.salary = salary;
    
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
}