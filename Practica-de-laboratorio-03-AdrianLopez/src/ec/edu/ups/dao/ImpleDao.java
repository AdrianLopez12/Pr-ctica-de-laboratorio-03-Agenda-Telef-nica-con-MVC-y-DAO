package ec.edu.ups.dao;

import ec.edu.ups.modelos.Usuario;
import ec.edu.ups.modelos.Telefono;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ImpleDao implements IClienteDao {

    public List<Telefono> telefonol = new ArrayList<>();
    public List<Usuario> usuario = new ArrayList<>();
    Scanner leer = new Scanner(System.in);

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
        return null;

    }

    @Override
    public void GuardarUsuario(Usuario usuario1) {

        this.usuario.add(usuario1);

    }

    @Override
    public void EliminarTelefono(Telefono t, Usuario r) {

        for (int i = 0; i < r.getTelefono().size(); i++) {
            if (t.getCodigo() == r.getTelefono().get(i).getCodigo()) {
                r.getTelefono().remove(i);
            }

        }

    }

    @Override
    public void mostrarTelefono(Usuario cedula) {

        if (cedula.getTelefono() != null) {
            for (int j = 0; j < cedula.getTelefono().size(); j++) {
                System.out.println("Telefono " + j);
                System.out.print(" Codigo " + cedula.getTelefono().get(j).getCodigo());
                System.out.print(" Numreo " + cedula.getTelefono().get(j).getNumero());
                System.out.print(" Operadora " + cedula.getTelefono().get(j).getOperadora());
                System.out.print(" Tipo " + cedula.getTelefono().get(j).getTipo());
                System.out.println("");
            }
        } else {
            System.out.println("no hay telefonos registrados");
        }
        System.out.println("Presione cualquier tecla para seguir");
        String h =leer.next();

    }

    @Override
    public void actualizarTelfUsuario(Usuario r, List<Telefono> telefono) {

        r.setTelefono(telefono);

        for (int i = 0; i < telefono.size(); i++) {

            Telefono t = telefono.get(i);
            telefonol.add(t);
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

    @Override
    public void listarTelefonos() {
        if (usuario.size() != 0) {
            for (int i = 0; i < usuario.size(); i++) {
                System.out.print("Uusario " + i);
                System.out.print(" Numreo " + usuario.get(i).getTelefono().get(i).getNumero());
                System.out.print(" Operadora " + usuario.get(i).getTelefono().get(i).getOperadora());
                System.out.print(" Tipo " + usuario.get(i).getTelefono().get(i).getTipo());
            }
        }

    }

    @Override
    public void mostrarTelefonos() {
        for (int i = 0; i < telefonol.size(); i++) {
            System.out.println("Telefono " + i);
            System.out.print(" codigo " + telefonol.get(i).getCodigo());
            System.out.print(" numero " + telefonol.get(i).getNumero());
            System.out.print(" operadora " + telefonol.get(i).getOperadora());
            System.out.print(" tipo " + telefonol.get(i).getTipo());

        }
        
        

    }
};
