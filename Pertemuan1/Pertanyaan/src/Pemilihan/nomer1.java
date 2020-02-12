package pemilihan;
import java.util.Scanner;

/**
 * Arjuna Pratama P
 * TI/1F
 * 1941720155
 */

public class nomer1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totTgs, totUts, uts, uas,tgs, nilaiTot, totUas;
        
        
        
            System.out.print("Masukkan nilai Tugas anda  :    ");
            tgs = sc.nextDouble();
        
            if (tgs < 0 || tgs > 100) {
            System.out.println("Maaf! Nilai yang anda masukkan tidak valid!");
            tgs = 0;
        
        
        }
            System.out.print("Masukkan nilai UTS anda    :    ");
            uts = sc.nextDouble();
            
            if (uts < 0 || uts > 100) {
            System.out.println("Maaf! Nilai yang anda masukkan tidak valid!");
            uts = 0;
        
        
        }
            System.out.print("Masukkan nilai UAS anda    :    ");
            uas = sc.nextDouble();
            
            if (uas < 0 || uas > 100) {
            System.out.println("Maaf! Nilai yang anda masukkan tidak valid!");
            uas = 0;
        }

            totTgs = tgs * 20 / 100;
            totUts = uts * 35 / 100;
            totUas = uas * 45 / 100;
            nilaiTot = totTgs + totUas + totUts;
            
            System.out.println("");
            System.out.println("====================================");
            System.out.println("");
        
            System.out.println("20% dari nilai tugas  =     " + totTgs);
            System.out.println("35% dari nilai uts    =     " + totUts);
            System.out.println("45% dari nilai uas    =     " + totUas);
            System.out.println("Nilai akhir anda      =     " + nilaiTot);
    }

}
