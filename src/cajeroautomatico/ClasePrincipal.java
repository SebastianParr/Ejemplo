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
public class ClasePrincipal {
    public static void main(String[] args) {
        ClasePadre var= new ClaseHijaDeposito();
        var.setSaldo(800000);
        var.menu();
    }
}

