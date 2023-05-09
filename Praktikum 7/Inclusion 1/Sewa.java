/* Nama File    : Bus.java
 * Nama         : Zaeri Haikal Rabbani
 * NIM          : 24060121140159
 * Deskripsi    : Main inclusion 
 * Tanggal      : 04 Mei 2023
 */

public class Sewa {
	public static void main(String[] args) {
		Vehicle kendaraan = new Vehicle();
		Vehicle mobil = new Car();
		Vehicle bis = new Bus();
		kendaraan.calRent(50, 1000);
		mobil.calRent(50, 1000);
		bis.calRent(50, 1000);
	}
}
