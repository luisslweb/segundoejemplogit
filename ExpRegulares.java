package expregulares;

import java.util.regex.*;

public class ExpRegulares
{
    public static void main(String[] args)
    {
        try{
            System.out.println("***** Validar correos electronicos validos *****");
            System.out.println("");

            String cadena = "luis_infweb@yahoo.com";

            /*
            * Se necesita esta libreria para utilizar expresiones regulares: import java.util.regex.*;
            *
            * La clase Pattern(), es el acceso principal de la API a las expresiones regulares de Java.
            * La clase Matcher(), se utiliza para buscar a traves de un texto de varias apariciones de una expresion regular
            */

            //Expresion Regular
            Pattern ereg = Pattern.compile("^[\\w\\d\\.\\_\\-]+\\@[a-z]{3,}\\.[a-z]{2,4}(\\.[a-z]{2,4})?$");

            if (ereg.matcher(cadena).find()){
                //Devuelve TRUE
                System.out.println("El e-mail: " + cadena + ", es correo VALIDO...");
            } else{
                //Devuelve FALSE
                System.out.println("El e-mail: " + cadena + ", correo NO valido...");
            }

            System.out.println("");
            System.out.println("***** Validar numeros de celular *****");
            System.out.println("");

            String numCelular = "62336779";

            //Expresion Regular
            Pattern ereg1 = Pattern.compile("^[67]\\d{7}$");
            boolean result = ereg1.matcher(numCelular).find();

            if(result) {
                //Devuelve TRUE
                System.out.println("El numero de celular: " + numCelular + ", es VALIDO...");
            } else{
                //Devuelve FALSE
                System.out.println("El numero de celular: " + numCelular + ", NO es valido...");
            }
        } catch(Exception e)  {
            System.out.println("***** El Error es: " + e.getMessage());
        }
    }
}
