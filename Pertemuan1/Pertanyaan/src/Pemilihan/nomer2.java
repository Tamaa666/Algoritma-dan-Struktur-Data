package pemilihan;
import java.util.Scanner;
/**
 * Arjuna Pratama P
 * TI/1F
 * 1941720155
 */

public class nomer2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int masukan;
        System.out.println("=========================");
        System.out.println("BILANGAN KELIPATAN 2,6,15");
        System.out.println("=========================");
        System.out.println("");
        System.out.print("Masukkan bilangan : ");
        masukan = sc.nextInt();

        if (masukan %2 == 0 && masukan %6 == 0 && masukan %15 == 0) {
            
            System.out.println("Bilangan kelipatan 2,6,15");
            
        } else if (masukan %2 == 0 && masukan % 6 == 0) {
            
            System.out.println("Bilangan kelipatan 2,6");
            
        } else if (masukan %6 == 0 && masukan % 15 == 0) {
            
            System.out.println("Bilangan kelipatan 6,15");
            
        } else if (masukan %15 == 0 && masukan % 2 == 0) {
            
            System.out.println("Bilangan kelipatan 2,15");
            
        } else if (masukan %2 == 0) {
            
            System.out.println("Bilangan kelipatan 2");
            
        } else if (masukan %6 == 0) {
            
            System.out.println("Bilangan kelipatan 6");
            
        } else if (masukan %15 == 0) {
            
            System.out.println("Bilangan kelipatan 15");
            
        } else {
            
            System.out.println("Bilangan Bukan kelipatan 2,6,ataupun 15");
       }
      } 
     }
