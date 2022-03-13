/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class PersegiPanjang implements MenghitungBidang{
    double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
       
    @Override
    public double luas() {
        return(panjang*lebar);
    }

    @Override
    public double keliling() {
        return(2*panjang+2*lebar);
    }
    
    public double luas(double p, double l){
        return(p*l);
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }
    
    
}
