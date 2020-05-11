package ec.eud.ups.dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ec.edu.ups.Modelo.*;

public abstract class ImpleDao implements IClienteDao{
  Scanner leer=new Scanner(System.in);  
    List<Usuario> usuario;
    
    public ImpleDao(){
        System.out.println("ingrese nombre de usuario");
        String nombre=leer.next();
        System.out.println("Ingrese cedula");
        String cedula=leer.next();
        System.out.println("Ingrese apellido");
        String apellido=leer.next();
        System.out.println("Ingrese correo");
        String correo=leer.next();
        System.out.println("Ingrese contrasena");
        String contrasena=leer.next();
        
        
    }
    
    
}
