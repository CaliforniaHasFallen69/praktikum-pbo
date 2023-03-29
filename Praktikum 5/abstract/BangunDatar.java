/*
 * Nama File    : BangunDatar.java
 * Nama Pembuat : Zaeri Haikal Rabbani
 * NIM          : 24060121140159
 * Deskripsi    : File abstract class bangun datar
 * Tanggal      : 27 Maret 2023
 */

 public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l) {
        luas = l;
    }

    public double getLuas() {
        return luas;
    }
}