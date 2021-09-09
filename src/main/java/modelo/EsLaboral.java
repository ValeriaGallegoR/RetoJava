package modelo;

import java.util.Locale;
import java.util.Scanner;

public class EsLaboral {

    Scanner teclado = new Scanner(System.in);

    public void diaLaboral (){
        System.out.println("Ingrese día de la semana: ");
        String dia = teclado.next();
        dia = dia.toLowerCase();
        switch(dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Es un dia festivo");
            default:
                System.out.println("Introduce un dia de la semana");
        }
    }
}
