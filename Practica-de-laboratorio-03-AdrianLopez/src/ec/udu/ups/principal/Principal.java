package ec.udu.ups.principal;

import ec.edu.ups.Modelo.Telefono;
import java.util.Scanner;
import ec.edu.ups.Modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import ec.eud.ups.dao.IClienteDao;
import ec.eud.ups.dao.ImpleDao;
import java.util.HashMap;
import java.util.Map;

public class Principal {

    static byte op;
    static Scanner leer = new Scanner(System.in);
    List<Usuario> usuario = new ArrayList<>();

    public static void main(String[] args) {
        
ImpleDao clienteDao=new ImpleDao();
        
        
        do {
            System.out.println("1) Registrarse");
            System.out.println("2) Iniciar secion");
            System.out.println("3) mostrar numeros de telefono por cedula");
            op = leer.nextByte();
            if (op == 1) {

                clienteDao.crearUsuario();

            }
            if (op == 2) {

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
                        clienteDao.eliminarUsuario(correo);
                        op=5;
                    }
                    if (op == 4) {
                         clienteDao.mostrarTelefono(correo);
                    }
}while(op!=5);
                }

            }
            if(op==3){
                System.out.println("ingrese correo");
                String correo=leer.next();
            }

        } while (op != 4);
    }
}
