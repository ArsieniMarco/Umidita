
package com.mycompany.es20;

import java.awt.*;
import java.util.ArrayList;


public class Grafico extends Canvas{
    
    private ArrayList<Dato> listaGr;

    public Grafico(ArrayList<Dato> l)
    {
        listaGr = l;
    }

    public void paint(Graphics g)
    {
        g.drawLine(30,10,30,400);  //asse y
        g.drawLine(30,10,25,15); // freccia asse y
        g.drawLine(30,10,35,15); // freccia asse y
        g.drawLine(30,400,1200,400);  //asse x
        g.drawLine(1195,395,1200,400);// freccia asse x
        g.drawLine(1195,405,1200,400);// freccia asse x
        int startx = 40;
        for(Dato d: listaGr)   //for che assegna a d l'oggetto corrente dell'arraylist  
        {
            g.setColor(Color.green);
            if(d.getMed()<=30)
            {
                g.setColor(Color.red);
            }
            else{
                g.setColor(Color.green);
            }
            g.fillRect(startx, 400-(int) d.getMed(), 25,(int) d.getMed()); //disegno colonne
            g.setColor(Color.black);
            g.drawString(Integer.toString(d.getGiorno()),startx+2,413);  //disegno legenda x
            g.setColor(Color.blue);
            g.drawString(Float.toString(d.getMed()),startx,390-(int) d.getMed());  // disegno valori media
            startx = startx + 35 ;


        }
        g.setFont(new Font("Arial",Font.BOLD,25));
        g.drawString("Grafico Umidità Media Gennaio 2010",440,30);

    }

    
    
}
