package Array;
import java.util.Scanner;

/**
 * Arjuna Pratama P
 * TI/1F
 * 1941720155
 */

    public class nomer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[4][5];
        int totakhir = 0;
        
        
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[1].length; y++) 
            {
                
                System.out.print("Masukkan bilangan indeks ke-[" + x + "][" + y + "] = ");
                arr[x][y] = sc.nextInt();
            
            }
        }
        for (int x[] : arr) {
            for (int y : x) {
                
                totakhir += y;
            }
        }
        System.out.println("Total isi array : " + totakhir);
    }
}
