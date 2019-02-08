package assigment.binusonline.ahmadilyas;

import java.util.Scanner;

public class KonversiBerat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah kilogram yang akan dikonversi = ");
        Double masukan = scan.nextDouble();
        scan.close();

        Double[] hasil = hitungKonversi(masukan);
        System.out.printf(masukan + " kg sama dengan = " + hasil[0].intValue() + " pon atau " + hasil[1].intValue() + " ons atau " + hasil[2].intValue() + " gram");
    }

    private static double konversiKilogramKePon(Double A) {
        return Math.round(A*2);
    }

    private static double konversiPonKeOns(Double A) {
        return Math.round(A*5);
    }

    private static double konversiOnsKeGram(Double A) {
        return Math.round(A*100);
    }

    private static Double[] hitungKonversi(Double A) {
        Double[] hasil = new Double[3];
        hasil[0] = konversiKilogramKePon(A);
        hasil[1] = konversiPonKeOns(hasil[0]);
        hasil[2] = konversiOnsKeGram(hasil[1]);
        return hasil;
    }

}
