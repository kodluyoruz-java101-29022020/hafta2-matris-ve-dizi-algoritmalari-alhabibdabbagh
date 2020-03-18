package odev2Algoritmasi;

import java.util.Scanner;


public class SpiralSoru2
{
	public static Scanner s=new Scanner(System.in);
	private   int [][] x = {{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9}};// elde yazdim
public void donguyap() {
	//kullanciDoldursun(); // burda kullanciden de isteyabiliriz
		basla();
		}
public void basla() {
	 inputuYazdir();// yazdirmak icin 
     sifirSatirSifirdikey();
     birSatirDortDikey();
	 dortDikeySifirSatir();
	 dortSatirSifirDokey();
	 birSatirBirDikey(); 
	 birSatirUcDikey();
	 ucSatirUcDikey();

		
	
}
public void inputuYazdir() {
	System.out.println("girdiginz input ");
	for (int i = 0; i < x.length; i++) {
		for (int j = 0; j < x.length; j++) {// ic ice dongu 
			System.out.print(x[i][j]+"   ");
			if (i==0 ) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}

public void sifirSatirSifirdikey() {
	for (int i = 0; i < x.length; i++) {//sifirSatirSifirdikey 
		System.out.print(x [0][i]+" ");
	}
}
public void birSatirDortDikey() {
	for (int i = 1; i < x.length; i++) {//birSatirDortDikey
		System.out.print(x [i][4]+" ");
		}
}
public void dortDikeySifirSatir() {
	for (int i = 3; i >= 0; i--) {//ters dortDikeySifirSatir
		System.out.print(x [4][i]+" ");
	}
}
public void dortSatirSifirDokey() {
	for (int i = 3; i > 0; i--) { //ters dortSatirSifirDokey
	System.out.print(x [i][0]+" ");
}
}
public void birSatirBirDikey() {
	for (int i = 1; i < x.length-1; i++) {// birSatirBirDikey
		System.out.print(x [1][i]+" ");
	}
}
public void birSatirUcDikey() {
	for (int i = 2; i < x.length-1; i++) {// birSatirUcDikey
	System.out.print(x [i][3]+" ");
}
}
public void ucSatirUcDikey() {
	for (int i = 2; i > 0; i--) {//ters ucSatirUcDikey
		System.out.print(x [3][i]+" ");
	}
	 System.out.print(x[2][1]+" ");	
	 System.out.print(x[2][2]);
}

public void kullanciDoldursun() {
	
	for (int i = 0; i < x.length; i++) {
		x [0][i]=s.nextInt();
	}
	for (int i = 1; i < x.length; i++) {
		x[i][4]=s.nextInt();
	}
	for (int i = 3; i >= 0; i--) {//ters
		x[4][i]=s.nextInt();
	}
	for (int i = 3; i > 0; i--) { //ters
		x[i][0]=s.nextInt();
	}
	for (int i = 1; i < x.length-1; i++) {
		x[1][i]=s.nextInt();
	}
	for (int i = 2; i < x.length-1; i++) {
		x[i][3]=s.nextInt();
	}
	for (int i = 2; i > 0; i--) {//ters
		x[3][i]=s.nextInt();
	}
	for (int i = 2; i >1; i--) {
		x[i][1]=s.nextInt();//x[2][1]
	}
	for (int i = 2; i >1; i--) {
		x[i][i]=s.nextInt();//x[2][2]
	}
}

}


