package days.of.coding;

import java.util.LinkedList;

public class day77 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();//membuat objek linkedlist 

        linkedList.add("Rambutan");//menambahkan elemen nama buah ke dalam linkedlist
        linkedList.add("Durian");
        linkedList.add("Langsat");
        linkedList.add("Mangga");

        System.out.println("Elemen-elemen awal: " + linkedList);//mencetak nilai-nilai linkedlist sebelum perubahan

        linkedList.remove("Langsat");//perintah untuk menghapus elemen langsat
        System.out.println("Setelah menghapus langsat : " + linkedList);//mencetak setelah menghapus langsat 

        linkedList.removeFirst();//perintah untuk menghapus elemen pertama pada linkedlist
        System.out.println("Setelah mengahpus elemen pertama: " + linkedList);//mencetak perubahan setelah menghapus elemen pertama

        linkedList.removeLast();//perintah untuk menghapus elemen akhir dalam linkedlist
        System.out.println("Setelah menghapus elemen akhir: " + linkedList);//mencetak perubahan setelah elemen di hapus
    }
}