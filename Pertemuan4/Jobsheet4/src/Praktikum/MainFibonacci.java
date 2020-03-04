/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import Praktikum.Fibonacci;
import java.util.Scanner;

/**
 * Arjuna Pratama P
 * TI/1F
 * 1941720155
 */

public class MainFibonacci 

{

    public static void main(String[] args) 
    
    {
        Scanner sc = new Scanner(System.in);
        Fibonacci fb = new Fibonacci();
        
        System.out.println("+---------- F I B O N A C C I ----------+");
        System.out.print("Input banyak range: ");
        int x = sc.nextInt();

        System.out.println("+-------- Pilih Cara Penyelesaian ---------+");
        System.out.println("A. Bruce Force");
        System.out.println("B. Divide Conquer");
        System.out.print  ("Input pilihan : ");
        String pilih = sc.next();
        System.out.println("+---------------------------------+");
        
        if (pilih.equalsIgnoreCase("A")) 
        
        {
            for (int i = 0; i < x; i++) 
            {
                
                System.out.println("Fibonacci : " + fb.FibonacciBF(i));
            
            }
        } 
        
        else 
        
        {
            for (int i = 0; i < x; i++)
                
            {
                
                System.out.println("Fibonacci : " + fb.FibonacciDC(i));
            
            }}}}
