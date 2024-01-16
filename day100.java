package days.of.coding;

public class day100 {
    public static void main(String[] args) {
        //StringBuffer, menghapus index menggunakan metode deleteCharAt()
        StringBuffer jurusan = new StringBuffer("INFORMATIKA");
        System.out.println("Jurusan Sebelum menggunakan deleteCharAt(): " + jurusan);

        jurusan.deleteCharAt(5);//menghapus elemen indeks 5 menggunakan deletecharAt()
        System.out.println("Jurusan Setelah menggunakan deleteCharAt(): " + jurusan);
    }
}