package e7;
import java.util.LinkedList;
import java.util.Queue;
//Hector Caleb Mosqueda Santes N° control 25260872
public class E7 {

    public static void main(String[] args) {
       Queue<String> cola = new LinkedList<>();//linea de como implementar una cola
       cola.offer("Pizza 1");
       cola.offer("el mio 1");
       cola.add("no puedo usar numeros");
        System.out.println(cola);
        System.out.println("Ultimo registro");
        System.out.println(cola.peek()); //va y busca dentro de nuestra coleccion y busca el primero elemento
        System.out.println(cola);
        System.out.println(cola.poll());
          
        //sintaxixs de foreach
        /*for(TipoDato variable :nombre de tu cola){
        System.out.print(nombre de tu col}
        */
       
        System.out.println("Enlistado sin eliminar:");
       for(String valorescola :cola){
           //foreach elementos de cola sin eliminar
           System.out.println(valorescola);
       }
    }
    
}
