package Tugas;
import java.util.Scanner;

/**
 * Arjuna Pratama P
 * TI/1F
 * 1941720155
 */

public class Nomer6 {
    
    public double rata2[];
    public double nilai;
    public String namaMhs[];
    public int jml;

    public Nomer6(int jml) 
    {
        
        this.namaMhs = new String[jml];
        this.nilai= 0;
        this.rata2 = new double [jml];
        this.jml=jml;
    
    }
    
    
    double rataDC(double nile[], int x, int y)
    {
        
        if(x==y){
            return nile[1];
        }
        else if(x<y)
        {
            int nil = (x + y)/2;
            
            double nilaix =rataDC(nile, x, nil-1);
            
            double nilaiy = rataDC(nile, nil+1, y);
            
            return nilaiy+nilaix + nile[nil];
        }
        
        return 0;
    }
    
    public static void main(String[] args) 
    {
        Scanner num = new Scanner(System.in);
        Scanner abjad = new Scanner(System.in);
        
        System.out.println("+----- PERHITUNGAN RATA-RATA DC -----+");
        System.out.print("Input jumlah mahasiswa : ");
        int f = num.nextInt();
        
        Nomer6 arr = new Nomer6(f);
        System.out.println();
        
        for(int a = 0; a < f ; a++)
        {
            System.out.print("Input nama mahasiswa " + (a+1) + " : ");
            arr.namaMhs[a]= abjad.nextLine();
           
            System.out.print("Masukkan nilai : ");
            arr.rata2[a] = num.nextInt();
            
            System.out.println();
        
        }
        
        for(int i=0; i<arr.jml;i++)
        {
            System.out.println("nilai " + arr.namaMhs[i]+" : "+ arr.rata2[i]);
        
        }
        System.out.println();
        
        System.out.println("rata-rata nilai mahasiswa : "+ String.format
        ("%.2f", arr.rataDC(arr.rata2, 0, arr.jml)));
    }}
