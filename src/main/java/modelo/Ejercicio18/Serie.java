package modelo.Ejercicio18;

import java.util.Scanner;

public class Serie implements EntregableEjercicio18 {

    private String titulo = "";
    private int numTemporadas = 3;
    private boolean entregado = false;
    private String genero = "";
    private String creador = "";
    Scanner teclado = new Scanner(System.in);

    public Serie (){
        this.titulo = titulo;
        this.numTemporadas = numTemporadas;
        this.entregado = entregado;
        this.genero = genero;
        this.creador = creador;
    }
    public Serie (String titulo, String creador){
        this.numTemporadas = numTemporadas;
        this.entregado = entregado;
        this.genero = genero;
    }
    public Serie( String titulo, String creador, int numTemporadas, String genero){
    }

    public int getNumTemporadas() {
        System.out.println("Ingrese numero de temporadas");
        this.numTemporadas = teclado.nextInt();
        return numTemporadas;
    }
    public String getGenero() {
        System.out.println("Ingrese genero ");
        this.genero = teclado.next();
        return genero;
    }
    public String getCreador() {
        System.out.println("Ingrese creador ");
        this.creador = teclado.next();
        return creador;
    }
    public String getTitulo() {
        System.out.println("Ingrese el titulo ");
        this.titulo = teclado.next();
        return titulo;
    }
    public void setCreador(String creador) {
        this.creador = creador;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String toString() {
        return "Serie{" +
                "TituloPeli= " + getTitulo() + '\'' +
                ", Genero=" + getGenero() +
                ", Creador='" + getCreador() + '\'' +
                ", NumTemporadas=" + getNumTemporadas() +
                '}';
    }

    public void entregar(){
        this.entregado = true;
    }
    public void devolver(){
        this.entregado = false;
    }
    public boolean isEntregado(){
        return this.entregado;
    }

    public void compareTo(Object objeto) {
        Serie serie = (Serie) objeto;
        if (serie.numTemporadas > serie.numTemporadas) {
            System.out.println("A");
        } else if (serie.numTemporadas > serie.numTemporadas) {
            System.out.println("B. Son iguales el número de horas");
        } else {
            System.out.println("C");
        }
    }
}
