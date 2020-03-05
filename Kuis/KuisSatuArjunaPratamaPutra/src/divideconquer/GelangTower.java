
package divideconquer;

/**
 * Arjuna Pratama Putra
 * 1941720155
 * TI-1F
 */

public class GelangTower {
     static void towerOfHanoi(int numDisc, char source, char destination, char spare) 
    
     { 
         
        if (numDisc == 1)
            
        { 
            
            System.out.println("Pindah gelang 1 dari tower " +
                    source + " ke tower " + destination); 
            return; 
        
        }
        
        towerOfHanoi(numDisc-1, destination, source, spare); 
        
        System.out.println("Pindah " + numDisc + " gelang dari tower " +
                source + " ke tower " + destination);
        
        towerOfHanoi(numDisc-1, source, spare, destination); 
        
    } 
     
     public static void main(String[] args) 
    { 
        int n = 4; // jumlah gelang
        towerOfHanoi(n, 'A', 'C', 'B'); //A, B and C adalah nama tower
    }} 
