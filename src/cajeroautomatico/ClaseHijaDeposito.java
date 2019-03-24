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
public class ClaseHijaDeposito extends ClasePadre {

    @Override
    public void transacciones() {
        Depositar();
        System.out.println(" Ingrese la cantidad a depositar: "+depositar);
        if (depositar>=1) {
            dato= getSaldo();
            setSaldo(dato+depositar);
            System.out.println(" Acabas de depositar a tu cuenta "+depositar+" pesos."
                    + " Tu saldo actual es: " + getSaldo());
        }else{
            System.err.println(" La cantidad ingresada no es permitida."
                    + " Debe ingresar una cantidad mayor o igual a 1");
        }

    }
}
