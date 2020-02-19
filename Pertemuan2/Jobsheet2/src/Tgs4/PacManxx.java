/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tgs4;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class PacManxx {
static Scanner hotkey = new Scanner(System.in);
		
	public static void pengaturan(){
                System.out.println("+------------+");
		System.out.println("  PacMan v2.0 ");
                System.out.println("+------------+");
		System.out.println("w = Move Up");
		System.out.println("s = Move Down");
		System.out.println("a = Move Left");
		System.out.println("d = Move Right");
		
	}


	public static void over(){
		System.out.println("\n\nKoordinat minimal harus 0 !!!\n\n");
		hotkey();
	}

		public static void peringatan(){
		System.out.println("\n\nMaaf! hotkey Anda Salah!! !!!\n\n");
		hotkey();
	}

	public static void hotkey(){
		PacMan pc = new PacMan();
		PacMan.width = 5;
		PacMan.height = 5;

		pengaturan();
		System.out.print("\nMasukkan wasd : ");
		PacMan.pilih = hotkey.nextLine() .toLowerCase();

		switch (PacMan.pilih) {
			case "w": 
			if ((PacMan.y-1) < 0) {
			over();
				}
			break;
                            
			case "s":
			if ((PacMan.y + 1) >= 
                            PacMan.width) {
			over();
			}
						
			break;
			case "a":	
			if ((PacMan.x-1)
                        < 0) {
			over();
				}
			break;
                            
			case "d":
			if ((PacMan.x + 1) >=
                        PacMan.height) {
			over();
				}						
			break;
                            
			default:
		}

		switch(PacMan.pilih)
               
                {
                    
			case "w" : PacMan.moveUp();
			break;
                            
			case "s" : PacMan.moveDown();
			break;
                            
			case "a" : PacMan.moveLeft();
			break;
                            
			case "d" : PacMan.moveRight();
			break;
                            
			default: peringatan();
		}

		PacMan.printPosition();
		System.out.println("Titik Koordinat adalah (" + PacMan.x + " ,"
                        + " " + PacMan.y + ")");
		hotkey();
	}

	public static void main(String[]args){
		hotkey();
	}
}