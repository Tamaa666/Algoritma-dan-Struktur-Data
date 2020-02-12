package perulangan;
import java.util.Scanner;

/**
 * Arjuna Pratama P
 * TI/1F
 * 1941720155
 */

public class nomer2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sld;
        
        
        System.out.print("Masukkan jumlah saldo : ");
        sld = sc.nextInt();
        for (int x = 0; x < 12; x++) {
            
            System.out.println("Saldo bulan ke-" + (x + 1) + " = " + sld);
            sld = sld + (sld * 2 / 100);
            
        }
      }
    }
