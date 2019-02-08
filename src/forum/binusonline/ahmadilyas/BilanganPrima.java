package forum.binusonline.ahmadilyas;

import java.util.ArrayList;
import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> prima = new ArrayList<Integer>();
        int awal, akhir;
        int index = 0;
        while (index != 3){
            System.out.print ("\nMenu hari ini:\n"
                    + "1. Penjumlahan Bilangan Prima\n"
                    + "2. Jumlah Bilangan Prima\n"
                    + "3. Keluar\n"
                    + "Masukan Pilihan Anda: ");

            index  = scan.nextInt();

            switch (index){
                case 1:
                    System.out.print("Masukkan bilangan 1\t: "); awal = scan.nextInt();
                    System.out.print("Masukkan bilangan 2\t: "); akhir = scan.nextInt();
                    prima = bilanganPrima(awal,akhir);
                    int sum = prima.stream().mapToInt(value -> value).sum();
                    System.out.println("\nPenjumlahan Bilangan Prima = " + sum);
                    break;
                case 2:
                    System.out.print("Masukkan bilangan 1\t: "); awal = scan.nextInt();
                    System.out.print("Masukkan bilangan 2\t: "); akhir = scan.nextInt();
                    prima = bilanganPrima(awal,akhir);
                    System.out.println("\nJumlah Bilangan Prima = " + prima.size());
                    break;
                case 3:
                    System.out.println ("Terima Kasih");
                    break;

            }

        }
    }

    public static ArrayList<Integer> bilanganPrima(int A, int B) {
        int upper = 0;
        int lower = 0;
        if (A>B) {
            upper = A;
            lower = B;
        }else {
            upper = B;
            lower = A; }

        System.out.printf("Bilangan prima antara %d dan %d adalah \n", lower, upper);
        int i = lower;
        ArrayList<Integer> prima = new ArrayList<Integer>();
        while (i <= upper) {
            int tmp = 0;
            for (int bagi = 2; bagi < i; bagi++) {
                if (i%bagi==0) {
                    tmp=1;
                }
            }
            if (tmp != 1) {
                prima.add(i);
                System.out.print("\t" + String.valueOf(i));
            }
            i++;
        }
        return prima;
    }
}
