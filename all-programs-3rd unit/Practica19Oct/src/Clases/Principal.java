package Clases;
import java.util.Scanner;

/**
 *
 * @author ITM-10339
 */
public class Principal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int [] numero = new int [5];
        double[] trabajadores_salarios = new double[5];
        
       
          for(int i =0; i<numero.length; i++){
           System.out.println("Ingrese un numero " +(i+1)+": ");
           numero [i] = scanner.nextInt();
        }
        
       
           for (int i = 0; i < trabajadores_salarios.length; i++) {
            System.out.print("Ingrese el salario " + (i + 1) + ": ");
            trabajadores_salarios[i] = scanner.nextDouble();
        }

        ProcesoA hilo1 = new ProcesoA(trabajadores_salarios);
        ProcesoB hilo2 = new ProcesoB(numero);

        hilo1.setName("ProcesoA");
        hilo2.setName("ProcesoB");

        hilo1.start();
        hilo2.start();

        scanner.close();
        
    }
}
