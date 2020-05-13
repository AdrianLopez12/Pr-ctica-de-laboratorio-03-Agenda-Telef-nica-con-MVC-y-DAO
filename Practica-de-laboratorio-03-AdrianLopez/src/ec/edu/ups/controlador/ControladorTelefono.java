package ec.edu.ups.controlador;

import ec.edu.ups.Modelo.Telefono;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ControladorTelefono {
    Scanner leer=new Scanner(System.in);

    public List<Telefono> CrearTelefono(){
        System.out.println("cuantos telefonos va a registrar?");
                        byte nt=leer.nextByte();
                        List <Telefono> telefono=new ArrayList<>();
                        for (int i = 0; i < nt; i++) {
                            System.out.println("Ingrese codigo");
                        int codigo=leer.nextInt();
                        System.out.println("Ingrese numero");
                        String numero=leer.next();
                        System.out.println("Ingrese tipo");
                        String tipo=leer.next();
                        System.out.println("Ingrese operadora");
                        String operador=leer.next();
                        Telefono tele=new Telefono(codigo, numero, tipo, operador);
                        telefono.add(tele);
                        
    }
                        return telefono;
    }
}
