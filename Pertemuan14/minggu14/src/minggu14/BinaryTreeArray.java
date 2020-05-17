package minggu14;
/**
 *  Nama    : Arjuna Pratama Putra
 *  NIM     : 1941720155
 *  Kelas   : TI-1F
 */
public class BinaryTreeArray {
    int[] data;
    int idxLast;
    int a = 0;

    public BinaryTreeArray(){
        data = new int[10];
    }
        void add(int nilai){
    data[a] = nilai;
    a++;
    }
    void popuLateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStart) {
        if(idxStart<=idxLast) {
        traverseInOrder(2*idxStart+1);
        System.out.print(data[idxStart]+" ");
         traverseInOrder(2*idxStart+2);
        }
    }
    void traversePreOrder(int idxStart) {
        System.out.print(data[idxStart]+" ");
        traverseInOrder(2*idxStart+1);
        traverseInOrder(2*idxStart+2);
    }
    void traversePostOrder(int idxStart) {
        traverseInOrder(2*idxStart+1);
        traverseInOrder(2*idxStart+2);
        System.out.print(data[idxStart]+" ");
    }
}