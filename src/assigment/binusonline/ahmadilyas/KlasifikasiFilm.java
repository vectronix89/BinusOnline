package assigment.binusonline.ahmadilyas;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Scanner;

public class KlasifikasiFilm {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda = ");
        String nama = scan.next();

        System.out.print("\nMasukkan Tahun Lahir Anda = ");
        int tahun = scan.nextInt();
        scan.close();

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int umur = getUmur(tahun,year);
        ArrayList<String> kategori = cariKategori(umur);

        String joined = String.join(", ", kategori);
        if (kategori.size() == 0)
            System.out.println("\n" + nama + ", Anda berusia " + umur + " tahun, maaf Anda belum lahir");
        else if (kategori.size() == 1){
            System.out.println("\n" + nama + ", Anda berusia " + umur + " tahun, dapat menonton film dengan klasifikasi " + joined);
        }else {
            StringBuilder b = new StringBuilder(joined);
            b.replace(joined.lastIndexOf(","), joined.lastIndexOf(",") + 1, " dan" );
            joined = b.toString();

            System.out.println("\n" + nama + ", Anda berusia " + umur + " tahun, dapat menonton film dengan klasifikasi " + joined);
        }

    }

    private static int getUmur(int first, int last) {
        return last - first;
    }

    private static ArrayList<String> cariKategori(int umur) {
        int arr[] = {0,13,17,21};
        String group[] = {"SU","13+","17+","21+"};
        ArrayList<String> kategori = new ArrayList<String>();
        int count = 0;
        while (count < 4) {
            if (umur >= arr[count]){
                kategori.add(group[count]);
            }
            count++;
        }

        return kategori;
    }
}
