package e1;


public class pila {
  private int [] elements;//arreglo declarado;v unidimencional
  private int cima;
  private int cantidad;
  
  
  //constructor 
  public pila(int n){
  this.cantidad=n;
  this.elements =new int[n];
  this.cima=-1; // se usa por que la clave -1 no existe ya que inicia desde 0
  }
  
  public void push(int dato){//insert
      this.cima++; // se tiene que mover ya que tienen que estar en 0 no en -1
  this.elements[cima]=dato; // hace que vayamos a la posicion del arreego indicada 
      System.out.println("valor"+dato+"agregar a la pila");
      
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
 


