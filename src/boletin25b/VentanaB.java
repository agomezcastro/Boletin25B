package boletin25b;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author agomezcastro
 */
public class VentanaB implements ActionListener{
    JFrame marco;
    JPanel panel;
    JButton boton;
    JButton boton2;
    JTextField campo;
    
    
    public void crearVentana(){
        marco = new JFrame();
        panel = new JPanel();
        boton = new JButton("Debuxa");
        boton2 = new JButton("Limpa");
        campo = new JTextField(2);
        
        
        boton.addActionListener(this);
        boton2.addActionListener(this);
        marco.setSize(800, 800);
        boton.setSize(50, 30);
        boton2.setSize(50, 30);
        panel.add(boton);
        panel.add(boton2);
        panel.add(campo);
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obx = e.getSource();
        int x=0;
        int y=0;
        if(obx == boton){
            for(int i=0; i<Integer.parseInt(campo.getText()); i++){
            Graphics g = panel.getGraphics();
        
            g.setColor(Color.red);
            g.fillOval(50+x, 50+y, 100, 100);
            x=x+100;
            if (x>=800){
                x=10;
                y=200;
            }
        }
        }
        else{
            panel.repaint();
        }
        }
}
