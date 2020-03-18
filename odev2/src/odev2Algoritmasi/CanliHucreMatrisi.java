package odev2Algoritmasi;

public class CanliHucreMatrisi {
	//int[][] habib= {{0,1,1},{0,0,1},{0,1,0},{1,1,1}};
	public void basla() {// program burdan basliyor
		matrisUret(); // matrisi rasgele olarak dolduralacak
		yazdir(input);
		yazdir(MatrisKuralaUygun(input));
	}
	
	private int [][] input=new int [4][3];
	public void  matrisUret() {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[0].length; j++) {
				input[i][j]=(int) (Math.random()+0.4);// 0.4 ekleme sepebi canli  cikma olasi artsin
			}
		}
	}
	public void yazdir(int [][] yazdirma) { // matris aliyor 
		for (int i = 0; i < yazdirma.length; i++) {
			for (int j = 0; j < yazdirma[0].length; j++) {// yazdirmak icin ic ice matris
				System.out.print(yazdirma[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("--------------------");
	}
	
	
	public int[][] MatrisKuralaUygun(int [][] girdi){ //  matris integer cinsinden donduruyor ve matris parametre da aliyor    
		int Kontrol=0; // cali hucreler kontrol etmek icin 
		int [][] output =new int[girdi.length][girdi[0].length]; // [row][colum]
		for (int i = 0; i < girdi.length; i++) {
			for (int j = 0; j < girdi[0].length; j++) {
				for (int k =1 ; k < output[0].length-1; k++) {// bu dongu tek seferlik calisir bir eklemek veya cikarmak icin  
					if(j<3 && i==0) {// burda 0'inci satir icin // [0][0] saginda ve altiginda bakildi 
						if(j!=2) {// hepsi Kontrola toplaniyor
					Kontrol+=  girdi[i][j+k];}// [0][1] saginda ve solunda ve altinda hucrelere bakildi
					Kontrol+= girdi[i+k][j];// 
				if(j!=0) {          // [0][2]  sol ve alt hucrelere
					Kontrol +=girdi[i][j-k];
				}
					}
					else if (i==1 &&j==0) {// birinci satir sifirinci dikey
						Kontrol+=  girdi[i][j+k];
						Kontrol+= girdi[i+k][j];  //[1][0] ust ve alt ve sag hucrelere bakildi 
						Kontrol+= girdi[i-k][j];
					} 
					else if ((i==1 || i==2) && (j==2 ||j==1)) {
						Kontrol+=  girdi[i][j-k];
						Kontrol+= girdi[i+k][j];// [1][1] hem ust ve alt ve sag ve sol hucrelere bakildi 
						if(j!=2) {
						Kontrol+= girdi[i][j+k];}
						Kontrol+= girdi[i-k][j];
						
					}
					else if (i==3 && (j<3)) {// 2'inci satir icin 
						if(j!=0) {
						Kontrol+=  girdi[i][j-k];}//[2][1] hem ust ve sag ve sol hucrelere bakildi 
						Kontrol+= girdi[i-k][j];
						
						if(j!=2) {
						Kontrol+= girdi[i][j+k];}	
					}
				}
				
				if (girdi[i][j]==1 && Kontrol<2) { // canli ise ve kontrol 2 den az ise 
					output[i][j]=0;// sifir yazdir 
					Kontrol=0;// Kontrol sifirlamamiz cok onemli yoksa kontrol hem artar
				}
				else if(girdi[i][j]==1 && (Kontrol==2||Kontrol==3)) {  // canli ise ve kontrol 2 ve 3  ise 
					output[i][j]=1;
					Kontrol=0;// burda onemli
				}else if (girdi[i][j]==1 && Kontrol>3) { // canli ise ve kontrol 3 den cok ise 
					output[i][j]=0;
					Kontrol=0;
				}else if (girdi[i][j]==0 && Kontrol==3) { // canli ise ve kontrol 3   ise 
					output[i][j]=1;
					Kontrol=0;
				}else {
					output[i][j]=girdi[i][j];// eger yukardaki kosulari girilmedi ise aynisi yazdir 
				
					Kontrol=0;// ve  yine Kontrol sifir
				}
			
		}
		
	}
		return output;//dizi donduruyor

	}
	}
