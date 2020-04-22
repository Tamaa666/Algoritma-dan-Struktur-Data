
package minggu11;
/**
 * Arjuna Pratama Putra
 * 1941720155
 * TI-1F
 */
public class Node<T> {

    T data;
    Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}