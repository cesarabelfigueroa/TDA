package Resources;

import Structures.LinkedList;
import Structures.Queue;
import Structures.Stack;

public class Application {

    private LinkedList products = new LinkedList();
    private Stack employees = new Stack();
    private Queue materials = new Queue();

    public Application() {
        Material test1 = new Material("test1", "test1", "test1", 4);
        Material test2 = new Material("test2", "test2", "test2", 4);
        Material test3 = new Material("test3", "test3", "test3", 4);
        products.insert(0, new Product("prueba", "prueba", 5));
        employees.push(new Employee( "César", "0801-1997-22799", 18, "Casamata", 20000.0, this));
        employees.push(new Employee("Pedro", "0801-1997-22799", 18, "Casamata", 20000.0, this));
        ((Product) products.at(0)).getMaterials().insert(0, test1);
        ((Product) products.at(0)).getMaterials().insert(0, test2);
        ((Product) products.at(0)).getMaterials().insert(0, test3);
        materials.queue(test1);
        materials.queue(test2);
        materials.queue(test3);
    }

    public LinkedList getProducts() {
        return products;
    }

    public void setProducts(LinkedList products) {
        this.products = products;
    }

    public Stack getEmployees() {
        return employees;
    }

    public void setEmployees(Stack employees) {
        this.employees = employees;
    }

    public Queue getMaterials() {
        return materials;
    }

    public void setMaterials(Queue materials) {
        this.materials = materials;
    }

    public void produce() {
        while (!employees.isEmpty()) {
            ((Thread) employees.pop()).start();
        }
    }
}