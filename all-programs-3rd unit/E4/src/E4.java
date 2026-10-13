import java.util.Scanner;
import java.util.Stack;
//Hector Caleb Mosqueda Santes N° contorl:25260872
//Cambie de IDE es temporal:P
class PilaEstacionamiento {
    private Stack<String> pilaAutos;
    private int capacidadMaxima;

    public PilaEstacionamiento(int capacidad) {
        this.pilaAutos = new Stack<>();
        this.capacidadMaxima = capacidad;
    }

    // Método agregar (equivalente a push)
    public void agregar(String placa) {
        if (pilaAutos.size() < capacidadMaxima) {
            pilaAutos.push(placa.toUpperCase());
            System.out.println("Auto con placa " + placa + " ingresado al estacionamiento.");
        } else {
            System.out.println("¡Estacionamiento lleno! No se puede agregar el auto " + placa);
        }
    }

    // Método quitar (equivalente a pop)
    public void quitar() {
        if (!pilaAutos.isEmpty()) {
            String autoSalida = pilaAutos.pop();
            System.out.println("Auto con placa " + autoSalida + " ha salido del estacionamiento.");
        } else {
            System.out.println("El estacionamiento está vacío.");
        }
    }

    // Método mostrarCima (equivalente a peek)
    public void mostrarCima() {
        if (!pilaAutos.isEmpty()) {
            System.out.println("Auto al frente (cima): " + pilaAutos.peek());
        } else {
            System.out.println("El estacionamiento está vacío.");
        }
    }

    // Método mostrarPila
    public void mostrarPila() {
        if (!pilaAutos.isEmpty()) {
            System.out.println("Autos actuales en el estacionamiento: " + pilaAutos);
        } else {
            System.out.println("El estacionamiento está vacío.");
        }
    }
}

public class E4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PilaEstacionamiento estacionamiento = new PilaEstacionamiento(5); // Capacidad de 5 autos
        int opcion;

        do {
            System.out.println("\n--- MENÚ ESTACIONAMIENTO ---");
            System.out.println("1. Agregar auto");
            System.out.println("2. Quitar auto");
            System.out.println("3. Mostrar cima");
            System.out.println("4. Mostrar pila");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de placa del auto: ");
                    String placa = scanner.nextLine();
                    estacionamiento.agregar(placa);
                    break;
                case 2:
                    estacionamiento.quitar();
                    break;
                case 3:
                    estacionamiento.mostrarCima();
                    break;
                case 4:
                    estacionamiento.mostrarPila();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
