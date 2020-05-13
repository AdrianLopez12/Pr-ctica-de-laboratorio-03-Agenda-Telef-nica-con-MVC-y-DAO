package ec.edu.ups.controlador;
import ec.edu.ups.Modelo.Telefono;
import ec.edu.ups.Modelo.Usuario;
import java.util.List;
import java.util.Scanner;

public class ControladorUsuario {
    Scanner leer=new Scanner(System.in);
    
    public Usuario CrearUsuario(){
     System.out.println("*****Registro usuario*****");
                System.out.println("ingrese nombre de usuario");
                String nombre = leer.next();
                System.out.println("Ingrese cedula");
                String cedula = leer.next();
                System.out.println("Ingrese apellido");
                String apellido = leer.next();
                System.out.println("Ingrese correo");
                String correo = leer.next();
                System.out.println("Ingrese contrasena");
                String contrasena = leer.next();
                List<Telefono> telf = null;
                Usuario usu=new Usuario(cedula, nombre, apellido, correo, contrasena, telf);
                return usu;
                
    
}
    
    
}
