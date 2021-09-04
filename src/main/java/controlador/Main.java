package controlador;

import modelo.Figura;
import modelo.Numeros;
import modelo.ProductoIVA;

import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("Ingrese una de las siguientes opciones: ");
        System.out.println("1. Numero mayor entre dos variables     ");
        System.out.println("2. Obtener el area de un circulo        ");
        System.out.println("3. Obtener el precio del producto con iva ");
    }

    public static void main(String[] args) {
        Numeros numeros = new Numeros();
        Figura circulo = new Figura();
        ProductoIVA producto = new ProductoIVA();
        Scanner teclado = new Scanner(System.in);

            menu();
            int opcion = teclado.nextInt();
            if (opcion > 0 && opcion < 18) {
                // switch case
                switch (opcion) {
                    case 1:
                        numeros.obtenerNumMayor();
                        break;
                    case 2:
                        circulo.obtenerAreaCirculo();
                        break;
                    case 3:
                        producto.obtenerPrecioproducto();
                        break;
                    default:
                        System.out.println("Incorrecta");
                }
            } else {
                System.out.println("Opcion incorrecta");
            }
        }
}