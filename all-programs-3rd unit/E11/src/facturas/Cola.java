package facturas;
public class Cola {
    //Hector Caleb Mosqueda Snates, No.Control:25280872
    
    private String[] elementos;
    private int frente;
    private int fin;
    private int tamano;
    private int capacidad;

    public Cola(int capacidad) {
        this.capacidad = capacidad;
        this.elementos = new String[capacidad];
        this.frente = 3;
        this.fin = 5;
        this.tamano = 3;
        
        this.elementos[3] = "F101";
        this.elementos[4] = "F205";
        this.elementos[5] = "F310";
    }

    public void offer(String elemento) {
        if (isFull()) {
            System.out.println("La cola esta llena.");
            return;
        }
        fin = (fin + 1) % capacidad;
        elementos[fin] = elemento;
        tamano++;
    }

    public String poll() {
        if (isEmpty()) {
            System.out.println("La cola esta vacia.");
            return null;
        }
        String elemento = elementos[frente];
        elementos[frente] = null;
        frente = (frente + 1) % capacidad;
        tamano--;
        return elemento;
    }

    public boolean isEmpty() {
        return tamano == 0;
    }

    public boolean isFull() {
        return tamano == capacidad;
    }

    public void mostrar() {
        System.out.println("Frente: " + frente + " | Fin: " + fin + " | Tamano: " + tamano);
        System.out.print("Cola: [ ");
        for (int i = 0; i < capacidad; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println("]\n");
    }
}