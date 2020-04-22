/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo2;

 /* Nama : Arjuna Putra Pratama 
 * Kelas : TI/1F 
 * NIM : 1941720155
 */
public class Inven<T> {
    
T noBrg, namaBrg, berat, jumlah;
    int beratBrg;
    Inven<T> ext;
   

    public Inven(T noBrg, T namaBrg, T berat, T jumlah, Inven<T> next) {
        this.noBrg = noBrg;
        this.namaBrg = namaBrg;
        this.berat = berat;
        this.jumlah = jumlah;
        this.beratBrg = (int) berat * (int) jumlah;
        this.next = next;
    }
}