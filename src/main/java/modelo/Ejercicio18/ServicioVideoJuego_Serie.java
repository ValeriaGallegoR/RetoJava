package modelo.Ejercicio18;

public class ServicioVideoJuego_Serie {

    public void ConsultarEjercicio18 () {

        Serie serieModelo = new Serie();
        VideoJuego videoJuegoModelo = new VideoJuego();
        serieModelo.entregar();
        //serieModelo.compareTo(series);
        serieModelo.devolver();
        serieModelo.toString();
        videoJuegoModelo.entregar();
        //videoJuegoModelo.compareTo(series);
        videoJuegoModelo.devolver();
        videoJuegoModelo.toString();
    }
}
