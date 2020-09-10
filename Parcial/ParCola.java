package Parcial;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ParCola{
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        Cola c = new Cola();
        int opMenu = 0;
        do
        {
            System.out.print("\n ----------------------------- ");
            System.out.print("\n Escoga una opcion ");
            System.out.print("\n -----------------------------------------    ");
            System.out.print("\n 1.Insertar Datos     |              ");
            System.out.print("\n 2.Mostrar Datos      |  \n ");
            opMenu =  Entrada.nextInt();
            switch (opMenu)
            {
            case 1:
                String nombre,apellido,iden,sal,ht;
                int identifica,salario, horast;
                nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre"); 
                apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido");
                iden = JOptionPane.showInputDialog(null, "Ingrese la identificacion"); 
                sal = JOptionPane.showInputDialog(null, "Ingrese salario"); 
                ht = JOptionPane.showInputDialog(null, "Ingrese horas trabajadas"); 
                identifica = Integer.parseInt(iden);
                salario = Integer.parseInt(sal);
                horast = Integer.parseInt(ht);
                c.Insertar(new Empleado(nombre,apellido,identifica,salario,horast));
                break;
            
            case 2:
                c.Mostrar();
                break;
            
            case 3:
                
                break;
            default:
                System.out.print("\n Opcion no valida ");
                System.exit(0);
                break;
            }
        }
        while (opMenu != 5);
    }
}
