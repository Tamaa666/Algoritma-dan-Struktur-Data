
package bruteforce;

/**
 * Arjuna Pratama Putra
 * 1941720155
 * TI-1F
 */

public class MainSemangat { 
   private static void match(char[] teks, char[] pola) 
   
   {
       
     int j;
     int cek = 0;
     for (int i = 0; i <= teks.length - pola.length; i++) 
     
     {
         
        j = 0;
        while (j < pola.length && teks[i + j] == pola[j])
        
        {
            
           j++;
        
        }
        
        if (j >= pola.length) 
        
        {
            
           cek++;
           
        }}
     
     if (cek > 0) 
     
     {
         
        System.out.println(" DATA COCOK ");
     
     } 
     
     else 
     
     {
         
        System.out.println(" DATA TIDAK COCOK ");
     
     }}
   
   public static void main(String[] args) {
      char[] x = {'N' , 'G', 'A'};
      char[] y = {'S', 'E', 'M', 'A', 'N', 'G', 'A', 'T'};
      match(y, x);
   }}

