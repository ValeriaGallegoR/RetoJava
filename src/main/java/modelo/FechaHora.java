package modelo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FechaHora {
    public void fechaHoraActual (){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));
    }
}
