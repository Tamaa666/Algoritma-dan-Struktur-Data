/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaslima;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class luas {
    static Scanner sc = new Scanner(System.in);
    static void menu(){
    System.out.println("======================");
    System.out.println("1. luas segitiga");
    System.out.println("2. luas segiempat");
    System.out.println("3. luas lingkaran");
    System.out.println("4. exit");
    System.out.println("======================");
    }
    static void memilih() {
        int menu;
        System.out.print("Pilih menu: ");
        menu = sc.nextInt();
        switch (menu) {
            
            case 1:
                segitiga();
                System.out.println("======================");
                menu();
                memilih();
                break;
                
                case 2:
                segiempat();
                System.out.println("======================");
                menu();
                memilih();
                break;
                     
                case 3:
                lingkaran();
                System.out.println("======================");
                menu();
                memilih();
                break;
                    
                case 4:
                System.out.println("Terimakasih!");
                System.exit(0);
        
                default:
                System.out.println("Maaf! Menu yang anda masukkan tidak valid!");
        }
    }
    static void segitiga() {
       int alas, tinggi;
	float luas;
	System.out.print("Masukkan alas: ");
	alas = sc.nextInt();
	System.out.print("Masukkan tinggi: ");
	tinggi = sc.nextInt();
	luas = alas * tinggi / 2;
	System.out.println("Luas Segitiga = " + luas);
        System.out.println();
    }
    static void segiempat(){
        int sisi,luas; 
        System.out.print("Masukkan sisi: ");
        sisi = sc.nextInt();
        luas = sisi * sisi;
        System.out.println("Luas Segiempat = " + luas);
        System.out.println();
    } 
    static void lingkaran(){
       	float phi = 3.14F, jari2,luas;
	System.out.print("Masukkan jari-jari : ");
	jari2 = sc.nextInt();
	luas = phi * jari2 * jari2;
	System.out.print("luas = " + luas);
        System.out.println();
    }
 public static void main(String[] args) {
 menu();
 memilih();
    }
}
