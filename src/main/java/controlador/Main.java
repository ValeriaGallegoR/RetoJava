package controlador;

import modelo.*;

import modelo.ProductoIVA;


import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("Ingrese una de las siguientes opciones: ");
        System.out.println("1. Numero mayor entre dos variables delaradas -10 y -1");
        System.out.println("2. Numero mayor entre dos variables     ");
        System.out.println("3. Obtener el area de un circulo        ");
        System.out.println("4. Obtener el precio del producto con iva ");
        System.out.println("5. Obtener los números pares e impares del 1-100 ciclo while");
        System.out.println("6. Obtener los números pares e impares del 1-100 ciclo for");
        System.out.println("7. Obtener si un dia es laboral o festivo ");
        System.out.println("8.");
        System.out.println("9. Cambiar las letras de una frase y añadirle otra ");
        System.out.println("10. Eliminar espacios de una frase u oración ");
    }

    public static void main(String[] args) {
        OpNumeros numeros = new OpNumeros();
        Figura circulo = new Figura();
        ProductoIVA producto = new ProductoIVA();
        EsLaboral semana = new EsLaboral();
        OpFrases frases = new OpFrases();
        Scanner teclado = new Scanner(System.in);

            menu();
            int opcion = teclado.nextInt();
            if (opcion > 0 && opcion < 18) {
                // switch case
                switch (opcion) {
                    case 1:
                        numeros.obtenerNumMayor1();
                        break;
                    case 2:
                        numeros.obtenerNumMayor2();
                        break;
                    case 3:
                        circulo.obtenerAreaCirculo();
                        break;
                    case 4:
                        producto.obtenerPrecioproducto();
                        break;
                    case 5:
                        numeros.obtenerParImparW();
                        break;
                    case 6:
                        numeros.obtenerParImparF();
                        break;
                    case 7:
                        semana.diaLaboral();
                        break;
                    case 8:
                        numeros.Mayor_cero();
                        break;
                    case 9:
                        frases.cambiarLetras();
                        break;
                    case 10:
                        frases.eliminarEspacios();
                        break;
                    default:
                        System.out.println("Incorrecta");
                }
            } else {
                System.out.println("Opcion incorrecta");
            }
        }
}