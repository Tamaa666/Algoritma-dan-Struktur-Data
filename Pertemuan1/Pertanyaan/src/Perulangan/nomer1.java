package perulangan;
import java.util.Scanner;

/**
 * Arjuna Pratama P
 * TI/1F
 * 1941720155
 */

public class nomer1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int akg;
        
        System.out.print("Input angka : ");
        akg = sc.nextInt();
        
        for (int i = 0; i < 5; i++) 
        {
            akg -= 3;
        }
        
        System.out.println("Hasil akhir = " + akg);
        
        if (akg % 2 == 0) {
            
            System.out.println("Hasil akhir berupa bilangan genap");
            
        } else 
        {
            
            System.out.println("Hasil akhir berupa bilangan ganjil");
           
        }
      }
    }
