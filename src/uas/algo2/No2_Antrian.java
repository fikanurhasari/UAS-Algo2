package uas.algo2;

public class No2_Antrian {
    public static void main (String[] args) {
        Antrian antrian = new Antrian(10);
        antrian.enqueue(50);
        antrian.display();
        antrian.enqueue(60);
        antrian.display();
        antrian.peek();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        System.out.println("Nama Saya adalah Fika Nur Hasari");
        antrian.enqueue(70);
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        antrian.display();
        antrian.peek();
        System.out.println("nilai yang paling depan = " + antrian.peek());
    }
}
