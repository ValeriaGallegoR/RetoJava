package modelo;

public class Persona  {

    private int edad = 0;
    private int peso = 0;
    private double altura = 0;
    private String DNI;
    private String nombre = "";
    static private String sexo = "H";


    public Persona (String nombre, String sexo, int edad){
        this.edad = edad;
        this.peso = peso;
        this.DNI = DNI;
        this.nombre = nombre;
        this.sexo = sexo;
        this.altura = altura;
    }
    public Persona (){
        this.edad = edad;
        this.peso = peso;
        this.DNI = DNI;
        this.nombre = nombre;
        this.sexo = sexo;
        this.altura = altura;
    }
    public Persona(String nombre, String sexo, int edad, int peso, String DNI, double altura){
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void calcularIMC(int peso, double altura){
        double imcPersona = (peso/(Math.pow(altura,2)));
        double pesoIdeal = -1;
        double debajoPesoI = 0;
        double sobrePeso = 1;

        if(imcPersona < 20){
            System.out.println("Usted tiene el peso ideal " + pesoIdeal);
        }else if (imcPersona >= 20 && imcPersona <=25){
            System.out.println("Usted está por debajo del peso ideal" + debajoPesoI);
        }else if (imcPersona > 25){
            System.out.println("Usted tiene sobrepeso " + sobrePeso);
        }
    }

    public boolean esMayorDeEdad(int edad){
        if(edad <= 18){
            System.out.println("Usted es menor de edad ");
           return false;
        }else {
            System.out.println("Usted es mayor de edad ");
            return true;
        }
    }

    public void comprobarSexo(String sexo){
        if (sexo == "H" || sexo == "M"){
            System.out.println("sexo correcto");
        }else {
            sexo = "H";
        }
    }

    public String toString() {
        return "Persona{" +
                "nombre= " + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public char generaDNI(int dni){
        String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo= dni % 23;
        char letra = juegoCaracteres.charAt(modulo);
        return letra;
    }
}
