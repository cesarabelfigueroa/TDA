package Resources;

import Structures.LinkedList;
import Structures.Queue;
import Structures.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Application extends Thread {

    private Queue products = new Queue();
    private Queue employees = new Queue();
    private Stack materials = new Stack();
    private LinkedList catalog_products = new LinkedList();
    private LinkedList inventoryOfMaterials = new LinkedList();
    private LinkedList listOfEmployees = new LinkedList();
    private LinkedList listOfMaterials = new LinkedList();
    private boolean status = false;
    private JProgressBar progress;
    private int value = 0;

    public Application(JProgressBar progress) {
        this.progress = progress;
    }

    public JProgressBar getProgress() {
        return progress;
    }

    public void setProgress(JProgressBar progress) {
        this.progress = progress;
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

    public LinkedList getCatalog_products() {
        return catalog_products;
    }

    public void setCatalog_products(LinkedList catalog_products) {
        this.catalog_products = catalog_products;
    }

    public LinkedList getListOfMaterials() {
        return listOfMaterials;
    }

    public void setListOfMaterials(LinkedList listOfMaterials) {
        this.listOfMaterials = listOfMaterials;
    }

    public int indexOfMaterial(String name) {
        for (int i = 0; i < listOfMaterials.getSize(); i++) {
            if (((Material) listOfMaterials.at(i)).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public int indexOfEmployee(String id) {
        for (int i = 0; i < listOfEmployees.getSize(); i++) {
            if (((Employee) listOfEmployees.at(i)).getId_number().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public int indexOfProduct(String name) {
        for (int i = 0; i < catalog_products.getSize(); i++) {
            if (((Product) catalog_products.at(i)).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void addMaterial(Material material) {
        listOfMaterials.insert(listOfMaterials.getSize(), material);
        refreshMaterialsStack();
    }

    public void addProduct(Product product) {
        catalog_products.insert(catalog_products.getSize(), product);
    }

    public void addEmployee(Employee employee) {
        listOfEmployees.insert(listOfEmployees.getSize(), employee);
        employees.queue(employee);
    }

    public void deleteProduct(Product product) {
        int index = catalog_products.find(product);
        if (index != -1) {
            catalog_products.remove(index);
        }
    }

    public void deleteMaterial(Material material) {
        if (material != null) {
            boolean status = false;
            int index = indexOfMaterial(material.getName());
            if (index != -1) {
                listOfMaterials.remove(index);
                refreshMaterialsStack();
            }
        }
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void refreshMaterialsStack() {
        inventoryOfMaterials = new LinkedList();
        for (int i = 0; i < listOfMaterials.getSize(); i++) {
            boolean status = false;
            Material material = (Material) listOfMaterials.at(i);
            for (int j = 0; j < inventoryOfMaterials.getSize(); j++) {
                Stack temporal = (Stack) inventoryOfMaterials.at(j);
                if (!temporal.isEmpty()) {
                    if (((Material) temporal.peek()).getSeries_number().equals(material.getSeries_number())) {
                        temporal.push(material);
                        status = true;
                    }
                } else {
                    temporal.push(material);
                    status = true;
                }
            }
            if (!status) {
                Stack temporal = new Stack();
                temporal.push(material);
                inventoryOfMaterials.insert(inventoryOfMaterials.getSize(), temporal);
            }
        }
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void run() {
        produce();
    }

    public void produce() {
        ExecutorService executor = Executors.newFixedThreadPool(employees.getSize());
        while (!products.isEmpty() && status) {
            if (!employees.isEmpty()) {
                Product product = (Product) products.dequeue();
                Employee employee = (Employee) employees.dequeue();
                Runnable product_line = new ProductionLine(employee, product, product.getMaterials(), inventoryOfMaterials, listOfMaterials, progress, value);
                ((ProductionLine) product_line).setStatus(status);
                executor.execute(product_line);
                employees.queue(employee);
            }
        }
        status = false;
        executor.shutdown();
    }
}
