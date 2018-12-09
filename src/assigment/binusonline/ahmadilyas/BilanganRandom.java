package assigment.binusonline.ahmadilyas;

import java.util.Scanner;

public class BilanganRandom {
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

        System.out.printf("Hasil Random Bilangan Genap: " + String.valueOf( acakBilanganGenap(masukan[0],masukan[1]) ) + "\n");
    }


    private static int acakBilanganGenap(int A, int B){
        int upper = 0;
        int lower = 0;

        if (A>B) {
            upper = A;
            lower = B;
        }else {
            upper = B;
            lower = A;
        }

        int r = (int) (Math.random() * (upper - lower)) + lower;
        if (r % 2 == 1 ){
            r++;
        }

        return r;
    }
}
