
import java.util.logging.Logger;
import java.util.Scanner;
import java.util.logging.Level;
/**
 * Arjuna Pratama P
 * TI/1F
 * 1941720155
 */
public class MainPariwisata {

    public static void main(String[] args)
    {
        LinkedListPariwisata input = new LinkedListPariwisata();
        
        Scanner sc = new Scanner(System.in);

        try 
        {
            System.out.println("+------- INPUT DATA -------+: ");
            for (int i = 0; i < 12; i++) 
            {
                System.out.print((i + 1) + "  : ");
                double data1 = sc.nextDouble();
                
                System.out.print((i + 1) + "  : ");
                double data2 = sc.nextDouble();
                
                System.out.print((i + 1) + "  : ");
                double data3 = sc.nextDouble();
                
                System.out.println();
                input.add(data1, data2, data3);
            }
            System.out.println();
            System.out.println("\t Th. 2018 \t Th. 2019 \t Th. 2020");
            input.print();
            input.clear();
        } 
        
        catch (Exception e)  
        
        {
            
            System.out.println(e.getMessage());
        
        }}}
