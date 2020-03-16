/* 
	Nama    : Paramadina Mulya Majid
	Tanggal : 14 Maret 2020
	Waktu   : 18.47 WITA
*/

public class KonversiDetik{
	public static void main(String[] args){
		int second = 188, minute, hour, secondsleft1, secondsleft2;
		
		hour = second/3600;
		secondsleft1 = second%3600;
		
		minute = (int) secondsleft1/60;
		secondsleft2 = secondsleft1%60;
		
		System.out.println("Conversion Result = " + second + " Second ");
		System.out.println(+ hour + " Hour : " + minute + " Minute : " + secondsleft2 + " Second");
	}
}