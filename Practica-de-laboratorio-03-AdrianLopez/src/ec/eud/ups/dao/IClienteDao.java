package ec.eud.ups.dao;
import java.util.List;
import ec.edu.ups.Modelo.*;
public interface IClienteDao {
    public List<Usuario> ObtenerUsuarios();
    public Usuario obtenerUsuario(int id);
    public void actualizarUsuario(Usuario usuario);
    public void eliminarUsuario(Usuario usuario);
}
