package Resources;

import Structures.LinkedList;
import Structures.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class ProductionLine implements Runnable {

    private Employee employee;
    private LinkedList materials;
    private Product product;
    private boolean status = false;
    private LinkedList inventory;
    private LinkedList listOfMaterial;
    int value = 0;

    JProgressBar progress;

    public ProductionLine(Employee employee, Product product, LinkedList materials, LinkedList inventory, LinkedList listOfMaterials, JProgressBar progress, int value) {
        this.employee = employee;
        this.materials = materials;
        this.product = product;
        this.progress = progress;
        this.inventory = inventory;
        this.listOfMaterial = listOfMaterials;
        this.value = value;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LinkedList getMaterials() {
        return materials;
    }

    public void setMaterials(LinkedList materials) {
        this.materials = materials;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < inventory.getSize(); i++) {
            Stack type = (Stack) inventory.at(i);
            for (int j = 0; j < materials.getSize(); j++) {
                Material material = (Material) materials.at(j);
                if (material.getSeries_number().equals(((Material) type.peek()).getSeries_number())) {
                    type.pop();
                    listOfMaterial.remove(listOfMaterial.find(material));
                    count++;
                }
            }
        }
        if (count < materials.getSize()) {
            JOptionPane.showMessageDialog(null, "Lo siento no se pudo construir el producto " + product + " porque faltaban materiales.");
        } else {
            try {
                Thread.sleep(product.getTime() * 1000);
                progress.setValue(progress.getValue() + ((int) product.getTime()/value*100));
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductionLine.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
