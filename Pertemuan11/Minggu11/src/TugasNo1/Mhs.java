/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo1;

/**
 * Nama : Arjuna Putra Pratama 
 * Kelas : TI/1F 
 * NIM : 1941720155
 */
public class Mhs {

 
    String nim, name, address;
    Mhs next;

    public Mhs(String nim, String name, String address, Mhs next) {
        this.nim = nim;
        this.name = name;
        this.address = address;
        this.next = next;
    }
}