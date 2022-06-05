/**
 * Clase para mostrar la gráfica ordenada por edades
 */

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class GraficaOrdenada extends JPanel{

    public void paintComponent(Graphics g){
        super.paintComponent( g );

        int x=50;
		int y=75;
        
        //Rectángulo de la edad con más alumnos
		Color c = new Color(127,255,212);
		g.setColor(c);
        

		g.fillRect(75,75,50,Prueba.edades[0]*10);

        Color j = new Color(138,43,226);
		g.setColor(j);
        g.fillRect(125,y,x,Prueba.edades[1]*10);

        
        Color k = new Color(165,42,42);
		g.setColor(k);
        g.fillRect(175,y,x,Prueba.edades[2]*10);

        
        Color l = new Color(225,20,147);
		g.setColor(l);
        g.fillRect(225,y,x,Prueba.edades[3]*10);

        
        Color m = new Color(222,184,135);
		g.setColor(m);
        g.fillRect(275,y,x,Prueba.edades[4]*10);

        
        Color n = new Color(95,158,160);
		g.setColor(n);
        g.fillRect(325,y,x,Prueba.edades[5]*10);

        
        Color o = new Color(210,105,30);
		g.setColor(o);
        g.fillRect(375,y,x,Prueba.edades[6]*10);

        //Rectángulo de la edad con menos alumnos
        Color p = new Color(127,255,0);
		g.setColor(p);
        g.fillRect(425,y,x,Prueba.edades[7]*10);

        //Nombres de los ejes
        //Etiquetas del eje x
        Color q = new Color(0,0,0);
		g.setColor(q);
        g.drawString("Edades", 300, 350);
        g.drawString(Prueba.edadesNum[0], 80, 50);
        g.drawString(Prueba.edadesNum[1], 130, x);
        g.drawString(Prueba.edadesNum[2], 180, x);
        g.drawString(Prueba.edadesNum[3], 230, x);
        g.drawString(Prueba.edadesNum[4], 280, x);
        g.drawString(Prueba.edadesNum[5], 330, x);
        g.drawString(Prueba.edadesNum[6], 380, x);
        g.drawString(Prueba.edadesNum[7],430, x);

        //Etiqueta del eje y
        g.drawString("A",10, 100);
        g.drawString("L",10, 120);
        g.drawString("U",10, 140);
        g.drawString("M",10, 160);
        g.drawString("N",10, 180);
        g.drawString("O",10, 200);
        g.drawString("S",10, 220);

        //Líneas de la gráfica
        g.drawLine(75, 85, 475, 85);
        g.drawLine(75, 125, 475, 125);
        g.drawLine(75, 175, 475, 175);
        g.drawLine(75, 225, 475, 225);
        g.drawLine(75, 275, 475, 275);

        //Índices de la gráfica
        g.drawString("1", 65, 88);
        g.drawString("5", 65, 128);
        g.drawString("10",55, 178);
        g.drawString("15",55, 228);
        g.drawString("20",55, 278);

    }
}
