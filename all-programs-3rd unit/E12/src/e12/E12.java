package e12;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;

//Hector Caleb Mosqueda Santes N° control:25260872
public class E12 {
 public static void main(String[] args) {
 Stack<Integer> Pila1= new Stack<>();//asi se declara unapila con libreria
 Stack<Integer> PilaAux= new Stack<>();//asi se declara unapila con libreria
 Queue<Integer> cola1= new LinkedList();
 Scanner scan = new Scanner(System.in);
     
 int totalnum=20;
    System.out.println("Ingrese el numero de ficha:"+totalnum);
    for(int i=0;i<20;i++){
    System.out.println("Numero de ficha:");
    int numeroi= scan.nextInt();
    Pila1.push(numeroi);
    }
    
    for(int i=0;i<20;i++){
    if(Pila1.get(i)%2==0){
     cola1.offer(Pila1.get(i));
    }
    }
    
    System.out.println("Lista completa"+Pila1);
    System.out.println("reprogramados");
    System.out.println("cantidad de mascotas reprogramadas");
    
    }
    
}
