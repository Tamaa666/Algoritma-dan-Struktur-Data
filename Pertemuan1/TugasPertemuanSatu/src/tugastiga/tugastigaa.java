/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugastiga;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class tugastigaa {
      public static void main(String[] args) {
      int PanjangKata, JmlHuruf = 1;
      String kata;
      
       Scanner scan = new Scanner(System.in);
       System.out.println("Ketikkan kalimat : ");
         
       kata = scan.nextLine();
       
        char [] arrHuruf = kata.toCharArray();
        PanjangKata = arrHuruf.length;
         
        for(int i = 0; i < PanjangKata; i++) {
             
             for(int j=0; j < PanjangKata; j++){
             if(arrHuruf[i]!=' '){
                 
              if(i!=j&&(arrHuruf[i]==arrHuruf[j])){
                JmlHuruf++;
                arrHuruf[j]=' ';
                     }
                  if(j==PanjangKata-1){
                    
                    System.out.println("Jumlah huruf  '"+arrHuruf[i]+"' = "+JmlHuruf);
                    JmlHuruf=1;
                         
          }
          }
          }
      }  
      }
}
