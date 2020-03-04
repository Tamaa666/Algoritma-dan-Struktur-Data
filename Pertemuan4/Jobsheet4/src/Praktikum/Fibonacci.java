/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 * Arjuna Pratama P
 * TI/1F
 * 1941720155
 */
public class Fibonacci {

    public int FibonacciDC(int x) 
    {
        if (x <= 1) {
            return x;
        } else {
            return FibonacciDC(x - 1) + FibonacciDC(x - 2);
        }
    }
    public int FibonacciBF(int a)
    {
        int b[];
        
        b = new int[(int ) a + 2];
        
        b[0] = 0;
        
        b[1] = 1;
        
        for (int i = 2; i<=a; i++)
        {
            
            b[i] = b[i-1] + b[i-2];
        
        }
        
        return b [(int) a];
    }}
