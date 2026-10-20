package e10;
//Hector Caleb Mosqueda Santes N° control 25260872
//colas sin librerias
public class cola {

    private int[] elementos;//Array que guarda elementos
    private int frente;//inidce del primer elelemnto
    private int fin;//inidce del ultimo elemento
    private int Tamaño;//numero de elemntos actuales
    private int capacidad;//capacidad maxima
    
    public cola(int capacidad){
    this.capacidad=capacidad;
    this.elementos=new int [capacidad];
    this.frente=0;
    this.fin=-1;
    this.Tamaño=0;
    }
    
    public void offer(int elemento){
    if (isFull()){
    System.out.println("La cola esta llena.No se puede agregar:"+elemento);
    return;
    }
    fin=(fin+1)%capacidad;
    elementos[fin]=elemento;
    Tamaño++;
    System.out.println("Elemento agregado:"+elemento);
    }

    public int getTamaño(){
    return Tamaño;
    }
    
    public void mostrar(){
    if (isEmpty()){
    System.out.println("La cola esta vacia.");
    return;
    }
    System.out.println("Contenido de la cola:[");
    for(int i=0; i<Tamaño;i++){
    System.out.println(elementos[(frente+i)%capacidad]+"");
    }
    System.out.println("]");
    }
 
    public int poll(){
    if(isEmpty()){
    System.out.println("La cola esta vacia.No se puedequitar.");
     return -1;
    }
    int elemento =elementos[frente];
    frente = (frente +1)%capacidad;
    Tamaño--;
    return elemento;
    }
    
   public int peek(){
   if(isEmpty()){
   System.out.println("La cola esta vacia.");
   return -1;
   }
   return elementos[frente];
   } 
   
   public boolean isEmpty(){
     return Tamaño ==0; 
   }
    
  public boolean isFull(){
  return Tamaño==capacidad;
  }
   
    
    
    
    
    
}