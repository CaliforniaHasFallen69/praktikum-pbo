/**
* File		    : MapTest.java 23-05-2023
* Nama / NIM	: Zaeri Haikal Rabbani / 24060121140159
* Deskripsi     : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
**/

import java.util.*;

public class MapTest {
    public static void main (String[] args){
        //kunci-> integer, nilai-> string
        Map<Integer, String> map = new HashMap<Integer,String>() ;
        //menempatkan elemen kunci dan nilai
        map.put (1,"satu");
        map.put (2,"dua");
        //mengambil elemen pertama
        System.out.println (map.get (1)) ;
        //mengambil keseluruhan kunci sebagai objek collection set
        Set<Integer> key = map. keySet () ;
        //bagaimana iterasi untuk mengambil keseluruhan
        // nilai dari kunci ? tulis pada laporan anda!
        // petunjuk : qunakan iterasi seperti program ArrayListTest
        for (Integer i: key) {
            System.out.println(map.get(i));
        }
    }
}