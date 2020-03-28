/*
	Nama	: Paramadina Mulya Majid
	Stambuk : 13020180006
	Tanggal : 25 Maret 2020
	Waktu	: 15.00 WITA
*/

import java.util.Scanner;

public class Inputbiodata{
	public static void main (String[] args)
	{
		String stb,nama,jurusan,fakultas;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan NIM anda : ");
		stb= input.nextLine();
		System.out.print("Masukkan Nama anda : ");
		nama= input.nextLine();
		System.out.print("Masukkan Jurusan anda : ");
		jurusan= input.nextLine();
		System.out.print("Masukkan Fakultas anda : ");
		fakultas= input.nextLine();
		
		
		System.out.println("\nStambuk : " + stb);
		System.out.println("Nama : " + nama);
		System.out.println("Jurusan : " + jurusan);
		System.out.println("Fakultas : " + fakultas);
	
	}
}