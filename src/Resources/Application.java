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

    public Application() {

    }

    public LinkedList getInventoryOfMaterials() {
        return inventoryOfMaterials;
    }

    public void setInventoryOfMaterials(LinkedList inventoryOfMaterials) {
        this.inventoryOfMaterials = inventoryOfMaterials;
    }

    public LinkedList getMaterialsNames() {
        return materialsNames;
    }

    public void setMaterialsNames(LinkedList materialsNames) {
        this.materialsNames = materialsNames;
    }
    private LinkedList materialsNames = new LinkedList();

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
        materialsNames.insert(materialsNames.getSize(), material);
        inventoryOfMaterials = new LinkedList();
        for (int i = 0; i < materialsNames.getSize(); i++) {
            material = (Material) materialsNames.at(i);
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
                materialsNames.remove(index);
                inventoryOfMaterials = new LinkedList();
                for (int i = 0; i < materialsNames.getSize(); i++) {
                    material = (Material) materialsNames.at(i);
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
    
    public void addEmployee(){}

    public int indexOfMaterial(String name) {
        for (int i = 0; i < materialsNames.getSize(); i++) {
            if (((Material) materialsNames.at(i)).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
