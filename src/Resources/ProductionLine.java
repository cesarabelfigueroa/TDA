package Resources;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductionLine implements Runnable {

    Employee employee;
    Material material;
    Product product;

    public ProductionLine(Employee employee, Product product, Material material) {
        this.employee = employee;
        this.material = material;
        this.product = product;
    }

    @Override
    public void run() {
        System.out.println(employee + " está produciendo " + material + " para un " + product);
        try {
            Thread.sleep(product.getTime()*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProductionLine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
