package days.of.coding;
// disini saya menggunakan contoh tipe data primitif integer dan boolean saja

public class day3 {
    public static void main(String[] args) {
        // Konversi String ke Tipe Data Primitif
        String strInt = "031";
        int integer = Integer.parseInt(strInt); // Mengkonversi String menjadi tipe data int
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Konversi String ke tipe data primitif(integer dan boolean)");
        System.out.println("String \"" + strInt + "\" dikonversi ke int: " + integer);

        String strDouble = "2.29";
        double decimal = Double.parseDouble(strDouble); // Mengkonversi String menjadi tipe data double
        System.out.println("String \"" + strDouble + "\" dikonversi ke double: " + decimal);

        // Konversi Tipe Data Primitif ke String
        int myInt = 20;
        String intStr = Integer.toString(myInt); // Mengkonversi tipe data int menjadi String
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Konversi tipe data primitif(integer dan boolean) ke string");
        System.out.println("int " + myInt + " dikonversi ke String: " + intStr);

        double myDouble = 2.71828;
        String doubleStr = Double.toString(myDouble); // Mengkonversi tipe data double menjadi String
        System.out.println("double " + myDouble + " dikonversi ke String: " + doubleStr);
    }
}

