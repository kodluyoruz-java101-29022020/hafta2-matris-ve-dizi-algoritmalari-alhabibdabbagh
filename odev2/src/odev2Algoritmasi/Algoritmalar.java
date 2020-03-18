package odev2Algoritmasi;

import java.util.Scanner;

public class Algoritmalar {

public static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("Hangi soru İstiyorsunuz?\nçıkmak için 5 ");
		int soru=s.nextInt();// hangi sorusu kullanciden belirleniyor
		while(soru!=5) {
			switch (soru) {
			case 1:
		    System.out.println("---------Soru1-----------");
			CanliHucreMatrisi s1 =new CanliHucreMatrisi();
			s1.basla();//nesne ureterek 
			System.out.println("\nHangi soru İstiyorsunuz\nçıkmak için 5 ");
	         soru=s.nextInt();// tekrek sorduk whileden cikmak isterse
	         break;
			case 2:
			System.out.println("---------Soru2-----------");
			SpiralSoru2 spiral =new SpiralSoru2();
			spiral.donguyap();
			System.out.println("\nHangi soru İstiyorsunuz\nçıkmak için 5 ");
	         soru=s.nextInt();
	         break;
			case 3:
			System.out.println("---------Soru3-----------");
			MatrisCarpimi matris=new MatrisCarpimi();
		    matris.matrisCarpimi();
		    System.out.println("\nHangi soru İstiyorsunuz\nçıkmak için 5 ");
	        soru=s.nextInt();
	         break;
			case 4:
			System.out.println("---------Soru4-----------");
			DiziTekrarElemanlariSayisi mukerreBul=new DiziTekrarElemanlariSayisi();
			mukerreBul.program();
			System.out.println("\nHangi soru İstiyorsunuz\nçıkmak için 5 ");
	        soru=s.nextInt();
	         break;
	         }
			
		}
		System.out.println("çıktınız");
	}

}
