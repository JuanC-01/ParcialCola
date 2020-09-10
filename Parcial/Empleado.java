package Parcial;

public class Empleado {
    private String Nombre, Apellido;
    private int identifica, salario, horast;

    public Empleado(String Nombre, String Apellido, int identifica,int salario, int horast){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.identifica = identifica;
        this.salario = salario;
        this.horast = horast;
    }

    public String toString(){
        return "\n Empleado"
             + "\n Nombre: "+ getNombre()
             + "\n  Apellido: "+ getApellido()
             + "\n Identificacion: "+ getidentifica()
             + "\n Salario: "+ getsalario()
             + "\n  Horas trabajadas: "+ gethorast();
    }

    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public String getApellido(){
        return Apellido;
    }
    public void setApellido(String Apellido){
        this.Apellido = Apellido;
    }
    public int getidentifica(){
        return identifica;
    }
    public void setidentifica(int identifica){
        this.identifica = identifica;
    }
    public int getsalario(){
        return salario;
    }
    public void setsalario(int salario){
        this.salario = salario;
    }
    public int gethorast(){
        return horast;
    }
    public void sethorast(int horast){
        this.horast = horast;
    }
}