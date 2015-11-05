
package boletin76;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Boletin76 {


    public static void main(String[] args) {

        int vendas;
        Productos76 obx= new Productos76();
        vendas=obx.pedirVendas();
        obx.comprobarVendas(vendas);
        
    }
    
}
