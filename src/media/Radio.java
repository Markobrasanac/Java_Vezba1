/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

/**
 *
 * @author qa-popodne
 */
public class Radio {

    private double fmFrequency;
    private int amFrequency;
    private char band;

    public double getFmFrequency() {
        return fmFrequency;
    }

    public void setFmFrequency(double fmFrequency) {
        this.fmFrequency = fmFrequency;
    }

    public int getAmFrequency() {
        return amFrequency;
    }

    public void setAmFrequency(int amFrequency) {
        this.amFrequency = amFrequency;
    }

    public char getBand() {
        return band;
    }

    public void setBand(char band) {
        this.band = band;
    }

    public Radio() {
        this.fmFrequency = 91.8;
        this.amFrequency = 600;
        this.band = 'A';
    }
    
    
    public Radio(double fmFrequency,int amFrequency, char band) {
        
        this.fmFrequency = fmFrequency;
        this.amFrequency  = amFrequency;
        this.band = band;
        
    }

    public void printMainAttributes() {

        System.out.println("Fm frekvencija je:" + getFmFrequency());
        System.out.println("Am frekvencija je:" + getAmFrequency());;
        System.out.println("Band je:" + getBand());

    }
    
    public void showData() {
        System.out.println("Fm frekvencija je:" + getFmFrequency());
        System.out.println("Am frekvencija je:" + getAmFrequency());;
        System.out.println("Band je:" + getBand());
        
        
    }

}
