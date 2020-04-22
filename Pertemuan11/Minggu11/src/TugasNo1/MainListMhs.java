/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo1;
import java.util.Scanner;
/**
 * Nama : Arjuna Putra Pratama 
 * Kelas : TI/1F 
 * NIM : 1941720155
 */
public class MainListMhs {

 public static void menu() {
        System.out.println("+--------------------------------+");
        System.out.println("|      DATA MAHASISWA            |");
        System.out.println("+--------------------------------+");
        System.out.println("|   1. Tambah Data Mahasiswa     |");
        System.out.println("|   2. Hapus Data Mahasiswa      |");
        System.out.println("|   3. Tampilkan Data Mahasiswa  |");
        System.out.println("|   4. Exit                      |");
        System.out.println("+--------------------------------+");
    }

    public static void main(String[] args) {
        ListMhs MHS = new ListMhs();
        Scanner sc = new Scanner(System.in);
        int Mn, Mnn;
        do {
            menu();
            System.out.print("Pilih Menu: ");
            Mn = sc.nextInt();
            try {
                switch (Mn) {
                    case 1:
                        System.out.println("+--------------------------------+");
                        System.out.println("|     Input Biodata Mahasiswa    |");
                        System.out.println("+--------------------------------+");
                        System.out.print("NIM : ");
                        String nim = sc.next();
                        System.out.print("Nama : ");
                        String nama = sc.next();
                        System.out.print("Alamat : ");
                        String alamat = sc.next();
                        MHS.add(nim, nama, alamat);
                        break;

                    case 2:
                        System.out.println("+--------------------------------+");
                        System.out.println("|     Hapus Data Mahasiswa       |");
                        System.out.println("+--------------------------------+");
                        MHS.print();
                        System.out.println("Input NIM Mahasiswa yang ingin dihapus ");
                        System.out.print("NIM : ");
                        String delete = sc.next();
                        System.out.println();
                        MHS.removeByValue(delete);
                        System.out.println("Data setelah dihapus : ");
                        MHS.print();

                        break;

                    case 3:
                        MHS.print();
                        System.out.println();
                        System.out.println("Pencarian Data Mahasiswa (1.Yes/2.No)");
                        Mnn = sc.nextInt();
                        if (Mnn == 1) {
                            System.out.println("Input NIM Mahasiswa yang ingin dicari : ");
                            System.out.print("NIM : ");
                            String search = sc.next();

                            MHS.Search(search);

                        }
                        break;
                    case 4:
                        System.out.println("====================");
                        System.out.println("    Terima Kasih!   ");
                        System.out.println("====================");
        
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (Mn == 1 || Mn == 2 || Mn == 3);
    }

}