/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author WINDOWS 10
 */
public class LigaPrimer {
    String klub;
    int permainan;
    int agregat;
    int poin;
    
    LigaPrimer (String nama, int p, int gd, int pts) {
        klub = nama;
        permainan = p;
        agregat = gd;
        poin = pts;
    }
    
    void tampil() {
        System.out.println("============================================");
        System.out.println("Nama Klub : "+ klub);
        System.out.println("Jumlah Permainan : "+ permainan);
        System.out.println("Jumlah Agregat : "+ agregat);
        System.out.println("Poin yang didapat : " +poin);
        
    }
}

