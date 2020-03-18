package odev2Algoritmasi;

public class MatrisCarpimi {
	int [][] resualt=new int[5][2];// Integer dizisi tanimladik sonucu icin 
	int [][]firstMatris=new int [5][3];
	int [][] secondMatris=new int [3][2];
	public void matrisCarpimi() {
		birinciMatrisDoldur();
		ikinciMatrisDoldur();
		ikiMatrisCarpimi();
		matrisleriYazdir(firstMatris);
		System.out.println(" -----");
		matrisleriYazdir(secondMatris);
		System.out.println("------");
		matrisleriYazdir(resualt);
	}	
	public void birinciMatrisDoldur() {
		for (int i = 0; i < firstMatris.length; i++) {
			for (int j = 0; j < firstMatris[0].length; j++) {
				firstMatris[i][j]=(int)(Math.random()*10);// Doldurma icin *10 yaptik 0 -10  arasinda olsun rasgele sayilar
			}// ayni zaman casting yaptin cunku double donduruyor 
		}
	}
	public void ikinciMatrisDoldur() {
		for (int i = 0; i < secondMatris.length; i++) {
			for (int j = 0; j < secondMatris[0].length; j++) {// ikinci matris doldurduk
				secondMatris[i][j]=(int)(Math.random()*10);
			}
		}
	}
	public void ikiMatrisCarpimi() {
		for (int i = 0; i < firstMatris.length; i++) {// birinci matris icin dongu 
			for (int j = 0; j < firstMatris[0].length; j++) {//ikinci matris icin dongu
				for (int k = 0; k < secondMatris[0].length; k++) { // resualt matrisi icin dongu
					resualt[i][k]+=firstMatris[i][j]* secondMatris[j][k];// for dongusu kullanmadan resualt dizisi yazdim sonra sadelestirerek ve birlestirerek ve for dongusu kullanarak  bu duruma gelebildik
				}
				
			}
			
		}
	}
	public void matrisleriYazdir(int [][] matrisYazdir1) {// parametre matris aliyor yazdirmak icin 
		for (int i = 0; i < matrisYazdir1.length; i++) {
			for (int j = 0; j < matrisYazdir1[0].length; j++) {
				System.out.print(matrisYazdir1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
