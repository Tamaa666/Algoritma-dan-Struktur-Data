/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tgs7;

/**
 * Nama : Arjuna Putra Pratama 
 * Kelas : TI/1F 
 * NIM : 1941720155
 */

public class Campus {
    
    public int penilaian1, penilaian2;
    public Campus(int p1, int p2)
    
    {
        
        penilaian1 = p1;
        penilaian2 = p2;
   
    }
    
    
    public int nilaiTerbaik()
            
    {
        
        if(penilaian1 > penilaian2)
        
        {
            
            return penilaian1;
            
        }
        
        else 
            
        {
            
            return penilaian2;
            
        }}} 