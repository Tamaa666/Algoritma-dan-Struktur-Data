/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tgs3;
import java.util.Scanner;

/**
 * Nama : Arjuna Putra Pratama 
 * Kelas : TI/1F 
 * NIM : 1941720155
 */

public class DiskonanRun {
    	public static void main(String[] args) {
            
	Scanner input = new Scanner(System.in);
	Diskonan ax = new Diskonan();
        
        System.out.println("+----------------------+");
        System.out.println(" * * *   BARANG   * * * ");
        System.out.println("+----------------------+");
        
	System.out.print("Nama : ");
	Diskonan.nama = input.nextLine();
        
	System.out.print("Harga Barang : Rp " + ",-");
	Diskonan.hargaSatuan = input.nextInt();
        
	System.out.print("Jumlah Barang : ");
	Diskonan.jml = input.nextInt();
        System.out.println("+----------------------+");
        
	System.out.println("Nama\t\t\t : " + Diskonan.nama);
        
	System.out.println("Harga Satuan Barang\t : Rp "
                + Diskonan.hargaSatuan + ",-");
        
	System.out.println("Total \t\t\t : Rp " + Diskonan.hitungHargaBayar()
                + ",-");

        }}
