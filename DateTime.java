package datetime;


import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class DateTime
{
    public static void main(String[] args)
    {
        System.out.println("***** MUESTRA LA FECHA Y HORA DEL SISTEMA *****");
        System.out.println("");


        Date fecha = new Date(); //Intaciamos la clase Date que nos proporciona la Fecha

        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //Formateamos la Fecha en: yyy-MM-dd HH:mm:ss
        String fechaHora = sdformat.format(fecha);

        System.out.println("La Fecha y Hora del sistema es: " + fechaHora);
        System.out.println("");

        LocalDateTime fechaHoraSistema = LocalDateTime.parse(fechaHora, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.out.println("La Fecha y Hora del sistema para Registro a Base de Datos: " + fechaHoraSistema);
    }
}
