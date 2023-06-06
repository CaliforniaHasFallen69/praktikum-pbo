/**
 * LambdaHashmap.java 05/06/2023
 * Nama         : Zaeri Haikal Rabbani
 * NIM          : 24060121140159
 * Deskripsi    : program yang menggunakan Generic untuk pasangan Key-Value
 */

import java.util.*;

public class LambdaHashmap {
    public static void main(String[] args){
        Map<Long, String> map = new HashMap<Long, String>();
        map.put(24060121140159L, "Zaeri Haikal Rabbani");
        map.put(24060121120020L, "Tim Henson");
        map.put(24060121130030L, "Slash");

        //Implementasi Ekspresi Lambda
        map.forEach((i, j) -> {
            System.out.print(i + " " + map.get(i));
            System.out.println(" ");}
        );
    }
}