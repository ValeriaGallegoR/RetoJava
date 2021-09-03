package modelo;

public class EsMayor {

    private double num1;
    private double num2;

    public EsMayor(){
        this.num1 = 10.0;
        this.num2 = 10.5;
    }

    public void numMayor() {
        if (this.num1 == this.num2) {
            System.out.println("Los números son iguales ");
        } else {
            System.out.println("El mayor de los dos números es " + Math.max(this.num1, this.num2));
        }
    }
}
