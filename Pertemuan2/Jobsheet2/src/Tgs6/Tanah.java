/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tgs6;
import java.util.Scanner;
/**
 * Nama : Arjuna Putra Pratama 
 * Kelas : TI/1F 
 * NIM : 1941720155
 */

public class Tanah {
    public int p, l, tot;

    int hasilLuas() {
        return p * l;
    }

    public static void main(String args[]) {
        Scanner jun = new Scanner(System.in);
        
        Tanah[] Ltanah = new Tanah[10];
        Tanah Luas = new Tanah();
        
        System.out.print("Jumlah Tanah: ");
        Luas.tot = jun.nextInt();
        
        System.out.println();
        
        for (int i = 0; i < Luas.tot; i++) 
        
        {
            Ltanah[i] = new Tanah();
            System.out.println("Tanah " 
                    + (i + 1));
            
            System.out.print("Panjang\t: ");
            Ltanah[i].p = jun.nextInt();
            
            System.out.print("Lebar\t: ");
            Ltanah[i].l = jun.nextInt();
            
            System.out.println();
        }
        
        for (int i = 0; i < Luas.tot; i++) 
        {
            
            System.out.println("Luas Tanah " + (i + 1) + ": "
                    + Ltanah[i].hasilLuas());

        }}}


