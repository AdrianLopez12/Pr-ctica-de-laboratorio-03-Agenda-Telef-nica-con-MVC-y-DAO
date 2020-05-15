package ec.edu.ups.controlador;

import ec.edu.ups.Modelo.Telefono;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControladorTelefono {

    Scanner leer = new Scanner(System.in);

    public List<Telefono> CrearTelefono() {
        System.out.println("cuantos telefonos va a registrar?");
        byte nt = leer.nextByte();
        List<Telefono> telefono = new ArrayList<>();
        for (int i = 0; i < nt; i++) {
            System.out.println("Ingrese codigo");
            int codigo = leer.nextInt();
            System.out.println("Ingrese numero");
            String numero = leer.next();
            System.out.println("Ingrese tipo");
            String tipo = leer.next();
            System.out.println("Ingrese operadora");
            String operador = leer.next();
            Telefono tele = new Telefono(codigo, numero, tipo, operador);
            telefono.add(tele);

        }
        return telefono;
    }

    public Telefono ModificarTelefono(List<Telefono> telf) {
        System.out.println("Codigo de telefono a modificar");
        int codigo = leer.nextInt();
        for (int i = 0; i < telf.size(); i++) {
            if (telf.get(i).getCodigo() == codigo) {
                System.out.println("Ingrese nuevo numero");
                String numero = leer.next();
                System.out.println("Ingrese nuevo tipo");
                String tipo = leer.next();
                System.out.println("Ingrese nueva operadora");
                String operadora = leer.next();
                telf.get(i).setNumero(numero);
                telf.get(i).setOperadora(operadora);
                telf.get(i).setTipo(tipo);
                return telf.get(i);

            }
        }
        Telefono a = null;
        return a;
    }

    public Telefono BuscarTelefono(List<Telefono> t) {
        System.out.println("Ingrese codigo del telefono");
        int codigoT = leer.nextInt();
        for (int i = 0; i < t.size(); i++) {

            if (t.get(0).getCodigo() == codigoT) {

                return t.get(i);
            }

        }
        Telefono te = null;
        return te;

    }
}
