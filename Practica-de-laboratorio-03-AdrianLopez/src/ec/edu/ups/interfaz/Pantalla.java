package ec.edu.ups.interfaz;

import java.awt.Frame;
import java.awt.Button;
import java.awt.Component;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Label;
import java.awt.GridLayout;
import java.awt.TextField;

public class Pantalla {

    Frame pantallaInicio = new Frame();
    Frame pantallaRegistroT = new Frame();
    Frame pantallaEliminarT = new Frame();
    Frame pantallaListarT = new Frame();
    Frame pantallaModificar = new Frame();
    
    public void mostrarventana1() {
        pantallaEliminarT.setVisible(false);
        pantallaListarT.setVisible(false);
        pantallaRegistroT.setVisible(false);
        pantallaModificar.setVisible(false);
        pantallaInicio.removeAll();
        pantallaInicio.setVisible(false);
        pantallaInicio.setTitle("Pantalla de inicio");
        
        pantallaInicio.setSize(600, 400);
        
        pantallaInicio.setLocationRelativeTo(null);
        GridLayout layaut1 = new GridLayout(2, 1);
        pantallaInicio.setLayout(layaut1);
        Label label1 = new Label("Ha iniciado secion");
        label1.setAlignment((int) Component.RIGHT_ALIGNMENT);
        label1.setFont(new Font("Serif", Font.BOLD, 22));
        
        Button b1 = new Button("Registrar telefono");
        Button b2 = new Button("Modificar");
        Button b3 = new Button("Eliminar");
        Button b4 = new Button("Listar telefonos");
        Button b5 = new Button("Salir");
        
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();
        Panel panel3 = new Panel();
        Panel panel4 = new Panel();
        Panel panel5 = new Panel();
        
        panel1.add(b1);
        panel2.add(b2);
        panel3.add(b3);
        panel4.add(b4);
        panel5.add(b5);
        
        pantallaInicio.add(label1);
        
        pantallaInicio.add(panel1);        
        pantallaInicio.add(panel2);        
        pantallaInicio.add(panel3);        
        pantallaInicio.add(panel4);        
        pantallaInicio.add(panel5);        
        
        pantallaInicio.setVisible(true);
        
    }

    public void RegistroT() {
        
        pantallaInicio.setVisible(false);
        pantallaRegistroT.removeAll();
        pantallaRegistroT.setTitle("Registro");
        
        Panel p1 = new Panel();
        Label inicio = new Label("Registro telefono");
        pantallaRegistroT.setSize(600, 600);
        inicio.setFont(new Font("Serif", Font.BOLD, 22));
        
        GridLayout layaut1 = new GridLayout(7, 0);
        pantallaRegistroT.setLayout(layaut1);
        pantallaRegistroT.add(p1);
        p1.add(inicio);
        TextField entrada1 = new TextField();
        Panel p2 = new Panel();
        
        Label ntele = new Label("Ingrese numero de telefonos a registrar-->");
        p2.add(ntele);
        p2.add(entrada1);
        pantallaRegistroT.add(p2);
        
        Panel p3 = new Panel();
        Label cod = new Label("Ingrese codigo de telefonos-->");
        TextField entrada2 = new TextField();
        p3.add(cod);
        p3.add(entrada2);
        pantallaRegistroT.add(p3);
        
        Panel p4 = new Panel();
        Label num = new Label("Ingrese numero de telefono-->");
        TextField entrada3 = new TextField();
        p4.add(num);
        p4.add(entrada3);
        pantallaRegistroT.add(p4);
        
        Panel p5 = new Panel();
        Label tipo = new Label("Ingrese tipo de telefonos-->");
        TextField entrada4 = new TextField();
        p5.add(tipo);
        p5.add(entrada4);
        pantallaRegistroT.add(p5);
        
        Panel p6 = new Panel();
        Label operadora = new Label("Ingrese operadora de telefonos-->");
        TextField entrada5 = new TextField();
        p6.add(operadora);
        p6.add(entrada5);
        pantallaRegistroT.add(p6);
        
        Panel P7 = new Panel();
        Button B = new Button("Aceptar");
        P7.add(B);
        pantallaRegistroT.add(P7);
        
        pantallaRegistroT.setVisible(true);
    }
    
