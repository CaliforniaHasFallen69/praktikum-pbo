/* Nama File    : Car.java
 * Nama         : Zaeri Haikal Rabbani
 * NIM          : 24060121140159
 * Deskripsi    : Subclass Car dari Vehicle 
 * Tanggal      : 04 Mei 2023
 */

public class Car extends Vehicle{
	void calRent(int jarak, float harga){ 
		float fare=jarak*harga;
		fare=fare-100.00f;
		System.out.println("harga sewa mobil = "+fare);
	}
}

