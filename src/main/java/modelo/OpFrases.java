package modelo;

import java.util.Scanner;

public class OpFrases {

    Scanner teclado = new Scanner(System.in);
    private String cadena;

    public String getFrase() {
        System.out.println("Ingrese una frase u oración: ");
        this.cadena = teclado.nextLine();
        return cadena;
    }
    public void cambiarLetras (){
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        getFrase();
        System.out.println(this.cadena + " " + frase.replace('a', 'e'));
    }

    public void eliminarEspacios(){
        cadena = this.getFrase();
        String result = cadena.replaceAll("\\s+","");
        System.out.println(result);
    }
}
