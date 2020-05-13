package ec.edu.ups.dao;
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
            public Usuario validarUsuario(String cedula, String contrasena) {

                if (usuario.size() != 0) {

                    for (int i = 0; i < usuario.size(); i++) {
                        if (usuario.get(i).getCorreo().equalsIgnoreCase(cedula) && usuario.get(i).getContrasena().equals(contrasena)) {

                            return usuario.get(i);

                        }
                    }

                }
                System.out.println("Usuario invalido");
                Usuario usu=null;
                return usu;

            }

            @Override
            public void GuardarUsuario(Usuario usuario1) {
               

                
                
                this.usuario.add(usuario1);
              
                

                
            }

            @Override
            public List<Usuario> ObtenerUsuarios() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mostrarTelefono(Usuario cedula) {
           
                       if(cedula.getTelefono()!=null){
                          for (int j = 0; j < cedula.getTelefono().size(); j++) {
                                System.out.println("Telefono "+j);
                                System.out.print(" Codigo "+cedula.getTelefono().get(j).getCodigo());
                                System.out.print(" Numreo "+cedula.getTelefono().get(j).getNumero());
                                System.out.print(" Operadora "+cedula.getTelefono().get(j).getOperadora());
                                System.out.print(" Tipo "+cedula.getTelefono().get(j).getTipo());
                                System.out.println("");
                            } 
                       }else{
                           System.out.println("no hay telefonos registrados");
                       }
                            
                           
                        
                    
            }

            @Override
            public void actualizarUsuario(Usuario r) {
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
                        r.setTelefono(telefono);
              
                
                
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

    

  
 
 
    
    
    

