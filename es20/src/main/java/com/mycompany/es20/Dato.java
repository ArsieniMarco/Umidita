
package com.mycompany.es20;


public class Dato {
        private int giorno;
    private float med = 0f;
    public Dato(int g, float m)
    {
        giorno = g;
        med = m;
    }

    public int getGiorno() {
        return giorno;
    }

    public float getMed() {
        return med;
    }

    public void setGiorno(int giorno) {
        this.giorno = giorno;
    }

    public void setMed(float med) {
        this.med = med;
    }
    
    
}
