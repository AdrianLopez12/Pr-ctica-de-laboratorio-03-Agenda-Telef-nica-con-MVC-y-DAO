package ec.edu.ups.controlador;
    import ec.edu.ups.Modelo.*;
    import ec.edu.ups.vista.Vista;
public class Controlador {
  private Vista vistaCliente;
  private Usuario usuario;
  private Telefono telefono;

    public Controlador(Vista vistaCliente, Usuario usuario, Telefono telefono) {
        this.vistaCliente = vistaCliente;
        this.usuario = usuario;
        this.telefono = telefono;
    }
  
  public String getCedula() {
        return usuario.getCedula();
    }

    public void setCedula(String cedula) {
        this.usuario.setCedula(cedula);
    }

    public String getNombre() {
        return usuario.getNombre();
    }

    public void setNombre(String nombre) {
        this.usuario.setNombre(nombre);
    }

    public String getApellido() {
        return usuario.getApellido();
    }

    public void setApellido(String apellido) {
        this.usuario.setApellido(apellido);
    }

    public String getCorreo() {
        return usuario.getCorreo();
    }

    public void setCorreo(String correo) {
        this.usuario.setCorreo(correo);
    }

    public String getContrasena() {
        return usuario.getContrasena();
    }

    public void setContrasena(String contrasena) {
        this.usuario.setContrasena(contrasena);
    }
    public void actualizarVista(){
    vistaCliente.imprimirDatosUsuario(usuario.getCedula(),usuario.getNombre(), usuario.getApellido(), usuario.getCorreo(), usuario.getContrasena());
}
    
}
