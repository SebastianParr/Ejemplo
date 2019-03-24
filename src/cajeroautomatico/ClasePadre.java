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
public abstract class ClasePadre {

    private static double saldo;

    protected double retiro, depositar, dato;
    protected int opcion;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void opcion() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción"));
    }

    public void Retirar() {
        retiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar"));
    }

    public void Depositar() {
        depositar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a Depositar"));
    }

    public abstract void transacciones();

    public void menu() {

            System.out.println("--------------------------");
            System.out.println(" 1-Consulta de saldo");
            System.out.println(" 2-Retiro de efectivo");
            System.out.println(" 3-Deposito de efectivo");
            System.out.println(" 4-Salir");
            System.out.println("--------------------------");
            
        do {
            opcion();

            

            switch (opcion) {

                case 1:
                    ClasePadre var = new ClaseHijaCuenta();
                    var.transacciones();
                    break;
                case 2:

                    ClasePadre var1 = new ClaseHijaRetiro();
                    var1.transacciones();
                    break;
                case 3:

                    ClasePadre var2 = new ClaseHijaDeposito();
                    var2.transacciones();
                    break;
                case 4:
                    System.out.println("------------------------");
                    System.out.println(" Gracias. Vuelva pronto...");
                    System.out.println("------------------------");
                    System.exit(0);
                    break;
                default:
                    System.out.println("No es un opción válida");
                    break;
            }
        } while (opcion != 4);
    }

}
