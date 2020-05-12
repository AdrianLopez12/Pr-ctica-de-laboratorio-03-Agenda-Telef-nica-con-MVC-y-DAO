package ec.udu.ups.principal;
import java.util.Scanner;
import ec.edu.ups.controlador.Controlador;
public class Principal {
    static byte op;
    static Controlador controlador;
    static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("1) Registrarse");
        System.out.println("2) Iniciar secion");
        op=leer.nextByte();
        if(op==1)
        {
           controlador.RegistrarUsuario();
        }
        if(op==2){
            
        }        
        
        
    }
}
