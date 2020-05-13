package ec.edu.ups.principal;

import ec.edu.ups.Modelo.Telefono;
import java.util.Scanner;
import ec.edu.ups.Modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.dao.IClienteDao;
import ec.edu.ups.dao.*;
import java.util.HashMap;
import java.util.Map;
import ec.edu.ups.controlador.*;


public class Principal {
//variables
    static byte op;
    static Scanner leer = new Scanner(System.in);
    List<Usuario> usuario = new ArrayList<>();

    public static void main(String[] args) {
        //Daos
ImpleDao clienteDao=new ImpleDao();
       ImpleDaoTele DaoTelo=new ImpleDaoTele();
//controladores
ControladorUsuario contu=new ControladorUsuario();
ControladorTelefono contT=new ControladorTelefono();

        
        do {
            System.out.println("1) Registrarse");
            System.out.println("2) Iniciar secion");
            System.out.println("3) mostrar numeros de telefono por cedula");
            op = leer.nextByte();
            if (op == 1) {
Usuario usu1;
usu1=contu.CrearUsuario();
                clienteDao.GuardarUsuario(usu1);

            }
            if (op == 2) {

                System.out.println("ingrese correo");
                String correo = leer.next();
                System.out.println("Ingrese contrasena");
                String contrasena1 = leer.next();
                Usuario r = clienteDao.validarUsuario(correo, contrasena1);
                if (r !=null) {
do{
                    System.out.println("Usuario valido");
                    System.out.println("1) Registrar telefono");
                    System.out.println("2) modificar");
                    System.out.println("3) Eliminar");
                    System.out.println("4) listar sus telefonos");
                    op = leer.nextByte();
                    if (op == 1) {
                        List<Telefono> telf;
                        telf=contT.CrearTelefono();
                        clienteDao.actualizarUsuario(r,telf);
                        
                        
                    }
                    if (op == 2) {

                    }
                    if (op == 3) {
                        clienteDao.eliminarUsuario(correo);
                        op=5;
                    }
                    if (op == 4) {
                        System.out.println(r.getTelefono().get(0).getCodigo());
                         clienteDao.mostrarTelefono(r);
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
