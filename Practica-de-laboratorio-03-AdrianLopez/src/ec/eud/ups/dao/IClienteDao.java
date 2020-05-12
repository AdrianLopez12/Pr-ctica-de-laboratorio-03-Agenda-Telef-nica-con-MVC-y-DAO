package ec.eud.ups.dao;
import java.util.List;
import ec.edu.ups.Modelo.*;
public interface IClienteDao {
    
    
    public Usuario validarUsuario(String correo, String contrasena);
    public void crearUsuario();
    public List<Usuario> ObtenerUsuarios();
    public void mostrarTelefono(Usuario correo);
    public void actualizarUsuario(Usuario usuario);
    public void eliminarUsuario(String correo);

}
