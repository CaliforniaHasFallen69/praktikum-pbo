/* Nama File    : Bus.java
 * Nama         : Zaeri Haikal Rabbani
 * NIM          : 24060121140159
 * Deskripsi    : Subclass Manajer dari Pegawai
 * Tanggal      : 04 Mei 2023
 */

class Manajer extends Pegawai{
	private int tunjangan = 700000;
	
	public Manajer(String nama) {
		this.setNama(nama);
	}
	
	public void tampilData() {
		super.tampilData();
		System.out.printf("Tunjangan : %d \n", this.tunjangan);
	}
}