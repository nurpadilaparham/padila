package days.of.coding;

public class day36 {
    public static void main(String[] args) {
        int tinggi = 10; 

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); 
        }
    }
}