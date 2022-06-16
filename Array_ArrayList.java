package array_arraylist;

import java.util.*;

public class Array_ArrayList
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try{
            // TODO code application logic here
            System.out.println("***** MANEJANDO ArrayList *****");
            System.out.println("");

            ArrayList<String> arrayNombre = new ArrayList();

            arrayNombre.add("HUGO");
            arrayNombre.add("PACO");
            arrayNombre.add("NOEL");
            arrayNombre.add("DONALD");
            arrayNombre.add("PLUTO");
            arrayNombre.add("MIKY");

            System.out.println("***** Los elementos de ArrayList son:");
            System.out.println(arrayNombre);

            System.out.println("");
            System.out.println("***** Opcion 1: Recorremos los elementos del ArrayList utilizando el FOR:");

            //Opcion-1: Recorrer los elemento del ArrayList
            for(int i = 0; i < arrayNombre.size(); i++){
                System.out.println(arrayNombre.get(i));
            }

            System.out.println("");
            System.out.println("***** Opcion 2: Recorremos los elementos del ArrayList utilizando el WHILE:");

            //Opcion-2: Recorrer los elemento del ArrayList
            Iterator it = arrayNombre.iterator(); //se crea el iterador it para el array numeros

            while(it.hasNext()) {                 //Mientras queden elementos
                System.out.println(it.next());    //Se obtienen y se muestran
            }

        } catch(Exception e)  {
            System.out.println("***** El Error es: " + e.getMessage());
        }
    }

}
