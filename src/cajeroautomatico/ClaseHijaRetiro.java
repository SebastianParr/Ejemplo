/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroautomatico;

import javax.swing.JOptionPane;

/**
 *
 * @author Sebastián Parra
 */
public class ClaseHijaRetiro extends ClasePadre{
    
    @Override
    public void transacciones(){
        Retirar();
        System.out.println("-----------------------------------------");
        System.out.println(" Ingrese la cantidad a retirar: "+retiro);
        if(retiro<= getSaldo()){
            dato= getSaldo();
            setSaldo(dato - retiro);
            System.out.println(" Acabas de retirar "+retiro+"." +"\n"
                    + " Tu saldo actual es: "+ getSaldo());
            System.out.println("-----------------------------------------");
        }else{
            System.out.println("--------------------------------------");
            System.err.println(" La cantidad ingresada no es válida.");
            System.out.println("--------------------------------------");
        }
    }
            
}
