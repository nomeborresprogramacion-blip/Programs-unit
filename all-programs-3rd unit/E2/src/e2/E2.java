package e2;
import java.util.Scanner;
//Hector Caleb Mosqueda Santes N° control:25260872

public class E2 {
    public static void main(String[] args) {
    Scanner scann = new Scanner(System.in);
     System.out.println("Tamaño de la pila:");
     int tamaño =scann.nextInt();
     pila p1= new pila(tamaño);
     int opcion =0;
     
     do{
     System.out.println("--Menu--");
     System.out.println("1.push");
     System.out.println("2.pop");
     System.out.println("3.showPila");
     System.out.println("4.isEmpty");
     System.out.println("5.isFull");
     System.out.println("6.Salir");
     System.out.print("Selecciona un numero del menu:");
     opcion= scann.nextInt();
     
     switch(opcion){
         case 1:
             System.out.print("Ingresa el numero entero");
             int num =scann.nextInt();
             p1.push(num);
             break;
         case 2:
          int sacado = p1.pop();
          if (sacado != -1) {
           System.out.println("<- Se eliminó: " + sacado);
                    }
               break;
                case 3:
                    p1.showPila();
                    break;
                case 4:
                    System.out.println(p1.isEmpty() ? "La pila está vacía" : "La pila NO está vacía");
                    break;
                case 5:
                    System.out.println(p1.isFull() ? "La pila está llena" : "La pila NO está llena");
                    break;
                case 6:
                    System.out.println("¡Saliendo!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
     
     }while(opcion!=6);
      scann.close();
     
     }
       
    }