
package e5;

//Hector caleb Mosqueda Santes 


public class pila {
  private String [] elementos;//arreglo declarado;v unidimencional
  private int tope;
  private int capacidad;
  
  
  //constructor 
  public pila(int capacidad){
  this.capacidad=capacidad;
  this.elementos =new String[capacidad];
  this.tope=-1; // se usa por que la clave -1 no existe ya que inicia desde 0
  }
  
  public void push(String notificacion){//insert
   if(isFull()){
   System.out.println("Historial lleno.No se puede agregar.");
   return;
   }      
  }
  public int  pop(){//delete
  int dato= this.elements[cima];//EXTRAE EL VALOR EN LA ULTIMA CLAVE OSEA LA CIMA
  cima--;// lo elimina .-.
  return dato;
  }
  public int peek(){//top
  return this.elements[cima];//ver el elememnto hasta arriba
  }
  
  public boolean isEmpty(){//the stack is empty?? make it with booleean
  boolean isEmpty= false;
  if(cima==-1){
     isEmpty=true;
  }
  return isEmpty;//normal form;
  //return cima=-1; sin boolean mismo comportamiento
  }
  
  public boolean isFull(){//the stack is full?? make it with booleean
  boolean isFull= false;
  if(cima==cantidad-1){
     isFull=true;
  }
  return isFull;//normal form;
  //return cima>=-1; sin boolean mismo comportamiento
  }
  }
 


