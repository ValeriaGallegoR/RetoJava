package modelo;

import java.util.Scanner;

public class Figura {

    private double radio;

    Scanner teclado = new Scanner(System.in);

    public double getRadio() {
        System.out.println("Ingrese el radio del circulo: ");
        double radio = teclado.nextDouble();
        return radio;
    }
    public void obtenerAreaCirculo() {
        radio = this.getRadio();
        if (radio > 0) {
            double area = Math.PI * Math.pow(radio, 2);
            System.out.println("El area del circulo es " + area);
        }else System.out.println("Debe ingresar un valor mayor a 0 ");
    }
}
