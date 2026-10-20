package Clases;

/**
 *
 * @author ITM-10339
 */
public class ProcesoB extends Thread {
    private int[] numero;
    
    public ProcesoB(int[] numero){
        this.numero = numero;
    }
      public void run() {
        System.out.println( Thread.currentThread().getName());

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Numero " + numero[i] + ": ");

            switch (numero[i]) {
                case 1:
                    System.out.println("I");
                    break;
                case 5:
                    System.out.println("V");
                    break;
                case 10:
                    System.out.println("X");
                    break;
                default:
                    System.out.println("No encontro equivalente");
                    break;
            }
        }
    }
}