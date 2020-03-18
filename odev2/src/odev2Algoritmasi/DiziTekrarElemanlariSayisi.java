package odev2Algoritmasi;



public class DiziTekrarElemanlariSayisi {
private short [] arrya=new short[10];// short secme sepebi 0 - 10 arasi sagilar oldugu icin 
	public void program() {
	
	diziDoldur();
	diziYazdir();
	mukerreElamaniBul();
		
	}
	public void diziDoldur() {
		for (int i = 0; i < arrya.length; i++) {
		 arrya[i]= (short) (Math.random()*10);//rasgele ve casting 
		 // diziyi degerler yukledik
		}
	}
	public void diziYazdir() {
		for (int i = 0; i < arrya.length; i++) {
			System.out.print(arrya[i]+" ");// diziyi yazdirdik
		}
	}
	public void mukerreElamaniBul() {
		int count;
		String Sonuc;
		for (int i = 0; i < arrya.length; i++) {
			count=0;// ic ice for ile yaptik
			for (int j = i+1; j < arrya.length; j++) {// mantigi birinci eleman degir elemanlari ile karsilastir
				if(arrya[i]==arrya[j]) {// esitlik varsa count arttir 
				count++;
				}
			}
			if (count>0) {// count 
			 Sonuc= "\n "+arrya[i]+" sayisi : "+" bu kadar tekrar edilmis "+count;
			 System.out.println(Sonuc);
			}
		}
	}
}
