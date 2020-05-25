package ec.edu.ups.principal;

import ec.edu.ups.modelos.Telefono;
import java.util.Scanner;
import ec.edu.ups.modelos.Usuario;
import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.dao.IClienteDao;
import ec.edu.ups.dao.*;
import java.util.HashMap;
import java.util.Map;
import ec.edu.ups.controlador.*;
import ec.edu.ups.interfaz.Pantalla;

public class Principal {
//variables

    static byte op;
    static Scanner leer = new Scanner(System.in);
    List<Usuario> usuario = new ArrayList<>();

    public static void main(String[] args) {
        
        Pantalla p =new Pantalla();
        p.mostrarventana1();
        
        
//        //Daos
//        ImpleDao clienteDao = new ImpleDao();
//
////controladores
//        ControladorUsuario contu = new ControladorUsuario();
//        ControladorTelefono contT = new ControladorTelefono();
//
//        do {
//            System.out.println("1) Registrarse");
//            System.out.println("2) Iniciar secion");
//            System.out.println("3) Mostrar numeros de telefono por cedula");
//            System.out.println("4) Listar telefonos");
//            System.out.println("5) Salir");
//            op = leer.nextByte();
//            if (op == 1) {
//                Usuario usu1;
//                usu1 = contu.CrearUsuario();
//                clienteDao.GuardarUsuario(usu1);
//
//            }
//            if (op == 2) {
//
//                System.out.println("ingrese correo");
//                String correo = leer.next();
//                System.out.println("Ingrese contrasena");
//                String contrasena1 = leer.next();
//                Usuario r = clienteDao.validarUsuario(correo, contrasena1);
//                if (r != null) {
//                    do {
//                        System.out.println("Usuario valido");
//                        System.out.println("1) Registrar telefono");
//                        System.out.println("2) modificar");
//                        System.out.println("3) Eliminar");
//                        System.out.println("4) listar sus telefonos");
//                        System.out.println("5) Regresar logueo");
//                        op = leer.nextByte();
//                        if (op == 1) {
//                            List<Telefono> telf;
//                            telf = contT.CrearTelefono();
//                            clienteDao.actualizarTelfUsuario(r, telf);
//
//                        }
//                        if (op == 2) {
//
//                            List<Telefono> t = r.getTelefono();
//                            contT.ModificarTelefono(t);
//
//                        }
//                        if (op == 3) {
//                            Telefono te;
//                            te = contT.BuscarTelefono(r.getTelefono());
//                            clienteDao.EliminarTelefono(te, r);
//
//                        }
//                        if (op == 4) {
//
//                            clienteDao.mostrarTelefono(r);
//                        }
//                        if (op == 5) {
//                            op = 6;
//
//                        }
//                    } while (op != 6);
//                }
//
//            }
//            if (op == 3) {
//                contu.ListarTelefonosPorCedula();
//            }
//            if (op == 4) {
//                clienteDao.mostrarTelefonos();
//            }
//
//        } while (op != 5);
    }
}
