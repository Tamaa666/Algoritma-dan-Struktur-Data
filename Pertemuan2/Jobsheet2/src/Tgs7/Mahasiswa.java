/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tgs7;
import java.util.Scanner;

/**
 * Nama : Arjuna Putra Pratama 
 * Kelas : TI/1F 
 * NIM : 1941720155
 */

public class Mahasiswa {
    public static void main(String[] args) {
        Scanner jun = new Scanner(System.in);
        
        System.out.print("Jumlah mahasiswa: ");
        int jml = jun.nextInt();
        System.out.println("");
        
        Campus[] nilai = new Campus[jml];
        
        for(int x = 0; x < nilai.length; x++)
        
        {
            
            System.out.println("Mhs " 
                    + (x+1));
            
            System.out.print("Nilai 1\t: ");
            int p1 = jun.nextInt();
            
            System.out.print("Nilai 2\t: ");
            int p2 = jun.nextInt();
            
            nilai[x] = new Campus(p1, p2);
        
        }
        System.out.println("");
        
        for(int b = 0; b < nilai.length; b++)
        {
            
            System.out.println("Nilai terbaik Mhs " + (b+1) 
                    + ": " + nilai[b].nilaiTerbaik());
            
        }}}

