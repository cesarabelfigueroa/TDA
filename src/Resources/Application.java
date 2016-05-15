package Resources;

import Structures.LinkedList;
import Structures.Queue;
import Structures.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {

    private Queue products = new Queue();
    private Queue employees = new Queue();
    private Stack materials = new Stack();
    private LinkedList inventoryOfMaterials = new LinkedList();
    private LinkedList listOfEmployees = new LinkedList();
    private LinkedList listOfMaterials = new LinkedList();

    public Application() {

    }

    public LinkedList getInventoryOfMaterials() {
        return inventoryOfMaterials;
    }

    public void setlistOfMaterials(LinkedList inventoryOfMaterials) {
        this.inventoryOfMaterials = inventoryOfMaterials;
    }

    public LinkedList getMaterialsNames() {
        return listOfMaterials;
    }

    public void setMaterialsNames(LinkedList materialsNames) {
        this.listOfMaterials = materialsNames;
    }

    public Queue getProducts() {
        return products;
    }

    public void setProducts(Queue products) {
        this.products = products;
    }

    public Queue getEmployees() {
        return employees;
    }

    public void setEmployees(Queue employees) {
        this.employees = employees;
    }

    public Stack getMaterials() {
        return materials;
    }

    public void setMaterials(Stack materials) {
        this.materials = materials;
    }

    public LinkedList getListOfEmployees() {
        return listOfEmployees;
    }

    public void setListOfEmployees(LinkedList listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }

    public void produce() {
        ExecutorService executor = Executors.newFixedThreadPool(employees.getSize());
        while (!products.isEmpty()) {
            if (!employees.isEmpty()) {
                if (!materials.isEmpty()) {
                    Product product = (Product) products.dequeue();
                    Employee employee = (Employee) employees.dequeue();
                    Material material = (Material) materials.pop();
                    Runnable product_line = new ProductionLine(employee, product, material);
                    executor.execute(product_line);
                    employees.queue(employee);
                }
            }
        }
        executor.shutdown();
    }

    public void addMaterial(Material material) {
        listOfMaterials.insert(listOfMaterials.getSize(), material);
        inventoryOfMaterials = new LinkedList();
        for (int i = 0; i < listOfMaterials.getSize(); i++) {
            material = (Material) listOfMaterials.at(i);
            if (inventoryOfMaterials.getSize() == 0) {
                Stack temporal = new Stack();
                temporal.push(material);
                inventoryOfMaterials.insert(inventoryOfMaterials.getSize(), temporal);
            } else {
                for (int j = 0; j < inventoryOfMaterials.getSize(); j++) {
                    Stack temporal = (Stack) inventoryOfMaterials.at(j);
                    if (!temporal.isEmpty()) {
                        if (((Material) temporal.peek()).getSeries_number().equals(material.getSeries_number())) {
                            temporal.push(material);
                        }
                    } else {
                        temporal.push(material);
                    }
                }

                Stack temporal = new Stack();
                temporal.push(material);
                inventoryOfMaterials.insert(inventoryOfMaterials.getSize(), temporal);
            }
        }
    }

    public void deleteMaterial(Material material) {
        if (material != null) {
            int index = indexOfMaterial(material.getName());
            if (index != -1) {
                listOfMaterials.remove(index);
                inventoryOfMaterials = new LinkedList();
                for (int i = 0; i < listOfMaterials.getSize(); i++) {
                    material = (Material) listOfMaterials.at(i);
                    if (inventoryOfMaterials.getSize() == 0) {
                        Stack temporal = new Stack();
                        temporal.push(material);
                        inventoryOfMaterials.insert(inventoryOfMaterials.getSize(), temporal);
                    } else {
                        for (int j = 0; j < inventoryOfMaterials.getSize(); j++) {
                            Stack temporal = (Stack) inventoryOfMaterials.at(j);
                            if (!temporal.isEmpty()) {
                                if (((Material) temporal.peek()).getSeries_number().equals(material.getSeries_number())) {
                                    temporal.push(material);
                                }
                            } else {
                                temporal.push(material);
                            }
                        }

                        Stack temporal = new Stack();
                        temporal.push(material);
                        inventoryOfMaterials.insert(inventoryOfMaterials.getSize(), temporal);
                    }
                }
            }
        }
    }

    public void addEmployee(Employee employee) {
        listOfEmployees.insert(listOfEmployees.getSize(), employee);
        employees.queue(employee);
    }

    public int indexOfMaterial(String name) {
        for (int i = 0; i < listOfMaterials.getSize(); i++) {
            if (((Material) listOfMaterials.at(i)).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void deleteEmployee(Employee employee) {
        int index = listOfEmployees.find(employee);
        if (index != -1) {
            listOfEmployees.remove(index);
            Queue temporal = new Queue();
            while (!employees.isEmpty()) {
                if (employees.peek().equals(employee)) {
                    employees.dequeue();
                } else {
                    temporal.queue(employees.dequeue());
                }
            }
            employees = temporal;
        }
    }

    public int indexOfEmployee(String id) {
        for (int i = 0; i < listOfEmployees.getSize(); i++) {
            if (((Employee) listOfEmployees.at(i)).getId_number().equals(id)) {
                return i;
            }
        }
        return -1;

    }
}
