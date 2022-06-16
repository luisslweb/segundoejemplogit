package array_hashmap;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Array_HashMap
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        try{
            //TODO code application logic here
            System.out.println("***** MANEJANDO HashMap *****");
            System.out.println("");

            HashMap<String, String> arrayData = new HashMap<>();

            /*Adicionamos elementos a arrayData de un HashMap*/
            arrayData.put("NOMBRE",    "JUAN");
            arrayData.put("APELLIDO",  "PEREZ CUSCO");
            arrayData.put("CI",        "123654789");
            arrayData.put("DIRECCION", "ZONA VALLE FLORIDA");
            arrayData.put("EMAIL",     "juancho@gmail.com");


            System.out.println("***** Los elementos del arrayData(HashMap) con Key & Value son:");
            System.out.println("");

            System.out.println(arrayData); //Imprime los elemento del arrayData: {DIRECCION=ZONA VALLE FLORIDA, APELLIDO=PEREZ CUSCO, CI=123654789, EMAIL=juancho@gmail.com, NOMBRE=JUAN}

            System.out.println("");
            System.out.println("***** Recorremos los elementos del arrayData(HashMap) utilizando el WHILE:");
            System.out.println("");

            //Recorrer los elemento del arrayData
            Iterator<Map.Entry<String, String>> it = arrayData.entrySet().iterator();

            while (it.hasNext()) {
                Map.Entry<String, String> e = it.next();

                System.out.println("key: " + e.getKey() + ", Value:  " + e.getValue());
            }
        } catch(Exception e)  {
            System.out.println("***** El Error es: " + e.getMessage());
        }
    }

}
