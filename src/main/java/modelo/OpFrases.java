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
    public void longitudVocales(){
        int contador = 0;
        cadena = this.getFrase();
        System.out.println("La longitud de la frase es: " + cadena.length());
        for (int i=0;i<cadena.length();i++){
            //Comprobamos si el caracter es una vocal
            if(cadena.charAt(i)=='a' ||
                    cadena.charAt(i)=='e' ||
                    cadena.charAt(i)=='i' ||
                    cadena.charAt(i)=='o' ||
                    cadena.charAt(i)=='u'){
                contador++;
            }
        } System.out.println("Hay "+contador+" vocales");
    }

    public void compararPalabras(){
        int limiteSuperior;
        int limiteInferior;
        int palabraCorta;

        System.out.println("Ingrese la primera palabra: ");
        String palabra1 = teclado.next();
        System.out.println("Ingrese la segunda palabra: ");
        String palabra2 = teclado.next();

        if(palabra1.equals(palabra2)){
            System.out.println("Las palabras son iguales");
        }else{
            System.out.println("Las palabras no son iguales, diferencias: ");
            if(palabra1.length() < palabra2.length()){
                limiteInferior = palabra1.length();
                palabraCorta = 1;
                limiteSuperior = palabra2.length();}
            else
            {limiteInferior = palabra2.length();
                palabraCorta = 2;
                limiteSuperior = palabra1.length();}

            for (int i=0;i<limiteSuperior;i++){

                if (i<limiteInferior){
                    System.out.print("Letra "+(i+1)+ " "+ palabra1.substring(i,i+1).equals(palabra2.substring(i,i+1))
                            + " en las dos palabras " +"\n");
                } else{
                    System.out.print("La palabra "+palabraCorta+" no tiene letra "+(i+1)+"\n");
                }
            }
        }
    }
}
