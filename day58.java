package days.of.coding;

public class day58 {
    // Fungsi rekursif untuk menghitung bilangan Fibonacci
    public static int fibonacci(int n) {
        if (n == 0) { //jika nilai dari variabel n sama dengan 0 maka = 0
            return 0; 
        } else if (n == 1) { //atau jika nilai dari variabel n sama dengan 1 maka = 1
            return 1;
        }
        else { // selain dari pada itu maka yang dieksekusi adalah 
            return fibonacci(n - 1) + fibonacci(n - 2); 
        }
    }

    public static void main(String[] args) {
        int n = 10; //n dengan nilai 10, yaitupanjang deret nilai fibonacci sampai 10 
        System.out.println("Deret Fibonacci untuk n = " + n + ":"); //mencetak nilai deret fibonacci
        for (int i = 0; i < n; i++) { //menggunakan perulangan for, dimana i sama dengan 0, 
            //selama nilai dari i kuraang dari atau lebih kecil dari nilai n maka perulangan akan terus berlanjut, 
            //contohnya n = 10 brrti yang muncul 0 1 1 2 3 dan angka selanjutnya adalah 5, mengapa 5? karena tiap bilangan ditambahkan dengan bilangan sebelumnya
            //2 + 3 = 5, maka nilai selanjutnya adalah 3 + 5 = 8
            System.out.print(fibonacci(i) + " "); //mencetak nilai fibonacci yang tiap bilangan dipisah dengan spasi
        }
    }
}
