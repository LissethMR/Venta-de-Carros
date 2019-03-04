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
public class Carro {
    /* Atributos */
    public String marca;
    public String modelo;
    public String color;
    public int precio;
    public int cantidad;
    public int cantidadMax;
    public int totalCompra;
    public double comision;
    public int inventario;
    int op;

    /* Constructor de la clase carro
    public Carro(String marca, String modelo, String color, int precio, int cantidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.cantidad = cantidad;
    }*/
    
    /* Médotos de cada atributo de la clase Carro */
    
    public void verMarca(){
        op = Integer.parseInt(JOptionPane.showInputDialog("      MARCA\n"+"1. Mazda\n"+"2. Nissan\n"+"3. Renault\n"+"4. Mercedez\n"+"5. Ford\n"));
        /* Ménu de opcion de marca */
        switch(op){
            case 1: this.marca = "Mazda"; break;
            case 2: this.marca = "Nissan"; break;
            case 3: this.marca = "Renault"; break;
            case 4: this.marca = "Mercedez"; break;
            case 5: this.marca = "Ford"; break;
        }
    }
    
    public void verModelo(){
        
        op = Integer.parseInt(JOptionPane.showInputDialog("      MODELO\n"
                +"1. Deportivo     $50'000.000\n"
                +"2. Crossover     $86'450.000\n"
                +"3. Todo terreno  $150'000.000\n"
                +"4. Camiones      $93'700.000\n"
                +"5. De carga      $135'890.000\n"));
        
        switch(op){
            case 1: 
                this.modelo = "Deportivos";
                this.precio = 50000000;
                this.cantidadMax = 17;
            break;
            case 2:
                this.modelo = "Crossover";
                this.precio = 86450000;
                this.cantidadMax = 8;
            break;
            case 3:
                this.modelo = "Todo terreno";
                this.precio = 150000000;
                this.cantidadMax = 20;
            break;
            case 4:
                this.modelo = "Camiones";
                this.precio = 93700000;
                this.cantidadMax = 45;
            break;
            case 5:
                this.modelo = "De carga";
                this.precio = 135890000;
                this.cantidadMax = 15;
            break;
        }
    }
    public void verColor(){
        op = Integer.parseInt(JOptionPane.showInputDialog("     COLOR\n"+"1. Azul\n"+"2. Rojo\n"+"3. Negro\n"+"4. Blanco\n"+"5. Gris\n"));
        
        switch(op){
            case 1: this.color = "Azul"; break;
            case 2: this.color = "Rojo"; break;
            case 3: this.color = "Negro"; break;
            case 4: this.color = "Blanco"; break;
            case 5: this.color = "Gris"; break;
        }
    }
    /* Este método nos permite obtener la cantidad de carros comprados por el cliente.
     * Catidad de carros disponiblea a vender.
     * Total de la venta y comisión para el vendedor por la realización de la venta. */
    public void elegirCantidad(){        
        op = Integer.parseInt(JOptionPane.showInputDialog("Cuantos autos desea comprar con estas caracteristicas."));
        this.cantidad = op;
        this.totalCompra = this.precio * op;
        this.comision = this.totalCompra * 0.05;
        this.inventario = this.cantidadMax - op;
        
    }
    /* Pintar la información de la venta */
    public void mostrarCompra(){
        if(op <= cantidadMax){
            System.out.println("Marca: "+marca);
            System.out.println("Modelo: "+modelo);
            System.out.println("Color: "+color);
            System.out.println("Precio: $ "+precio);
            System.out.println("Cantidad: "+cantidad);
            System.out.println("Total de la venta: $ "+totalCompra);
            System.out.println("Comisión de la venta: $ "+comision);
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Inventario: "+cantidadMax+" \nDisponibles ahora: "+inventario+" autos.");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("El carro más varato tiene un valor de: $ 50'000.000 pesos");
            System.out.println("El carro más caro tiene un valor de: $ 150'000.000 pesos");
        }
        else {
            System.out.println("Solo tenemos disponibilidad de "+cantidadMax+" autos "+modelo);
        }
    }
    
    /* Getter de cada atributo de la clase carro */
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}
