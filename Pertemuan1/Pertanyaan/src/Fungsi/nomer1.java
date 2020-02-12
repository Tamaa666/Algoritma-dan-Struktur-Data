package Fungsi;
import java.util.Scanner;

/**
 * Arjuna Pratama P
 * TI/1F
 * 1941720155
 */

    public class nomer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil, berhitungA = 0, berhitungB = 1, berhitung;
        
        
        System.out.print("Masukkan bilangan : ");
        bil = sc.nextInt();
        
        System.out.println("Hasil bilangan fibonacci: ");
        
        for (int i = 0; i < bil; i++) {
            if (i == 0 || i == 1) {
                continue;
            }
            berhitung = berhitungA + berhitungB;
            
            System.out.println(berhitungA + " + " + berhitungB + " = " + berhitung);
            
            berhitungA = berhitungB;
            berhitungB = berhitung;
        }
        System.out.println("Hasil bilangan fibonacci: ");
        for (int i = 0; i < bil; i++) {
            int tot = fibonacci(i);
            System.out.print(tot + " ");
        }
    }

    static int fibonacci(int bil) {
        if (bil == 0 || bil == 1) {
            return bil;
        } else {
            return (fibonacci(bil - 1) + fibonacci(bil - 2));
        }
    }
}
