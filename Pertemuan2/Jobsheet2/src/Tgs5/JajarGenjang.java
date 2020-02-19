/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tgs5;
import java.util.Scanner;
/**
 * Nama : Arjuna Putra Pratama 
 * Kelas : TI/1F 
 * NIM : 1941720155
 */

public class JajarGenjang {
    public int tinggi, sisi, panjang;
    
    
        int hitungKeliling() {
        return (panjang*2) + (sisi*2);
    
    }
    
        int hitungLuas() {
        return panjang * tinggi;

    }

    public static void main(String args[]) {
        Scanner jun = new Scanner(System.in);

        JajarGenjang[] Rumus = new JajarGenjang[5];

        for (int a = 0; a < Rumus.length; a++) {
            Rumus[a] = new JajarGenjang();
            
            System.out.println("   *  *  *   J A J A R G E N J A N G  *  *  * ");
            
            System.out.println("+--------------------------------------------+");
            
            System.out.print("Input Panjang ke-" 
                    + (a + 1) + "\t : ");
            Rumus[a].panjang = jun.nextInt();
            
            System.out.print("Input Tinggi ke-" 
                    + (a + 1) + "\t : ");
            
            Rumus[a].tinggi = jun.nextInt();
            System.out.print("Input Sisi Miring ke-" 
                    + (a + 1) + "\t : ");
            
            Rumus[a].sisi = jun.nextInt();
            
            System.out.println("+--------------------------------------------+");
            System.out.println();
        
        }
        
        System.out.println("Hasilnya:");
        
        for (int x = 0; x < Rumus.length; x++) {
            System.out.println("+--------------------------------------------+");
            
            System.out.println("Luas Jajar Genjang ke-" + (x + 1) + " yaitu \t\t: "
                    + Rumus[x].hitungLuas());
            
            System.out.println("Keliling Jajar Genjang ke-" + (x + 1) + " yaitu \t: "
                    + Rumus[x].hitungKeliling());
            
            System.out.println("+--------------------------------------------+");
            System.out.println();
        }

    }

}
