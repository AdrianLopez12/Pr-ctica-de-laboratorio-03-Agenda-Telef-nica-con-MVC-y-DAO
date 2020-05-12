package ec.edu.ups.controlador;

import ec.edu.ups.Modelo.*;
import ec.edu.ups.vista.Vista;
import java.util.List;
import java.util.Scanner;

public class Controlador {

    private Vista vistaCliente;
       List<Usuario> usuario;
    private Telefono telefono;
    Scanner leer = new Scanner(System.in);

    public Controlador(Vista vistaCliente, List<Usuario> usuario, Telefono telefono) {
        this.vistaCliente = vistaCliente;
        this.usuario = usuario;
        this.telefono = telefono;
    }
    
    public void RegistrarUsuario() {
         
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
          Usuario usuario = new Usuario(cedula, nombre, apellido, correo, contrasena, telf);
        this.usuario.add(usuario);
        
    }

}
