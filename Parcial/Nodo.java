package Parcial;

public class Nodo{
   private Nodo siguiente;
   private Empleado dato;

   public Nodo(Empleado dato, Nodo siguiente){
       this.siguiente = siguiente;
       this.dato = dato;
   }

   public Nodo getsiguiente(){
       return siguiente;
   }
   public void setsiguiente(Nodo siguiente){
       this.siguiente = siguiente;
   }
   public Empleado getdato(){
    return dato;
}
    public void setdato(Empleado dato){
    this.dato = dato;
    }
}