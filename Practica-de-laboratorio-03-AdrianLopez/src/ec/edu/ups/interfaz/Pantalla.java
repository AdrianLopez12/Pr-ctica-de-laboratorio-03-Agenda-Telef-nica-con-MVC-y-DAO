package ec.edu.ups.interfaz;

import java.awt.Frame;
import java.awt.Button;
import java.awt.Component;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Label;
import java.awt.GridLayout;

public class Pantalla {

    public void mostrarventana1() {
        Frame pantallaInicio = new Frame();
        pantallaInicio.setSize(600, 400);

        pantallaInicio.setLocationRelativeTo(null);
        GridLayout layaut1 = new GridLayout(2, 1);
        pantallaInicio.setLayout(layaut1);
        Label label1 = new Label("Ha iniciado secion");
        label1.setAlignment((int) Component.RIGHT_ALIGNMENT);
        label1.setFont(new Font("Serif", Font.BOLD, 22));
        
        
Button b1=new Button("Registrar telefono");
Button b2=new Button("Modificar");
Button b3=new Button("Eliminar");
Button b4=new Button("Listar telefonos");
Button b5=new Button("Salir");

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

    
}
