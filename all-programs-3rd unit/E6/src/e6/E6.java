
// Héctor Caleb Mosqueda Santes N° control: 25260872
import java.util.Scanner;
import java.util.Stack;

public class E6 {

    public static void main(String[] args) {
        Stack<String> activas = new Stack<>();
        Stack<String> descartadas = new Stack<>();
        String notificacion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Sistema de notificaciones");
        int opcion;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Agregar notificacion");
            System.out.println("2. Descartar ultima notificacion");
            System.out.println("3. Deshacer ultimo cambio (Restaurar)");
            System.out.println("4. Ver notificaciones activas");
            System.out.println("5. Ver notificaciones descartadas");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = leer.nextInt();
            leer.nextLine(); // Limpiar buffer
            switch (opcion) {
                case 1:
                    System.out.print("Escribe la notificacion: ");
                    String texto = leer.nextLine();
                    activas.push(texto);
                    break;
                case 2:
                    if (!activas.isEmpty()) {
                        notificacion = activas.pop();
                        descartadas.push(notificacion);
                        System.out.println("Notificacion Descartada: " + notificacion);
                    } else {
                        System.out.println("No hay notificaciones activas para descartar.");
                    }
                    break;
                case 3:
                    if (!descartadas.isEmpty()) {
                        notificacion = descartadas.pop();
                        activas.push(notificacion);
                        System.out.println("Notificacion Restaurada: " + notificacion);
                    } else {
                        System.out.println("No hay notificaciones descartadas para restaurar.");
                    }
                    break;
                case 4:
                    System.out.println("Notificaciones activas:");
                    mostrarPila(activas);
                    break;
                case 5:
                    System.out.println("Notificaciones descartadas:");
                    mostrarPila(descartadas);
                    break;
                case 0:
                    System.out.println("\nCerrando sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida, intenta de nuevo.");
            }
        } while (opcion != 0);
        
        leer.close();
    }

    public static void mostrarPila(Stack<String> pila) {
        if (pila.isEmpty()) {
            System.out.println("(Sin notificaciones)");
            return;
        }
        for (int i = pila.size() - 1; i >= 0; i--) {
            String etiqueta = (i == pila.size() - 1) ? " <-- ultima" : "";
            System.out.println(" " + pila.get(i) + etiqueta);
        }
        System.out.println(" Total: " + pila.size() + " notificacion(es)\n");
    }
}