/**
    * Interactua con el usuario
    * 
    
    @author María Fernanda López, Francisco Molina, Paolo Suchini 
    @version 11/08/2017
    
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	 public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Departamento depa = new Departamento();
        Restaurante restau = new Restaurante();
        Hotel hotel = new Hotel();
        Evento evento = new Evento();
        HQ opera = new HQ();
        System.out.println("Bienvenido a meet 502");
        System.out.println("1.Administrador"+"\n2.Usuario");
        int opcion = sc.nextInt();
        if (opcion==1){
            Sysytem.out.println("1. Agregar hotel" + "\n2. Agregar Restaurante" + "\n3. Agregar evento" + "\n4. Agregar Departamento");
            int select = sc.nextInte();
            if (select==1){
                System.out.println("Ingrese el nombre del hotel");
                String nombre = sc.next();
                System.out.println("Ingresa la direccion");
                String direccion ? sc.next();
                System.out.println("Ingrese el correo");
                String correo = sc.next();
                System.out.println("Ingrese el numero de telefono");
                String telefono = sc.next();
                System.out.println("Ingrese la descripcio");
                String descripcion = sc.next();
                System.out.println("Ingrese el horario");
                String horario = sc.next();
                System.out.println("Ingrese la calificacion");
                double calificacion = sc.nextDouble();

                opera.addH(nombre, direccion, correo, telefono, descripcion, horario, calificacion);
           }

           if(select==2){
                System.out.println("Ingrese el nombre del restaurante");
                String nombre = sc.next();
                System.out.println("Ingresa la direccion");
                String direccion ? sc.next();
                System.out.println("Ingrese el horario");
                String horario = sc.next();
                System.out.println("Ingrese la calificacion");
                double calificacion = sc.nextDouble();
                System.out.println("Ingrese el numero de telefono");
                String telefono = sc.next();

                opera.addRes(nombre, direccion, horario, calificacion, telefono);

           }

           if(select==3){
                System.out.println("Ingrese el nombre del Evento");
                String nombre = sc.next();
                System.out.println("Ingresa la direccion");
                String direccion = sc.next();
                System.our.println("Ingrese la fecha");
                String fecha = sc.next();
                System.out.println("Ingrese el tipo ");
                String tipo = sc.next();
                opera.addEvento(nombre, direccion, horario, tipo, fecha);
           }

           if(select==4){
                Sysrem.out.prinln("Ingrese el nombre del departamento");
                String nombre = sc.next();
                opera.addD(nombre);
           }

        }

        if(opcion==2){
            System.out.prinln("Gracias por utilizar meet 502");
        }
           
        
    }
}
