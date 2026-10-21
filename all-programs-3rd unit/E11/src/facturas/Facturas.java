package facturas;
public class Facturas {
     //Hector Caleb Mosqueda Santes, No.Control:25280872
      
public static void main(String[] args) {
        Cola c = new Cola(7);
        c.mostrar();
        c.offer("F420");
        c.offer("F515");
        c.mostrar();

      c.poll();
       c.mostrar();

       c.offer("F630");
        c.mostrar();

       c.offer("F740");
        c.mostrar();

       c.poll();
        c.mostrar();
    }
}