package modelo;

import java.util.Scanner;

public class MenuOpciones {

    public static void menu() {
        System.out.println("****BIENVENIDO A LA GESTION CINEMATOGRAFICA*****");
        System.out.println("Ingrese una de las siguientes opciones: ");
        System.out.println("1. Nuevo actor ");
        System.out.println("2. Buscar actor ");
        System.out.println("3. Eliminar actor ");
        System.out.println("4. Modificar actor ");
        System.out.println("5. Ver todos los actores ");
        System.out.println("6. Ver peliculas de los actores ");
        System.out.println("7. Ver categoría de las peliculas de los actores ");
        System.out.println("8. Salir  ");
    }

    public void llamarMenu() {

        Scanner teclado = new Scanner(System.in);

        menu();
        int opcion = teclado.nextInt();

        if (opcion > 0 && opcion < 9) {
                switch (opcion) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        menu();
                    case 8:
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }
            }
    }
}
