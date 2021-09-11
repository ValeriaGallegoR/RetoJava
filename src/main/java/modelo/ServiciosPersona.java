package modelo;

import modelo.Persona;

import java.util.Locale;
import java.util.Scanner;

public class ServiciosPersona {

    public void ConsultarEjercicio16() {

        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);;
        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.next();
        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();
        System.out.println("Ingrese su peso en kg: ");
        int peso = teclado.nextInt();
        System.out.println("Ingrese su altura en metros: ");
        double altura = teclado.nextDouble();
        System.out.println("Ingrese su sexo M/H: ");
        String sexo = teclado.next();

        Persona operacionPersona = new Persona();

        Persona obj1 = new Persona();
        obj1.setEdad(edad);
        obj1.setNombre(nombre);
        obj1.setSexo(sexo);
        obj1.setAltura(altura);
        obj1.setPeso(peso);
        operacionPersona.comprobarSexo(sexo);
        operacionPersona.calcularIMC(peso, altura);
        operacionPersona.esMayorDeEdad(edad);

        Persona obj2 = new Persona();
        obj2.setEdad(edad);
        obj2.setNombre(nombre);
        obj2.setSexo(sexo);
        operacionPersona.comprobarSexo(sexo);
        operacionPersona.calcularIMC(peso, altura);
        operacionPersona.esMayorDeEdad(edad);

        Persona obj3 = new Persona();
        obj3.setAltura(altura);
        obj3.setPeso(peso);
        operacionPersona.calcularIMC(peso, altura);
        operacionPersona.esMayorDeEdad(edad);
    }
}
