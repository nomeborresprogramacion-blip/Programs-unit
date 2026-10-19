import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//a modificar el archivo para hacer el programa
//Hector Caleb Mosqueda Santes N° control 25260872
public class E9{
    //Static para pod3r usarlo en el main
    static Scanner sc = new Scanner(System.in);
    static int numCliente = 1;

    public static void main(String[] args) {
        // Usamos Queue implementado con LinkedList para representar la cola
        Queue<String> filaBanco = new LinkedList<>();
        int opcion = 0;

        do {
            mostrarMenu();
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    agregarCliente(filaBanco);
                    break;
                case 2:
                    atenderCliente(filaBanco);
                    break;
                case 3:
                    mostrarFila(filaBanco);
                    break;
                case 4:
                    mostrarProximo(filaBanco);
                    break;
                case 5:
                    contarClientes(filaBanco);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida, intenta de nuevo.");
            }
            System.out.println(); // Línea para separar

        } while (opcion != 6);
    }

    // --- FUNCIONES DEL PROGRAMA ---

    // Función para mostrar las opciones
    public static void mostrarMenu() {
        System.out.println("=== SIMULADOR DE BANCO ===");
        System.out.println("1. Llegada de un cliente");
        System.out.println("2. Atender al siguiente cliente");
        System.out.println("3. Ver la fila completa");
        System.out.println("4. Ver proximo en ser atendido");
        System.out.println("5. Ver clientes en espera");
        System.out.println("6. Salir");
    }

    // 1. Agregar cliente al final (Enqueue)
    public static void agregarCliente(Queue<String> fila) {
        String cliente = "Cliente " + numCliente;
        fila.add(cliente); // Tambien se puede usar fila.offer(cliente)
        System.out.println("--> Se agrego a la fila: " + cliente);
        numCliente++;
    }

    // 2. Atender cliente del frente (Dequeue)
    public static void atenderCliente(Queue<String> fila) {
        if (fila.isEmpty()) {
            System.out.println("--> No hay clientes en la fila.");
        } else {
            String atendido = fila.poll(); // Saca al primero de la fila
            System.out.println("--> Se atendio a: " + atendido);
        }
    }

    // 3. Mostrar todos los clientes de la fila
    public static void mostrarFila(Queue<String> fila) {
        if (fila.isEmpty()) {
            System.out.println("--> La fila esta vacia.");
        } else {
            System.out.println("--- Clientes en fila ---");
            int i = 1;
            for (String c : fila) {
                System.out.println(i + ". " + c);
                i++;
            }
        }
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
