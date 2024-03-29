/**
 * File : AngkaSial.java
 * Nama : Zaeri Haikal Rabbani
 * NIM  : 24060121140159
 * Deskripsi : Program penggunaan exception buatan sendiri
 *             Pengenalan klausa 'throw' dan 'throws'
 */ 
public class AngkaSial{
	
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13) {
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial"); // jika eksepsi terjadi line kode ini tdk dieksekusi
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){  // jika eksepsi terjadi line kode ini dieksekusi
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage()); 
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
 }
