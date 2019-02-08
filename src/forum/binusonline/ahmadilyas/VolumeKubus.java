package forum.binusonline.ahmadilyas;

import java.util.Scanner;

public class VolumeKubus {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Masukkan alas  = ");
        Double alas  = scan.nextDouble();
        scan.close();

        Double kubus  = Math.pow(alas,3);
        System.out.printf("Volume kubus  = " + kubus);
    }
}
