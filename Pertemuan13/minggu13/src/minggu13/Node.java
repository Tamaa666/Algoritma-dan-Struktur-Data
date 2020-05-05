/**
 * Arjuna Pratama P
 * TI/1F
 * 1941720155
 */
package minggu13;
public class Node {
    int data;
    Node prev, next;
    
    Node (Node prev, int data, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}