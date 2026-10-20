package Clases;

/**
 *
 * @author ITM-10339
 */
public class ProcesoA extends Thread {
    private double [] trabajadores_salarios;
    
    public ProcesoA(double [] trabajadores_salarios){
        this.trabajadores_salarios = trabajadores_salarios;
    }
    
    public void run(){
        System.out.println( Thread.currentThread().getName());
        System.out.println("Salarios entre 300.50 y 450.50:");

        boolean encontrado = false;

        for (int i = 0; i < trabajadores_salarios.length; i++) {
            if (trabajadores_salarios[i] >= 300.50 && trabajadores_salarios[i] <= 450.50) {
                System.out.println("Salario: " + trabajadores_salarios[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron salarios en ese rango.");
        }
    }
}
