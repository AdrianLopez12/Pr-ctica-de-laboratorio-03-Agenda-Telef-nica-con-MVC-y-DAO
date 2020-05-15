package ec.edu.ups.dao;
import java.util.List;
import ec.edu.ups.Modelo.*;
public interface IClienteDao {
    
    
    public Usuario validarUsuario(String correo, String contrasena);
    public void GuardarUsuario(Usuario usuario);
    public void EliminarTelefono(Telefono t, Usuario r);
    public void mostrarTelefono(Usuario correo);
    public void actualizarTelfUsuario(Usuario usuario,List<Telefono> telefono);
    public void eliminarUsuario(String correo);
    public void listarTelefonos();
    public void mostrarTelefonos();

}
