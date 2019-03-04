/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autos;

import javax.swing.JOptionPane;

/**
 *
 * @author lizeth
 */
public class Principal {
    public static void main(String[] args){
        
        Carro carro1 = new Carro();        
        int opcion;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bievenido venta de autos\n" + "1. Vendedor Uno\n" + "2. Vendedor Dos\n" + "3. Vendedor Tres\n"));
        /* Ménu de opciones */
        switch(opcion){
            case 1: 
                System.out.println("Vendedor: 1");
                carro1.verMarca();
                carro1.verModelo();
                carro1.verColor();
                carro1.elegirCantidad();
                carro1.mostrarCompra();
                break;
                
            case 2: 
                System.out.println("Vendedor: 2");
                carro1.verMarca();
                carro1.verModelo();
                carro1.verColor();
                carro1.elegirCantidad();
                carro1.mostrarCompra();
                break;
                
            case 3: 
                System.out.println("Vendedor: 3");
                carro1.verMarca();
                carro1.verModelo();
                carro1.verColor();
                carro1.elegirCantidad();
                carro1.mostrarCompra();
                break;
        } System.exit(0);
    }
}
