package uas.algo2;

public class No1_Tumpukan {
     public static void main (String [] args) {
        Tumpukan tumpukan = new Tumpukan(10);
        tumpukan.push(10);
        tumpukan.baca();
        tumpukan.push(30);
        tumpukan.baca();
        tumpukan.peek();
        System.out.println("nilai1 teratas = " +tumpukan.peek());
        System.out.println("Nama Saya adalah Fika Nur Hasari");
        System.out.println("");
        tumpukan.pop();
        System.out.println("nilai yang dihapus = " +tumpukan.pop());
        System.out.println("");
        tumpukan.push(10);
        tumpukan.baca();
        tumpukan.push(40);
        tumpukan.baca();
        tumpukan.push(50);
        tumpukan.baca();
    }
}
