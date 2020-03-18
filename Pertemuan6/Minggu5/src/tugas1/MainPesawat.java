/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;
import java.util.Scanner;
/**
 * Arjuna Pratama Putra
 * 1941720155
 * TI-1F
 */
public class MainPesawat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);
        ListHargaTiket data = new ListHargaTiket();
        int jmlTiket = 3;
        
        for(int i=0; i < jmlTiket; i++)
        {
            System.out.println("+-----------------------------------------------+");
            System.out.println("        DATA TIKET PESAWAT DARI MASKAPAI");
            System.out.println("+-----------------------------------------------+");
            
            System.out.print("Input Maskapai\t\t= ");
            String nama = scn1.nextLine();
            
            System.out.print("Harga Tiket\t\t= Rp. ");
            float harga = scn.nextFloat();
            
            System.out.print("Transit \t= ");
            int transitCount = scn.nextInt();
            
            System.out.print("Jam Penerbangan\t\t= ");
            int flightTime = scn.nextInt();
            
            System.out.println("+-----------------------------------------------+");
            System.out.println();
            
            Pesawat t = new Pesawat(nama, harga, transitCount, flightTime);
            data.tambah(t);
        }
        
        System.out.println("List Harga Tiket");
        data.tampil();
        
        System.out.println();
        System.out.println("List Tiket Bubblesort");
        data.bubbleSort();
        data.tampil();
        
        System.out.println();
        System.out.println("List Tiket Selection Sort");
        data.selectionSort();
        data.tampil();
    
    }}

