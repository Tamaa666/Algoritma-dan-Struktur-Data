/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugassatu;
import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Waralaba {

    static void menu() { 
        System.out.println("================================");
        System.out.println("        ***  M E N U ***        ");
        System.out.println("================================");
        System.out.println("        Paket Chicken         | ");
        System.out.println("       a1. Chicken A     12000| ");
        System.out.println("       a2. Chicken B     15000| ");
        System.out.println("       a3. Chicken C     20000| ");
        System.out.println("================================");
        System.out.println("        Paket Oke             | ");
        System.out.println("       o1. Oke A         10000| ");
        System.out.println("       o2. Oke B         12000| ");
        System.out.println("       o3. Oke C         15000| ");
        System.out.println("================================");
    };    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu();
        int harga = 0, bayar, tot, jml;
        String pilihan; 
        System.out.println("Pesanan: ");
        pilihan = sc.nextLine();
        System.out.println("Jumlah yang dipesan: ");
        jml = sc.nextInt();

        switch (pilihan){
            case "a1":
                harga = 12000;
                break;

            case "a2":
                harga = 15000;
                break;


            case "a3":
                harga = 20000;
                break;

            case "o1":
                harga = 10000;
                break;

            case "o2":
                harga = 12000;
                break;


            case "o3":
                harga = 15000;
                break;

            default:
                System.out.println("Maaf! Menu yang anda masukkan tidak valid!");
        }   
            tot = harga * jml;
            {       
        System.out.println("================================");
        System.out.println("Total Pembayaran    : Rp." +  tot);
        System.out.println("================================");
        System.out.println("           BYE BYE"              );
        System.out.println("================================");
        
}
}
}