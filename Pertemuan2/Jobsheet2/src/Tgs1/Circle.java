/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tgs1;
import java.util.Scanner;
/**
 * Nama : Arjuna Putra Pratama 
 * Kelas : TI/1F 
 * NIM : 1941720155
 */
public class Circle{
public double PHI = 3.14 , r;

    
    double hitungKeliling() 
    {
        return 2 * PHI * r;
    }

    double hitungLuas() 
    {
        return PHI * (r * r);
    }


    public static void main(String args[]) {
        
      Scanner jun = new Scanner(System.in);
        Circle bundar = new Circle();

        System.out.println("================================");
        
        System.out.print("Masukkan jari-jari lingkaran: ");
                bundar.r = jun.nextDouble();
        
        System.out.println("================================");
        
        System.out.println("Keliling lingkaran  =  " 
                + bundar.hitungKeliling());
        
        System.out.println("Luas     lingkaran  =  "
                + bundar.hitungLuas());
        
        System.out.println("================================");
    }
}
