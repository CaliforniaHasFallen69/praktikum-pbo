/* Nama File    : PolimorfismeCoercion.java
 * Nama         : Zaeri Haikal Rabbani
 * NIM          : 24060121140159
 * Deskripsi    : Program penggunaan polimorfisme coercion 
 * Tanggal      : 04 Mei 2023
 */
public class PolimorfismeCoercion {

    public static int kuadrat(int bilangan) {
        return bilangan*bilangan;
    }
    public static void main(String[] args) {
        //deklarasi objek integer
        Integer bilangan = 10;
        //objek integer 'dipaksa' untuk diubah
        //meniadi primitif
        int hasilKuadrat = kuadrat (bilangan);
    
        System.out.printf("Hasil kuadrat %d adalah %d",
            bilangan, 
            hasilKuadrat);
    }
}