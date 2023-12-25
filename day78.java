package days.of.coding;

import java.util.LinkedList;

public class day78 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();// membuat objek linkedlist

        linkedList.add("Informatika A");//menambahkan elemen kedalam linkedlist
        linkedList.add("Informatika B");
        linkedList.add("Informatika C");
        
        int ukuran = linkedList.size();//menghitung berapa banyak ukuran atau elemen dalam linkedlist
        System.out.println("Ukuran Linkedlist : " + ukuran);//mencetak  ukuran linkedlist
    }
}
