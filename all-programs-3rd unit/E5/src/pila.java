// Héctor Caleb Mosqueda Santes N° control: 25260872
public class pila {
    private String[] elementos; 
    private int tope;          
    private int capacidad;     

    public pila(int capacidad) {
        this.capacidad = capacidad;
        this.elementos = new String[capacidad];
        this.tope = -1; 
    }

    public void push(String notificacion) {
        if (estaLlena()) {
            System.out.println("Historial lleno. No se puede agregar.");
            return;
        }
        tope++;
        elementos[tope] = notificacion;
    }

    public String pop() {
        if (estaVacia()) {
            System.out.println("No hay notificaciones disponibles.");
            return null;
        }
        String dato = elementos[tope];
        tope--;
        return dato;
    }

    public boolean estaVacia() {
        return tope == -1;
    }

    public boolean estaLlena() {
        return tope == capacidad - 1;
    }

    public int tamano() {
        return tope + 1;
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("(Sin notificaciones)");
            return;
        }
        for (int i = tope; i >= 0; i--) {
            String etiqueta = (i == tope) ? " <-- ultima" : "";
            System.out.println(" " + elementos[i] + etiqueta);
        }
        System.out.println(" Total: " + tamano() + " notificacion(es)\n");
    }
}