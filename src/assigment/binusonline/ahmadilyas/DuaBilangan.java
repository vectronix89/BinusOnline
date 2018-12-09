package assigment.binusonline.ahmadilyas;

import java.util.Scanner;

public class DuaBilangan {
    public static void main(String[] args) {
        int count, temp;
        Scanner scan = new Scanner(System.in);
        int masukan[] = new int[2];
        String[] judul = {"Bilangan Pertama","Bilangan Kedua"};

        for (int i = 0; i < 2; i++)
        {
            System.out.println("Tulis "+judul[i]+":");
            masukan[i] = scan.nextInt();
        }
        scan.close();

        System.out.printf("Nilai Terbesar: " + String.valueOf( hitungNilaiTerbesar(masukan[0],masukan[1]) ) + "\n");
        System.out.printf("Nilai Terkecil: " + String.valueOf( hitungNilaiTerkecil(masukan[0],masukan[1]) ) + "\n");
        System.out.printf("Nilai Pangkat: " + String.valueOf( hitungNilaiPangkat(new Double(masukan[0]),new Double(masukan[1])) ) + "\n");
        System.out.printf("Nilai Kuadrat Bilangan " + masukan[0] +" : " + String.valueOf( hitungNilaiKuadrat(masukan[0]) ) + "\n");
        System.out.printf("Nilai Kuadrat Bilangan " + masukan[1] +" : " + String.valueOf( hitungNilaiKuadrat(masukan[1]) ) );
    }

    private static int hitungNilaiTerbesar(int A, int B){
        if (A > B) return A;
        else return B;
    }
    private static int hitungNilaiTerkecil(int A, int B){
        if (A < B) return A;
        else return B;
    }
    private static int hitungNilaiPangkat(Double A, Double B){
        return (int) Math.pow(A,B);
    }
    private static int hitungNilaiKuadrat(int A){
        return (int) Math.sqrt(A);
    }
}
