
package com.mycompany.es20;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Es20main {
        public static void main(String args[])
    {
        //crea oggetto di classe csvr al quale passa il percorso del file che verrà letto dal costruttore della classe csvr
        Csvr datiletti = new Csvr("C:\\Users\\marsi\\OneDrive\\Desktop\\es20\\umidita2010.csv"); 
        JFrame f = new JFrame("es20main");
        JPanel p = new JPanel(new BorderLayout());
        Grafico Gr = new Grafico(datiletti.getListadati());
        p.add(Gr);
        Container c = f.getContentPane();
	c.add(p);
	f.setSize(1280, 500);
	        f.setVisible(true);
    }


}
