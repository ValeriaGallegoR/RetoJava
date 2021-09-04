package modelo;

import java.util.Scanner;

public class OpNumeros {

    private double num1;
    private double num2;
    private int limite;
    private int num;
    Scanner teclado = new Scanner(System.in);

    public double getNum1() {
        System.out.println("Ingrese el primer número: ");
        double num1 = teclado.nextDouble();
        return num1;
    }

    public double getNum2() {
        System.out.println("Ingrese el segundo número: ");
        double num2 = teclado.nextDouble();
        return num2;
    }

    public void obtenerNumMayor() {
        num1 = this.getNum1();
        num2 = this.getNum2();
        if (num1 == num2) {
            System.out.println("Los números son iguales ");
        } else {
            System.out.println("El mayor de los dos números es " + Math.max(num1, num2));
        }
    }

    public void obtenerParImpar() {

        this.limite = 100;

        for (this.num = 1; num < limite; num++) {
            if (num % 2 == 0) {
                System.out.println("Par: " + num);
            } else {
                System.out.println("Impar: " + num);
            }
        }
        /*
        this.num = 1;
        while (num <= 100) {
            if (num % 2 == 0) {
                System.out.println("Par: " + num);
            } else {
                System.out.println("Impar: " + num);
            }
            num++;
        }*/
    }
}

