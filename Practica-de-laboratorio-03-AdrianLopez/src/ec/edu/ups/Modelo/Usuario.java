
package ec.edu.ups.Modelo;
import ec.edu.ups.Modelo.Telefono;
public class Usuario {
    private Telefono[] telefono;
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;

    public Usuario() {
    }

    public Usuario(Telefono[] telefono, String cedula, String nombre, String apellido, String correo, String contrasena) {
        this.telefono = telefono;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public Telefono[] getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono[] telefono) {
        this.telefono = telefono;
    }

   
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
