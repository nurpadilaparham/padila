package days.of.coding;

public class day68 {
    public static void main(String[] args) {
        // Mendeklarasikan dan menginisialisasi array string untuk menyimpan daftar mahasiswa yang didalamnya ada 3 elemen
        String[] dftrMahasiswa = {"Tasya", "Padila", "Sila"};

        // Mendeklarasikan dan menginisialisasi array string untuk menyimpan daftar kelas elemennya juga ada 3
        String[] dftrKelas = {"Inf-A", "Inf-B", "Inf-C"};

        // Mencetak informasi siswa
        System.out.println("Informasi Mahasiswa:");
        for (int i = 0; i < dftrMahasiswa.length; i++) {// selama i kurang dari panjang elemen di dalam dftrMahasiswa maka
            System.out.println("Nama Mahasiswa : " + dftrMahasiswa[i] + ", Kelas : " + dftrKelas[i]);//akan mencetak nama mahasiswa dan kelasnya
        }
    }
}
