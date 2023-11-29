package days.of.coding;

public class day52 {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 30;

        int max = (num1 > num2) ? num1 : num2;  //Jika num1 lebih besar dari num2, max diisi dengan num1, jika tidak, diisi dengan num2.
        System.out.println("Angka maksimum antara " + num1 + " dan " + num2 + " adalah " + max);

        operator ternary dengan tipe data string
        int score = 75;
        String status = (score >= 60) ? "Lulus" : "Tidak Lulus"; //Jika score lebih besar atau sama dengan 60, status diisi "Lulus", jika tidak, diisi "Tidak Lulus".
        System.out.println("Status: " + status);
    }
}
