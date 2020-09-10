package Parcial;

import javax.swing.JOptionPane;

public class Cola {
    int cont = 0;
    private Nodo Cabeza;
    private Nodo Ultimo;

    public Cola()
    {
        Cabeza = null;
        Ultimo = null;
    } 
    public boolean esvacia()
    {
        if (Cabeza == null){
            return true;
        }else{
            return false;
        }
    }

    public void Insertar(Empleado empleado)
    {
        Nodo acutal;
        if(esvacia()){
            acutal = new Nodo(empleado,null);
            Cabeza = acutal;
            Ultimo = acutal;
        }else{
            acutal = new Nodo(empleado, null);
            Ultimo.setsiguiente(acutal);
            Ultimo = acutal;
        }
    }

    public void Mostrar(){
        if (esvacia())
        {
            System.out.print("\n La cola esta vacia");
            return;
        }else{
            Nodo temporal;
            temporal = Cabeza;
            while(temporal != null){
                JOptionPane.showMessageDialog(null, temporal.getdato().toString());
                temporal = temporal.getsiguiente();
            }
        }
    }
}  

