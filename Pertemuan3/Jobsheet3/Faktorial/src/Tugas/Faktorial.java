/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class Faktorial {
    public int nilai;
    public int faktorialBF(int n) {
       int fakto = 1;
       int i = 1;
       while (i<fakto){
           fakto=fakto*1;
           i++;
        //for (int i = 1; i <= n; i++) {
       //     fakto = fakto * i;
       }
       return fakto;
    }


    public int faktorialDC(int n){
        if (n==1) {
            return 1;
}
else
        {
    int fakto = n * faktorialDC(n-1);
    return fakto;
        }}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
    System.out.println("======================================");
    System.out.print("Masukkan jumlah elemen yang dihitung : ");
    int elemen = sc.nextInt();
    
    Faktorial [] fk = new Faktorial [elemen];
    for (int i = 0; i < elemen; i++){
        fk[i] = new Faktorial();
        System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
        fk[i].nilai = sc.nextInt();
    }
    
    System.out.println("======================================");
    System.out.println("Hasil Faktorial dengan Brute Force");
    for (int i = 0; i < elemen; i++){
        System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));
    }
     System.out.println("======================================");
    System.out.println("Hasil Faktorial dengan Divide and Conquer");
    for (int i = 0; i < elemen; i++){
        System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));
}
     System.out.println("======================================");
}
}