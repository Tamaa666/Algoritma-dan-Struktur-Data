package Tgs8;
import java.util.Scanner;

/**
 * Nama : Arjuna Putra Pratama 
 * Kelas : TI/1F 
 * NIM : 1941720155
 */

public class LuasModif{
public static void main(String[]args){
		Scanner jun = new Scanner(System.in);
                
		LuasMod ua = new LuasMod();
		ua.kontrol = 0;

		System.out.print("Jumlah Tanah : ");
		ua.jml = jun.nextInt();
		
		LuasMod[] tnh = new LuasMod[ua.jml];

		for (int x = 0; x < tnh.length ; x++) 
                {
                    
			tnh[x] = new LuasMod();

			System.out.print("Panjang Tanah ke-" 
                                + (x+1) + " : ");
			tnh[x].panjang = jun.nextInt();
                        
			System.out.print("Lebar Tanah ke-" 
                                + (x+1) + " : ");
			tnh[x].lebar = jun.nextInt();

		}

		System.out.println();

		for (int i = 0; i < tnh.length ; i++) 
                {
                    
			System.out.println("Luas Tanah ke-" + (i+1) + " : "
                        + ua.LuasTanah(tnh[i].panjang , tnh[i].lebar));
		
                }

		ua.maksim = ua.LuasTanah(tnh[0].panjang , tnh[0].lebar);

		
 		for (int i = 0; i < tnh.length ; i++) 
                
                        {
 			
                            if (ua.LuasTanah(tnh[i].panjang , 
                                tnh[i].lebar) > ua.maksim)
                            {
                                
 				ua.maksim = ua.LuasTanah
                                (tnh[i].panjang , tnh[i].lebar);
 				ua.kontrol = i;
 			}
                        
 		}

 		System.out.println("\nTanah yang terluas: Tanah " 
                        + (ua.kontrol+1));

        }}