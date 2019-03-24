/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroautomatico;

/**
 *
 * @author Sebastián Parra
 */
public class ClaseHijaCuenta extends ClasePadre {

    @Override
    public void transacciones() {
        System.out.println("------------------------------------");
        System.out.println(" Tu salado actual es: " + getSaldo());
        System.out.println("------------------------------------");
    }

}
