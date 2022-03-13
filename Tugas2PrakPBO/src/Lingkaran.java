/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Lingkaran implements MenghitungBidang{
    double jarijari;
    double phi = 3.14;

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }
        
    @Override
    public double luas() {
        return(phi*jarijari*jarijari);
    }

    @Override
    public double keliling() {
        return(2*phi*jarijari);
    }

    public double getJarijari() {
        return jarijari;
    }

    public double getPhi() {
        return phi;
    }
    
}
