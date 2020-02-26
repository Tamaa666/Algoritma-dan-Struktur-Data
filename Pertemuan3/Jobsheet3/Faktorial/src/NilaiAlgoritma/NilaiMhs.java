/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NilaiAlgoritma;

/**
 * Arjuna Pratama P
 * TI/1F
 * 1941720155
 */

public class NilaiMhs {
    public int nilaiTugas;
    public int nilaiKuis;
    public int nilaiUTS;
    public int nilaiUAS;
    public String namaMhs;
    public int tot;
    public int jml;
    
        double hitungTotalNilai(int nlT, int nlK, 
                int nlUa, int nlUt){
        return ((nlT * 30 / 100) + (nlK * 20 / 100) 
                    + (nlUt * 20 / 100) + (nlUa * 30 / 100));
        
        }}

