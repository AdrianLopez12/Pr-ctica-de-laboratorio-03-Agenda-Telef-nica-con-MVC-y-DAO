package ec.eud.ups.dao;
import java.util.List;
import ec.edu.ups.Modelo.*;
public interface IClienteDao {
    public boolean validarUsuario(String correo, String contrasena);
    public void crearUsuario();
    public List<Usuario> ObtenerUsuarios();
    public void mostrarTelefono(String correo);
    public void actualizarUsuario(List<Telefono> usuario, String correo);
    public void eliminarUsuario(Usuario usuario);
}
