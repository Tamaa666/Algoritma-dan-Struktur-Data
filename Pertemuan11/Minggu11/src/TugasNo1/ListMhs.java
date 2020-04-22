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
public class ListMhs {
         Mhs head;
         int size;

    public ListMhs() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nim, String nm, String almt) {
        head = new Mhs(nim, nm, almt, head);
        size++;
    }

    public void add(String nim, String nm, String almt) {
        if (isEmpty()) {
            addFirst(nim, nm, almt);
        } else {
            Mhs tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Mhs(nim, nm, almt, null);
            size++;
        }
    }

    public void addLast(String nim, String nm, String almt) {
        if (isEmpty()) {
            addFirst(nim, nm, almt);
        } else {
            Mhs tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Mhs(nim, nm, almt, null);
            size++;
        }
    }

    public void removeByValue(String nim) {
        Mhs prev = head;
        Mhs cur = head.next;
        for (int i = 1; i < size; i++) {
            if (nim != prev.nim) {
                prev = prev;
                cur = prev.next;
            }
        }
        prev.next = cur.next;
        size--;
    }

    public void Search(String cari) {
        Mhs tmp = head;
        for (int i = 1; i < size; i++) {
            if (cari != tmp.nim) {
                tmp = tmp.next;
            }
        }
        System.out.println("Pencarian Data : ");
        System.out.print(tmp.nim + "\t");
        System.out.print(tmp.name + "\t");
        System.out.println(tmp.address);
    }

    void print() {
        if (!isEmpty()) {//selection
            Mhs tmp = head;
            System.out.println("+--------------------------------+");
            System.out.println("|        DATA MAHASISWA          |");
            System.out.println("+--------------------------------+");
            System.out.println("NIM  " + "\t" + "NAMA " + "\t" + "ALAMAT ");
            while (tmp != null) {
                System.out.print(tmp.nim + "\t");
                System.out.print(tmp.name + "\t");
                System.out.println(tmp.address+ "\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Kosong");
        }
    }
}