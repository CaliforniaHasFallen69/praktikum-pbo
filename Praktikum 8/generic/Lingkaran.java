/**
* File		    : Lingkaran.java 23-05-2023
* Nama / NIM	: Zaeri Haikal Rabbani / 24060121140159
* Deskripsi     : implementasi Lingkaran sebagai BangunDatar
**/

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
    
}
