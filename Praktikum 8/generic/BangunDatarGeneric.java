/**
* File		    : BangunDatarGeneric.java 23-05-2023
* Nama / NIM	: Zaeri Haikal Rabbani / 24060121140159
* Deskripsi     : kelas konstruksi generic untuk BangunDatar
**/

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
