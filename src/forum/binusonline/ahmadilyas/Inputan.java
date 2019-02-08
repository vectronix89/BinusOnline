package forum.binusonline.ahmadilyas;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Inputan {
    public static void main(String[] args) {
        int count, temp;
        Scanner scan = new Scanner(System.in);
        String masukan[] = new String[4];
        String[] judul = {"Nama depan","Nama Belakang","NIM","Kelas"};

        for (int i = 0; i < 4; i++)
        {
            System.out.println("Tulis "+judul[i]+":");
            masukan[i] = scan.next();
        }
        scan.close();

        System.out.printf(masukan[0] + " " + masukan[1] + " (" + masukan[2] +") - " + masukan[3]);
    }
}
