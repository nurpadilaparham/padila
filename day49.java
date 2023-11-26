package days.of.coding;

public class day49 {
    public static void main(String[] args) {
        String[] menu = {"jepa", "kopi", "tuing-tuing", "teh", "cumi"};
        int index = 1;
        for (String makanan : menu) {
            System.out.println("menu" + index++ + ": " + makanan);
        }
    }
}
