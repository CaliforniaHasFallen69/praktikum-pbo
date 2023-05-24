/**
* File		    : ArrayListTest.java 23-05-2023
* Nama / NIM	: Zaeri Haikal Rabbani / 24060121140159
* Deskripsi     : program penggunaan objek ArrayList sebagai Collection class
**/

import java.util.ArrayList;
public class ArrayListTest{
    public static void main (String[] args) {
        //inisialisasi ArrayList yang hanya dapat 
        //berisi objek String
        ArrayList<String> strings = new ArrayList<String> () ;
        //menambah elemen
        strings.add("praktikum"); 
        strings.add("collection");
        strings.add ("dan generics");
        //menghapus elemen
        strings.remove ("praktikum");
        //iterasi pada keseluruhan Arraylist 
        for (String s : strings){
        System.out.print(s+" ");
        }
    }

}