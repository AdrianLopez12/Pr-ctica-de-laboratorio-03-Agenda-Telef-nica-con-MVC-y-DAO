package ec.udu.ups.principal;

import ec.edu.ups.Modelo.Telefono;
import java.util.Scanner;
import ec.edu.ups.Modelo.Usuario;
import ec.edu.ups.controlador.Controlador;
import java.util.ArrayList;
import java.util.List;
import ec.eud.ups.dao.IClienteDao;
import ec.eud.ups.dao.ImpleDao;

public class Principal {

    static byte op;
    static Scanner leer = new Scanner(System.in);
    List<Usuario> usuario = new ArrayList<>();

    public static void main(String[] args) {
        IClienteDao clienteDao = new ImpleDao() {
            @Override
            public boolean validarUsuario(String correo, String contrasena) {

                if (usuario.size() != 0) {

                    for (int i = 0; i < usuario.size(); i++) {
                        if (usuario.get(i).getCorreo().equalsIgnoreCase(correo) && usuario.get(i).getContrasena().equals(contrasena)) {

                            return true;

                        }
                    }

                }
                return false;

            }

            @Override
            public void crearUsuario() {
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
                Usuario usuario1 = new Usuario(cedula, nombre, apellido, correo, contrasena, telf);
                this.usuario.add(usuario1);

                
            }

            @Override
            public List<Usuario> ObtenerUsuarios() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mostrarTelefono(String correo) {
                for (int i = 0; i < this.usuario.size(); i++) {
                        if (this.usuario.get(i).getCorreo().equalsIgnoreCase(correo)) {
                            for (int j = 0; j < usuario.get(i).getTelefono().size(); j++) {
                                System.out.println(usuario.get(i).getTelefono().get(j).getCodigo());
                                System.out.println(usuario.get(i).getTelefono().get(j).getNumero());
                                System.out.println(usuario.get(i).getTelefono().get(j).getOperadora());
                                System.out.println(usuario.get(i).getTelefono().get(j).getTipo());
                            }
                           i=usuario.size();
                        }
                    }
            }

            @Override
            public void actualizarUsuario(List<Telefono> telef, String correo) {
                for (int i = 0; i < usuario.size(); i++) {
                        if (usuario.get(i).getCorreo().equalsIgnoreCase(correo)) {
                             Usuario usuario1 = new Usuario(usuario.get(i).getCedula(), usuario.get(i).getNombre(), usuario.get(i).getApellido(), usuario.get(i).getCorreo(), usuario.get(i).getContrasena(), telef);  
                            usuario.set(i, usuario1);
                             i=usuario.size();
                             
                        }
                    }
               
            }

            @Override
            public void eliminarUsuario(Usuario usuario) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        do {
            System.out.println("1) Registrarse");
            System.out.println("2) Iniciar secion");
            op = leer.nextByte();
            if (op == 1) {

                clienteDao.crearUsuario();

            }
            if (op == 2) {

                Controlador controlador = new Controlador();
                System.out.println("ingrese correo");
                String correo = leer.next();
                System.out.println("Ingrese contrasena");
                String contrasena1 = leer.next();
                boolean r = clienteDao.validarUsuario(correo, contrasena1);
                if (r == true) {
do{
                    System.out.println("Usuario valido");
                    System.out.println("1) Registrar telefono");
                    System.out.println("2) modificar");
                    System.out.println("3) Eliminar");
                    System.out.println("4) listar sus telefonos");
                    op = leer.nextByte();
                    if (op == 1) {
                        System.out.println("cuantos telefonos va a registrar?");
                        byte nt=leer.nextByte();
                        List <Telefono> telefono=new ArrayList<>();
                        for (int i = 0; i < nt; i++) {
                            System.out.println("Ingrese codigo");
                        int codigo=leer.nextInt();
                        System.out.println("Ingrese numero");
                        String numero=leer.next();
                        System.out.println("Ingrese tipo");
                        String tipo=leer.next();
                        System.out.println("Ingrese operadora");
                        String operador=leer.next();
                        Telefono tele=new Telefono(codigo, numero, tipo, operador);
                        
                        telefono.add(tele);
                        }
                        clienteDao.actualizarUsuario(telefono, correo);
                        
                        
                    }
                    if (op == 2) {

                    }
                    if (op == 3) {

                    }
                    if (op == 4) {
                         clienteDao.mostrarTelefono(correo);
                    }
}while(op!=5);
                }

            }

        } while (op != 3);
    }
}
