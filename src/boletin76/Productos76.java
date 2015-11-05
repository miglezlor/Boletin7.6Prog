
package boletin76;

import javax.swing.JOptionPane;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Productos76 {
    
    public int pedirVendas(){
        int vendas;
        String res= JOptionPane.showInputDialog("Introudce as vendas");
        vendas=Integer.parseInt(res);
        return vendas;
    }
    
    public void comprobarVendas (int vendas){
        
        if (vendas<=100)
            System.out.println("Consumo baixo");
        else if (vendas>100 & vendas<=500)
            System.out.println("Consumo medio");
        else if (vendas>500 & vendas<=1000)
            System.out.println("Consumo alto");
        else
            System.out.println("Primeira necesidade");
    }
}
