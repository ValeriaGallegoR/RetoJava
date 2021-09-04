package modelo;

import java.util.Scanner;

public class ProductoIVA {
    private double producto;

    Scanner teclado = new Scanner(System.in);

    public double getproducto() {
        System.out.println("Ingrese el precio del producto: ");
        double producto = teclado.nextDouble();
        return producto;
    }
    public void obtenerPrecioproducto() {
        producto = this.getproducto();
        double preciototal;
        double temporal;
        if (producto > 0) {
            temporal = producto * 0.21;
            preciototal = producto + temporal;
            System.out.println("El precio final del producto con el iva es " + preciototal);
        }else System.out.println("Debe ingresar un valor mayor a 0 ");
    }
}