    public void modificar() {
        pantallaInicio.setVisible(false);
        pantallaModificar.removeAll();
        pantallaModificar.setTitle("Modificar");
        
        Panel p1 = new Panel();
        Label inicio = new Label("MODIFICAR TELEFONO");
        pantallaModificar.setSize(600, 600);
        inicio.setFont(new Font("Serif", Font.BOLD, 22));
        
        GridLayout layaut1 = new GridLayout(7, 0);
        pantallaModificar.setLayout(layaut1);
        pantallaModificar.add(p1);
        p1.add(inicio);
        TextField entrada1 = new TextField();
        
        Panel p3 = new Panel();
        Label cod = new Label("Ingrese codigo de telefono a modificar-->");
        TextField entrada2 = new TextField();
        p3.add(cod);
        p3.add(entrada2);
        pantallaModificar.add(p3);
        
        Panel p4 = new Panel();
        Label num = new Label("Ingrese nuevo numero -->");
        TextField entrada3 = new TextField();
        p4.add(num);
        p4.add(entrada3);
        pantallaModificar.add(p4);
        
        Panel p5 = new Panel();
        Label tipo = new Label("Ingrese nuevo tipo-->");
        TextField entrada4 = new TextField();
        p5.add(tipo);
        p5.add(entrada4);
        pantallaModificar.add(p5);
        
        Panel p6 = new Panel();
        Label operadora = new Label("Ingrese nueva operadora-->");
        TextField entrada5 = new TextField();
        p6.add(operadora);
        p6.add(entrada5);
        pantallaModificar.add(p6);
        pantallaModificar.setVisible(true);
        
        Panel P7 = new Panel();
        Button B = new Button("Aceptar");
        P7.add(B);
        pantallaModificar.add(P7);
        
    }
    
    public void eliminarT() {
        
        pantallaInicio.setVisible(false);
        pantallaEliminarT.removeAll();
        pantallaEliminarT.setTitle("Modificar");
        
        Panel p1 = new Panel();
        Label inicio = new Label("ELIMINAR TELEFONO");
        pantallaEliminarT.setSize(600, 300);
        inicio.setFont(new Font("Serif", Font.BOLD, 22));
        
        GridLayout layaut1 = new GridLayout(3, 0);
        pantallaEliminarT.setLayout(layaut1);
        pantallaEliminarT.add(p1);
        p1.add(inicio);
        TextField entrada1 = new TextField();
        
        Panel p3 = new Panel();
        Label cod = new Label("Ingrese codigo de telefono a eliminar-->");
        TextField entrada2 = new TextField();
        p3.add(cod);
        p3.add(entrada2);
        pantallaEliminarT.add(p3);
        
        Panel P7 = new Panel();
        Button B = new Button("Eliminar");
        P7.add(B);
        pantallaEliminarT.add(P7);
        
        pantallaEliminarT.setVisible(true);
        
    }
    
    public void listarT() {
        pantallaInicio.setVisible(false);
        pantallaListarT.removeAll();
        pantallaListarT.setTitle("Listar");
        
        Panel p1 = new Panel();
        Label inicio = new Label("LISTA DE SUS TELEFONOS");
        pantallaListarT.setSize(600, 300);
        inicio.setFont(new Font("Serif", Font.BOLD, 22));
        
        GridLayout layaut1 = new GridLayout(3, 0);
        pantallaListarT.setLayout(layaut1);
        pantallaListarT.add(p1);
        p1.add(inicio);
        
        Label lista = new Label();
        Panel p2 = new Panel();
        p2.add(lista);
        
        Panel P7 = new Panel();
        Button B = new Button("Regresar");
        P7.add(B);
        pantallaListarT.add(P7);
        
        pantallaListarT.setVisible(true);
        
    }
    
}
