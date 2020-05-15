package ec.edu.ups.controlador;

import ec.edu.ups.Modelo.Telefono;
import ec.edu.ups.Modelo.Usuario;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ControladorUsuario {

    Scanner leer = new Scanner(System.in);
    static Map<String, Usuario> mapU = new HashMap<String, Usuario>();

    public Usuario CrearUsuario() {
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
        //List<Telefono> telf = null;
        Usuario usu = new Usuario(cedula, nombre, apellido, correo, contrasena);
        mapU.put(cedula, usu);

        return usu;

    }

    public void ListarTelefonosPorCedula() {
        System.out.println("Ingrese numero de cedula");
        String ced = leer.next();
        for (int i = 0; i < mapU.size(); i++) {

            if (mapU.get(ced) != null) {
                Usuario usu = mapU.get(ced);
                for (int j = 0; j < usu.getTelefono().size(); j++) {
                    System.out.println("Telefono " + j);
                    System.out.print(" Codigo " + usu.getTelefono().get(j).getCodigo());
                    System.out.print(" Numreo " + usu.getTelefono().get(j).getNumero());
                    System.out.print(" Operadora " + usu.getTelefono().get(j).getOperadora());
                    System.out.print(" Tipo " + usu.getTelefono().get(j).getTipo());
                    System.out.println("");
                }
            }
        }
    }

}
