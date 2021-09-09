package controlador;

import modelo.Figura;

import modelo.OpNumeros;
import modelo.ProductoIVA;
import modelo.EsLaboral;
import modelo.Numeros;
import modelo.ProductoIVA;


import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("Ingrese una de las siguientes opciones: ");
        System.out.println("1. Numero mayor entre dos variables     ");
        System.out.println("2. Obtener el area de un circulo        ");
        System.out.println("3. Obtener el precio del producto con iva ");

        System.out.println("4. Obtener los números pares e impares del 1-100");
        System.out.println("5. Obtener si un dia es laboral o festivo ");
    }

    public static void main(String[] args) {
        OpNumeros numeros = new OpNumeros();
        Figura circulo = new Figura();
        ProductoIVA producto = new ProductoIVA();
        EsLaboral semana = new EsLaboral();
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
                    case 4:
                        numeros.obtenerParImpar();
                        break;
                    case 5:
                        semana.diaLaboral();
                        break;
                    default:
                        System.out.println("Incorrecta");
                }
            } else {
                System.out.println("Opcion incorrecta");
            }
        }
}