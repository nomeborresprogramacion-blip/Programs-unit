import java.util.Scanner;
import java.util.Stack;
//Cambie de ide:P temporalmente mi pc se murio
//Hector Caleb Mosqueda Santes N° control:25260872
public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Creacion d3 las pilas
         Stack<Integer> pilaPrincipal = new Stack<>();
        Stack<Integer> pilaPositivos = new Stack<>();
        Stack<Integer> pilaNegativos = new Stack<>();

        int totalNumeros = 20; // captura los 20 numeros
        System.out.println("Ingresa " + totalNumeros + " números (positivos y negativos):");

        for (int i = 0; i < totalNumeros; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            pilaPrincipal.push(numero); // Almacenar en la pila principal
        }

        // Recorrer los valores para separar en positivos y negativos
        for (int numero : pilaPrincipal) {
            if (numero >= 0) {
                pilaPositivos.push(numero);
            } else {
                pilaNegativos.push(numero);
            }
        }

        // Mostrar cada una de las 2 pilas resultantes
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Pila de Positivos: " + pilaPositivos);
        System.out.println("Pila de Negativos: " + pilaNegativos);

        scanner.close();
    }
}