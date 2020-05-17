package minggu14;
import java.util.Scanner;
/**
 *  Nama    : Arjuna Pratama Putra
 *  NIM     : 1941720155
 *  Kelas   : TI-1F
 */
public class BinaryTreeArrayMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        int value, a;
        for (a = 0; a < bta.data.length; a++) {
            System.out.println("MASUKKAN INDEKS KE-" + a);
            System.out.print("MASUKKAN NILAI : ");
            value = sc.nextInt();
            bta.add(value);
            System.out.println("===========================");
        }
        bta.popuLateData(bta.data, idxLast);
        bta.traverseInOrder(0);
        System.out.println("");
        bta.traversePostOrder(0);
        System.out.println("");
        bta.traversePreOrder(0);
        System.out.println("");
    }
}