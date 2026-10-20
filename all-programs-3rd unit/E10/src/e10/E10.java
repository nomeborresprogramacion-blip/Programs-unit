package e10;
//Hector Caleb Mosqueda Santes N° control 25260872

public class E10 {
    public static void main(String[] args) {
        System.out.println("hello");
        cola c = new cola(5);
        c.offer(10);
        c.mostrar();
        c.offer(100);
        c.offer(200);
        c.poll();
        c.mostrar();
    }
}