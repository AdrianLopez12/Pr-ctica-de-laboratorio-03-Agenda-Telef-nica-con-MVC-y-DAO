package ec.edu.ups.dao;

import ec.edu.ups.Modelo.Telefono;
import java.util.List;

public interface ItelefonoDao {
    
    public void mostrarTelefono(String correo);
    public void actualizarUsuario(List<Telefono> usuario, String correo);
    public void eliminarUsuario(String correo);
    
    
}
