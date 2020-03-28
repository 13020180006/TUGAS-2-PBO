/* 
	Nama    : Paramadina Mulya Majid
	Stambuk : 13020180006
	Tanggal : 25 Maret 2020
	Waktu   : 15.08 WITA
*/

import java.util.Scanner;
public class InputKonversiDetik{
	public static void main(String[] args){

		int second, minute, hour, minutesleft, secondsleft;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input Second : ");
		second= input.nextInt();

		hour = second/3600;
		minutesleft = second%3600;
		
		minute = (int) minutesleft/60;
		secondsleft = minutesleft%60;
		
		System.out.println("Conversion Result = " + second + " Second ");
		System.out.println(+ hour + " Hour : " + minute + " Minute : " + secondsleft + " Second");
	}
}