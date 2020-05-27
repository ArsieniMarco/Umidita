
package com.mycompany.es20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class Csvr {
        ArrayList<Dato> listadati;

    public Csvr(String percorso)
    {
        this.listadati = new ArrayList<Dato>();
        String line = "";
        String cvsSplitBy = ";";
        int riga = 1, giorno=1;
        float media = 0f;
        int s = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(percorso))) {

            while ((line = br.readLine()) != null) {     //while che legge riga per riga il file fino alla fine del file

                // use ; as separator
                String[] dati = line.split(cvsSplitBy);  //istruzione che suddivide i dati della riga letta in base al carattere indicato
                s=s+Integer.parseInt(dati[10]);
                if(riga%24==0)          //condizione che controlla i 24 valori di una giornata
                {
                    
                    media = s/24;
                    Dato temp = new Dato(giorno,media);   //oggetto temporaneo che verrà aggiungo all'arraylist listadati
                    this.listadati.add(temp);
                    giorno++;
                    s=0;
                }
                riga++;


            }
        } catch (IOException e) {
            e.printStackTrace();           //stampa lo stack delle funzioni che hanno generato l'eccezione
        }
    }

    public ArrayList<Dato> getListadati() {
        return listadati;
    }


    
}
