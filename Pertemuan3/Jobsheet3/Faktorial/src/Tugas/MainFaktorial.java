package Tugas;
/**
 * Arjuna Pratama P
 * TI/1F
 * 1941720155
 */

import java.util.Scanner;
public class MainFaktorial {
  
   
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
    System.out.println("================================");
    System.out.print("Masukkan Jumlah Elemen yang ingin di hitung : ");        
    int elemen = sc.nextInt();
    
    Faktorial[]Fk = new Faktorial[elemen];
    //double start = System.nanoTime();
    for(int i = 0; i < elemen; i++){
    Fk[i] = new Faktorial();
            System.out.println("Masukkan nilai data ke -" + (i+1) + " : ");
           Fk[i].nilai = sc.nextInt();
    }
            System.out.println("===========================");
            System.out.println("Hasil Faktorial dengan Brute Force");
           double start = System.nanoTime();
            for (int i = 0; i < elemen; i++){
                System.out.println("Faktorial dari nilai " + Fk[i].nilai+ " adalah : " + Fk [i].faktorialBF(Fk[i].nilai));
            }
            double finish = System.nanoTime();
            System.out.println("Waktu eksekusi Program adalah : " + finish);
            
            
            System.out.println("=============================");
            System.out.println("Hasil Faktorial dengan divide and conquer");
            start = System.nanoTime();
            for (int i = 0; i < elemen; i++){
                System.out.println("Faktorial dari nilai " + Fk[i].nilai+ " adalah : " +Fk[i].faktorialDC(Fk[i].nilai));
            }
            finish = System.nanoTime();
            System.out.println("Waktu Eksekusi Program adalah : " + finish);
            System.out.println("==============================");
}
    }

