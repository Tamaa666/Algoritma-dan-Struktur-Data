/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NilaiAlgoritma;
import java.util.Scanner;
/**
 * Arjuna Pratama P
 * TI/1F
 * 1941720155
 */

public class NilaiAlgoritma {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        
        System.out.println("+---------------------------------------------------+");
        System.out.println("* * * H I T U N G N I L A I M A H A S I S W A * * * ");
        System.out.println("+---------------------------------------------------+");
        System.out.print("Input Jumlah Mahasiswa  : ");
        int jml =input.nextInt();
        
        NilaiMhs[] nmh = new NilaiMhs[jml];
        
        for (int x = 0; x < jml; x++) {
            input.nextLine();
            nmh[x] = new NilaiMhs();
            
            System.out.print("Nama Mahasiswa ke-" + (x+1) + "\t: ");
            nmh[x].namaMhs = input.nextLine();
            
            System.out.print("Input Nilai Tugas\t: ");
            nmh[x].nilaiTugas = input.nextInt();
            
            System.out.print("Input Nilai Kuis\t: ");
            nmh[x].nilaiKuis = input.nextInt();
            
            System.out.print("Input Nilai UTS\t: ");
            nmh[x].nilaiUTS = input.nextInt();
            
            System.out.print("Input Nilai UAS\t: ");
            nmh[x].nilaiUAS = input.nextInt();
            
            System.out.println();
        }
        
            System.out.println("");
            
            System.out.println("+-----------------------------------------------+");
            System.out.println("Total Nilai Mahasiswa");
            System.out.println("+-----------------------------------------------+");
            
            for(int y = 0; y<jml; y++) {
                System.out.println("Mahasiswa ke-" + ( y + 1 ) + " : " + nmh[y].namaMhs);
                System.out.println("Nilai Tugas\t: " + nmh[y].nilaiTugas);
                System.out.println("Nilai Kuis\t: " + nmh[y].nilaiKuis);
                System.out.println("Nilai UTS\t: " + nmh[y].nilaiUTS);
                System.out.println("Nilai UAS\t:" + nmh[y].nilaiUAS);
                System.out.println("Total Nilai Keseluruhan : " + nmh[y].hitungTotalNilai(
                        nmh[y].nilaiTugas,nmh[y].nilaiKuis, nmh[y].nilaiUTS,nmh[y].nilaiUAS));
                }
            System.out.println("+-----------------------------------------------+");
            System.out.println();
            
            for(int v = 0; v < jml; v++){
                System.out.println("Total Nilai Seleuruh Mahasiswa : " + nmh[v]
                        .hitungTotalNilai(nmh[v].nilaiTugas,nmh[v].nilaiKuis, 
                        nmh[v].nilaiUTS,nmh[v].nilaiUAS)/4);
            }}}
 