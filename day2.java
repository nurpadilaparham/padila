package days.of.coding;
//Tipe data primitif memiliki nilai yang langsung dapat digunakan, 
//sedangkan tipe data non-primitif adalah objek yang memiliki metode tambahan untuk berinteraksi dengannya.

public class day2 {
    public static void main(String[] args) {
        // Tipe data primitif
        int umur = 20; // Ini adalah tipe data primitif untuk angka bulat
        char golonganDarah = 'A'; // Ini adalah tipe data primitif untuk karakter
        boolean  menikah = true; // Ini adalah tipe data primitif untuk nilai boolean false dan true
        double beratBadan = 58.6; // ini adalah tipe data double untuk bilangan pecahan
        
        // Menampilkan nilai dari tipe data primitif
        System.out.println("Tipe Data Primitif:");
        System.out.println("Umur                : " + umur);
        System.out.println("Golongan darah      : " + golonganDarah);
        System.out.println("Status pernikahan   : " + menikah);
        System.out.println("Berat badan         : " + beratBadan);
        System.out.println("-------------------------------------------------------------------------------");
        
        // Tipe data non-primitif (objek)
        //tipe data seperti Integer, Character, Boolean dan Double ini biasa disebut sebagai wrapper class, 
        //disebut sebagai wrapper class karna mereka mengemas atau membungkus tipe data primitif menjadi objek
        Integer umurr = new Integer(20); // Ini adalah objek umurr untuk tipe data int
        Character golongan = new Character('A'); // Ini adalah objek golongan untuk tipe data char
        Boolean status = new Boolean(false); // Ini adalah objek status untuk tipe data boolean
        Double bb = new Double(58.6); // ini adalah objek bb atau berat badan untuk tipe data double 
                
        
        // Menampilkan nilai dari tipe data non-primitif
        System.out.println("\nTipe Data Non-Primitif (Objek):");
        System.out.println("Umur            : " + umurr);
        System.out.println("Golongan Darah  : " + golongan);
        System.out.println("Status          : " + status);
        System.out.println("Berat badan     : " + bb);
    }
}

