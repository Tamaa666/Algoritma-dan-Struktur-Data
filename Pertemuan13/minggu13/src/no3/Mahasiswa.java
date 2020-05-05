
/**
 * Arjuna Pratama P
 * TI/1F
 * 1941720155
 */
package no3;

public class Mahasiswa {
    String nama;
    int nilai;
    Mahasiswa next, prev;
    
    public Mahasiswa(Mahasiswa prev, String nama, int nilai, Mahasiswa next) {
        this.prev = prev;
        this.nama = nama;
        this.nilai = nilai;
        this.next = next;
    }
}
