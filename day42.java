package days.of.coding;

public class day42 {
    public static void main(String[] args) {
        int angka = 3;
        long hasilFaktorial = hitungFaktorial(angka);

        System.out.println("Faktorial dari " + angka + " adalah: " + hasilFaktorial);
    }

    public static long hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * hitungFaktorial(n - 1);
        }
    }
}
