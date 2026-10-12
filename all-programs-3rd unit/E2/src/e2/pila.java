package e2;
//Hector Caleb Mosqueda Snates N° contorl: 25260872;
public class pila {
    private int[] elements;
    private int cima;
    private int cantidad;

    public pila(int n) {
        this.cantidad = n;
        this.elements = new int[n];
        this.cima = -1;
    }
   
    public void push(int d) {//insert
        this.cima++;
        this.elements[cima] = d;
        System.out.println("Valor: "+d+" agregado a la Pila.");
    }
    public int pop() { //delete
       
        int d = this.elements[cima];
        cima--;
        return d;
    }
    public int peek() {//elemnt in top
        return this.elements[cima];
    }
    public boolean isEmpty() {//Stack is empty?
        boolean vacia = false;
        if (cima==-1) {
            vacia = true;
        }
        return vacia;
        /*
        return cima == -1;
        */
    }
    public boolean isFull() {//stack is full?
        boolean retorno = false;
        if (cima==cantidad-1) {
            retorno = true;
        }
        return retorno;
        /*
        return cima == -1;
        */
    }
    public void showPila() {//show stack
        System.out.println("Datos:");
        for (int i = cima; i >= 0; i--) {
            System.out.println(elements[i]);
        }
       
    }
}
