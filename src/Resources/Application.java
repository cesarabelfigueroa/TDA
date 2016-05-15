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
    Boolean joining = false;

    public Application() {
        Material test1 = new Material("test1", "test1", "test1", 4);
        Material test2 = new Material("test2", "test2", "test2", 4);
        Material test3 = new Material("test3", "test3", "test3", 4);
        Product product1 = new Product("prueba1", "prueba", 5);
        Product product2 = new Product("prueba2", "prueba", 5);
        Product product3 = new Product("prueba3", "prueba", 5);
        product1.getMaterials().insert(0, test2);
        product1.getMaterials().insert(0, test1);
        product1.getMaterials().insert(0, test3);
        products.queue(product1);
        products.queue(product2);
        products.queue(product3);
        Employee person1 = new Employee("César", "0801-1997-22799", 18, "Casamata", 20000.0);
        Employee person2 = new Employee("Juan", "0801-1997-22799", 18, "Casamata", 20000.0);
        Employee person3 = new Employee("Pedro", "0801-1997-22799", 18, "Casamata", 20000.0);
        employees.queue(person1);
        employees.queue(person2);
        employees.queue(person3);
        materials.push(test1);
        materials.push(test2);
        materials.push(test3);
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

    public void produce() {
        ExecutorService executor = Executors.newFixedThreadPool(employees.getSize());
        while (!products.isEmpty()) {
            if (!employees.isEmpty()) {
                if (!materials.isEmpty()) {
                    Product product = (Product) products.dequeue();
                    Employee employee = (Employee) employees.dequeue();
                    Material material = (Material) materials.pop();
                    Runnable product_line = new ProductionLine(employee, product , material);
                    executor.execute(product_line);
                    employees.queue(employee);
                }
            }
        }
        executor.shutdown();
    }
    
    
    public boolean areEnoughMaterials(Product produt, LinkedList Materials){
        return true;
    }
}
