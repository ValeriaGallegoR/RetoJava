package modelo.Ejercicio18;

import java.util.Scanner;

public class VideoJuego implements EntregableEjercicio18 {

    private String titulo = "";
    private int horasEstimadas = 10;
    private boolean entregado = false;
    private String genero = "";
    private String compania = "";
    Scanner teclado = new Scanner(System.in);

    public VideoJuego() {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = entregado;
        this.genero = genero;
        this.compania = compania;
    }

    public VideoJuego(String titulo, int horasEstimadas) {
        this.compania = compania;
        this.entregado = entregado;
        this.genero = genero;
    }

    public VideoJuego(String titulo, String compania, int horasEstimadas, String genero) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public int getHorasEstimadas() {
        System.out.println("Ingrese horas estimadas ");
        this.horasEstimadas = teclado.nextInt();
        return horasEstimadas;
    }

    public String getGenero() {
        System.out.println("Ingrese el genero ");
        this.genero = teclado.next();
        return genero;
    }
    public String getCompania() {
        System.out.println("Ingrese nombre de la compañia");
        this.compania = teclado.next();
        return compania;
    }
    public String getTitulo() {
        System.out.println("Ingrese el titulo del videoJuego ");
        this.titulo = teclado.next();
        return titulo;
    }

    public void setCompania(String creador) {
        this.compania = creador;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setHorasEstimadas(int numTemporadas) {
        this.horasEstimadas = numTemporadas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String toString() {
        return "Videojuego{" +
                "Titulo= " + titulo + '\'' +
                ", Genero=" + genero +
                ", HorasEstimadas='" + horasEstimadas + '\'' +
                ", Compañia=" + compania +
                '}';
    }

    public void entregar() {
        this.entregado = true;
    }

    public void devolver() {
        this.entregado = false;
    }

    public boolean isEntregado() {
        return this.entregado;
    }

    public void compareTo(Object objeto) {
        VideoJuego videoJuego = (VideoJuego) objeto;
        if (videoJuego.horasEstimadas > videoJuego.horasEstimadas) {
            System.out.println("A");
        } else if (videoJuego.horasEstimadas > videoJuego.horasEstimadas) {
            System.out.println("B. Son iguales el número de horas");
        } else {
            System.out.println("C");
        }
    }
}