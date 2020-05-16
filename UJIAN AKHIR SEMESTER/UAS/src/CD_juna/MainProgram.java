/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CD_juna;
import java.util.Scanner;
/**
 *  Nama    : Arjuna Pratama Putra
 *  NIM     : 1941720155
 *  Kelas   : TI-1F
 */
public class MainProgram {
    public static void menu() {
        System.out.println("============================================");
        System.out.println("                PERSEWAAN CD");
        System.out.println("============================================");
        System.out.println("Memilih Menu");
        System.out.println("\t1. CD Masuk");
        System.out.println("\t2. CD Keluar");
        System.out.println("\t3. CD Keluar");
        System.out.println("\t4. Tampilkan Semua Data");
        System.out.println("\t5. Pencarian CD (Berdasarkan Kode CD)");
        System.out.println("\t6. Keluar");
        System.out.println("============================================");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList obj = new DoubleLinkedList();
        String judul, distributor;
        int kode, stok, rusak, index, pilih = 0;
        try {
            do {
               menu();
                System.out.print("Masukkan pilihan Anda : ");
                pilih = sc.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.println("===========================================");
                        System.out.println("            CD MASUK");
                        System.out.println("===========================================");
                        System.out.print("Masukkan Nama Judul\t: ");
                        judul = sc.nextLine();
                        System.out.print("Masukkan Nama Distributor\t: ");
                        distributor = sc.nextLine();
                        System.out.print("Masukkan Kode CD\t\t: ");
                        kode = sc.nextInt();
                        System.out.print("Masukkan Stok CD\t\t: ");
                        stok = sc.nextInt();
                        System.out.print("Masukkan CD Rusak\t\t: ");
                        rusak = sc.nextInt();
                        System.out.println("===========================================");
                        obj.addFirst(judul, distributor, kode, stok, rusak);
                        obj.print();
                        System.out.println();
                        break;
                        
                    case 2:
                        System.out.print("Masukkan indeks yang ingin dihapus : ");
                        index = sc.nextInt();
                        obj.remove(index);
                        obj.print();
                        System.out.println("CD keluar pada indeks ke-" + index + "berhasil dihapus!");
                        System.out.println();
                        break;   
                        
                    case 3:
                        System.out.print("Masukkan Indeks\t: ");
                        index = sc.nextInt();
                        System.out.print("Masukkan Judul\t: ");
                        judul = sc.nextLine();
                        System.out.print("Masukkan Distributor\t: ");
                        distributor = sc.nextLine();
                        System.out.print("Masukkan Kode CD\t: ");
                        kode = sc.nextInt();
                        System.out.print("Masukkan Stok CD\t: ");
                        stok = sc.nextInt();
                        System.out.print("Masukkan CD Rusak\t: ");
                        rusak = sc.nextInt();
                        obj.add(judul, distributor, kode, stok, rusak, index);
                        obj.print();
                        System.out.println();
                        break;
                        
                    case 4:
                        obj.print();
                        obj.selectionSort();
                        System.out.println();
                        break;
                        
                    case 5:
                        System.out.print("Masukkan data yang ingin dicari : ");
                        kode = sc.nextInt();
                        obj.cari(kode);
                        System.out.println();
                        break;
                }
            } while(pilih != 6);
         } catch(Exception e) {
            System.out.println(e.getMessage());
         }
    }
}
