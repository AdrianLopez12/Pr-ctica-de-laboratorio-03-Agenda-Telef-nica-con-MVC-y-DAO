package ec.eud.ups.dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ec.edu.ups.Modelo.*;
import java.util.HashMap;
import java.util.Map;


public  class ImpleDao implements IClienteDao{
    public List<Usuario> usuario=new ArrayList<>();
Scanner leer=new Scanner(System.in);

              static Map<String, Usuario> mapU =new HashMap<String, Usuario>();
    static Map<Integer, String> mapT =new HashMap<Integer, String>();
            @Override
            public boolean validarUsuario(String cedula, String contrasena) {

                if (usuario.size() != 0) {

                    for (int i = 0; i < usuario.size(); i++) {
                        if (usuario.get(i).getCorreo().equalsIgnoreCase(cedula) && usuario.get(i).getContrasena().equals(contrasena)) {

                            return true;

                        }
                    }

                }
                System.out.println("Usuario invalido");
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
                mapU.put(correo, usuario1);
                

                
            }

            @Override
            public List<Usuario> ObtenerUsuarios() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mostrarTelefono(String cedula) {
                for (int i = 0; i < this.usuario.size(); i++) {
                        if (this.usuario.get(i).getCorreo().equalsIgnoreCase(cedula)) {
                            for (int j = 0; j < usuario.get(i).getTelefono().size(); j++) {
                                System.out.println("Telefono "+j);
                                System.out.print(" Codigo "+usuario.get(i).getTelefono().get(j).getCodigo());
                                System.out.print(" Numreo "+usuario.get(i).getTelefono().get(j).getNumero());
                                System.out.print(" Operadora "+usuario.get(i).getTelefono().get(j).getOperadora());
                                System.out.print(" Tipo "+usuario.get(i).getTelefono().get(j).getTipo());
                                System.out.println("");
                            }
                           i=usuario.size();
                        }
                    }
            }

            @Override
            public void actualizarUsuario(List<Telefono> telef, String cedula) {
                for (int i = 0; i < usuario.size(); i++) {
                        if (usuario.get(i).getCorreo().equalsIgnoreCase(cedula)) {
                             Usuario usuario1 = new Usuario(usuario.get(i).getCedula(), usuario.get(i).getNombre(), usuario.get(i).getApellido(), usuario.get(i).getCorreo(), usuario.get(i).getContrasena(), telef);  
                            usuario.set(i, usuario1);
                             i=usuario.size();
                             
                        }
                    }
               
            }

            @Override
            public void eliminarUsuario(String cedula) {
               for (int i = 0; i < usuario.size(); i++) {
                        if (usuario.get(i).getCorreo().equalsIgnoreCase(cedula)) {
                             
                            usuario.remove(i);
                             
                        }
                    }
            }
        };

    

  
 
 
    
    
    

