
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        int menu, back;
        double panjang, tinggi, lebar, jarijari;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("+==================+");
            System.out.println("|    Menu Utama    |");
            System.out.println("+==================+");
            System.out.println("| 1. Hitung Balok  |");
            System.out.println("| 2. Hitung Tabung |");
            System.out.println("| 0. Exit          |");
            System.out.println("+------------------+");
            System.out.print("Pilih : ");
            menu = input.nextInt();

            if(menu == 1){
                System.out.print("Input Panjang  : ");
                panjang = input.nextDouble();
                System.out.print("Input Lebar    : ");
                lebar = input.nextDouble();
                System.out.print("Input TInggi   : ");
                tinggi = input.nextDouble();
                
                Balok balok = new Balok(tinggi, panjang, lebar);
                System.out.println("Luas Persegi Panjang     : " + balok.luas());
                System.out.println("Keliling Persegi Panjang : " + balok.keliling());
                System.out.println("Volume Balok             : " + balok.volume());
                System.out.println("Luas Permukaan Balok     : " + balok.lp());
            }
            else if(menu == 2){
                System.out.print("Input Tinggi : ");
                tinggi = input.nextDouble();
                System.out.print("Input Jari - jari : ");
                jarijari = input.nextDouble();
                
                Tabung tabung = new Tabung(tinggi, jarijari);
                System.out.println("Luas Lingkaran        : " + tabung.luas());
                System.out.println("Keliling Lingkaran    : " + tabung.keliling());
                System.out.println("Volume Tabung         : " + tabung.volume());
                System.out.println("Luas Permukaan Tabung : " + tabung.lp());
            }
            else if(menu == 0){
                System.exit(0);
            }
            else{
                System.out.println("Menu tidak ada. Mohon masukkan pilihan menu dengan benar!");
            }
            
            System.out.print("Ulangi? (Ya: 1 || Tidak:0) : ");
            back = input.nextInt();
            System.out.println("");
        }
        while(back == 1);
    }
}
