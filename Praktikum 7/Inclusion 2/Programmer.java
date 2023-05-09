/* Nama File    : Bus.java
 * Nama         : Zaeri Haikal Rabbani
 * NIM          : 24060121140159
 * Deskripsi    : Subclass Programmer dari Pegawai
 * Tanggal      : 04 Mei 2023
 */

class Programmer extends Pegawai{
	private int bonus = 450000;
	
	public Programmer(String nama) {
		this.setNama(nama);
	}
	
	public void tampilData() {
		super.tampilData();
		System.out.printf("Bonus : %d \n", this.bonus);
	}
}