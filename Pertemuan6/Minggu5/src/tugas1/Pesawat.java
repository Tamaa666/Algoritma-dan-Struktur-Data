/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 * Arjuna Pratama Putra
 * 1941720155
 * TI-1F
 */
public class Pesawat {
    
    public String maskapai;
    public float harga;
    public int transitCount;
    public int flightTime;
    
    public Pesawat(String msk, float hg, int tcn, int flt)
    
    {
        
        maskapai = msk;
        harga = hg;
        transitCount = tcn;
        flightTime = flt;
    
    }
    
    public void tampil()
    
    {
        
        System.out.println("Nama Maskapai\t\t= " + maskapai);
        System.out.println("Harga Tiket\t\t= Rp. " + harga);
        System.out.println("Transit Penerbangan\t= " + transitCount);
        System.out.println("Jam Penerbangan\t\t= " + flightTime);
    
    }}

