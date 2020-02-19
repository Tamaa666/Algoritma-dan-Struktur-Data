/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tgs2;
import java.util.Scanner;
/**
 * Nama : Arjuna Putra Pratama 
 * Kelas : TI/1F 
 * NIM : 1941720155
 */
public class SewaGameProg {

    public static void main(String[] args) {
    Scanner jun = new Scanner(System.in);
        
        System.out.println("+-------------------------+");
        System.out.println("***  RENTAL GAME GUYS   ***");
        System.out.println("+-------------------------+");
        SewaGameRun wx = new SewaGameRun();
        
        System.out.print("Silahkan ketikkan nama : ");
        wx.nama = jun.nextLine();
        System.out.println();

	    SewaGameRun[] rental = new SewaGameRun[2];
            rental[0] = new SewaGameRun();
            rental[0].id    = "Mnt889";
            rental[0].price = 50000;
            rental[0].game  = "Mobile Legend";

                
            rental[1] = new SewaGameRun();
            rental[1].id    = "Tnc755";
            rental[1].price = 45000;
            rental[1].game  = "Arena of Valor";


                System.out.println("+----------------------+");
		System.out.println("  *** Katalog Game ***  ");
                System.out.println("+----------------------+");
                
                        for (int i = 0; i < rental.length ; i++) 
                    {
                        System.out.println((i+1) + ".) " + rental[i].game );
		    }
                
                System.out.println("+----------------------+");
                
		System.out.print("Anda memilih : ");
		wx.pilih = jun.nextInt();

		if (wx.pilih > 0 && wx.pilih <= (rental.length)) {
			
		System.out.print("Ingin menyewa berapa hari : ");
		wx.lama = jun.nextInt();
                
                System.out.println("");
                    
                System.out.println("+----------------------+");
                
		System.out.println("Id Game\t\t : " + rental[(wx.pilih-1)].id);
                
		System.out.println("Nama Penyewa\t : " + wx.nama);
                
		System.out.println("Game\t\t : " + rental[(wx.pilih-1)].game);
                
		System.out.println("Waktu Pinjam\t : " + wx.lama + " Hari ");
                
		System.out.println("Harga Total\t : Rp " + (rental[(wx.pilih-1)
                        ].price * wx.lama) + ",-");
                
                System.out.println("+----------------------+");
                }
                
                else
                
                {
                
                System.exit(0);
                
                }}}