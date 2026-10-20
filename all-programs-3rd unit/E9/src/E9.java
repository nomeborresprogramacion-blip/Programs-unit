
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class E9 {
public static void main(String[] args) {
 Queue<String> cola = new LinkedList<>();
 //Hector Caleb Mosqueda Santes, No.Control:25260872/
Scanner leer = new Scanner(System.in);
      int opcion;
        int contadorImpresiones = 0;

        do {
            System.out.println("\n Sistema de Impresora");
            System.out.println("1. Enviar un trabajo");
            System.out.println("2. Imprimir el sig trabajo");
            System.out.println("3. Ver la cola de impresion completa");
            System.out.println("4. Ver los trabajos pendientes");
            System.out.println("5. Cancelar un trabajo");
            System.out.println("6. Conteo total de impresiones realizadas");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = leer.nextInt();
            leer.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del documento: ");
                    String trabajo = leer.nextLine();
                    cola.offer(trabajo);
                    System.out.println("Trabajo agregado a la cola.");
                    break;

                case 2:
                    if (!cola.isEmpty()) {
                        String impreso = cola.poll();
                        System.out.println("Imprimiendo: " + impreso);
                        contadorImpresiones++;
                    } else {
                        System.out.println("No hay trabajos pendientes.");
                    }
                    break;

                case 3:
                    if (cola.isEmpty()) {
                        System.out.println("La cola de impresion esta vacia.");
                    } else {
                        System.out.println("Lista de Trabajos en Cola");
                        for (String t : cola) {
                            System.out.println("- " + t);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Cantidad de trabajos pendientes: " + cola.size());
                    break;

                case 5:
                    if (!cola.isEmpty()) {
                        String cancelado = cola.poll();
                        System.out.println("Trabajo cancelado: " + cancelado);
                    } else {
                        System.out.println("No hay trabajos para cancelar.");
                    }
                    break;

                case 6:
                    System.out.println("Conteo total de impresiones realizadas: " + contadorImpresiones);
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida, intente de nuevo.");
            }
        } while (opcion != 0);

        leer.close();
    }
  // 4. Ver quién es el siguiente sin sacarlo de la fila (Peek)
    public static void mostrarProximo(Queue<String> fila) {
        if (fila.isEmpty()) {
            System.out.println("--> No hay clientes esperando.");
        } else {
            System.out.println("--> El proximo en ser atendido es: " + fila.peek());
        }
    }

    // 5. Ver el número total de clientes en la cola
    public static void contarClientes(Queue<String> fila) {
        System.out.println("--> Total de clientes esperando: " + fila.size());
    }
}

  
