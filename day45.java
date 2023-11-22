package days.of.coding;

import java.util.ArrayList;

public class day45 {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();

        daftarNama.add("Padila");
        daftarNama.add("Caca");
        daftarNama.add("Sila");
        daftarNama.add("cicci");

        System.out.println("Elemen-elemen dalam ArrayList: " + daftarNama);
        
        daftarNama.set(3, "Kaco");
        System.out.println("Elemen ArrayList setelah perubahan: " + daftarNama);

    }
}
