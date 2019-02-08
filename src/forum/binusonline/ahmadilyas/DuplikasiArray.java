package forum.binusonline.ahmadilyas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DuplikasiArray {
    static Scanner scan  = new Scanner(System.in);
    static ArrayList<String[]> lstMataKuliah  = new ArrayList<String[]>();

    public static void main(String[] args) {
        menuProgram();

    }

    static void menuProgram(){
        int index = 0;
        while (index != 4){
            System.out.print ("\nPendataan dan Perhitungan IPS (Indeks Prestasi Semester):\n"
                    + "1. Pendataan Mata Kuliah\n"
                    + "2. Perhitungan IPS\n"
                    + "3. Update Grade\n"
                    + "4. Keluar\n"
                    + "Masukan Pilihan Anda: ");

            index  = scan.nextInt();

            switch (index){
                case 1:
                    pendataanMataKuliah();
                    break;
                case 2:
                    perhitunganIPS();
                    break;
                case 3:
                    updateGrade();
                    break;
                case 4:
                    System.out.println ("Terima Kasih");
                    break;

            }

        }
    }

    static void pendataanMataKuliah(){
        System.out.println ("\nMasukan Jumlah Mata Kuliah:");
        int iJumlahMk = scan.nextInt();

        lstMataKuliah.clear();
        for (int i = 0;i<iJumlahMk;i++){
            String arrMk[] = new String[4];

            System.out.print ("Masukan Kode Mata Kuliah: ");
            arrMk[0] = scan.next();

            System.out.print ("Masukan Nama Mata Kuliah: ");
            arrMk[1] = scan.next();

            //validasi grade
            do {
                System.out.print ("Masukan Grade Mata Kuliah: ");
                arrMk[2] = scan.next().toUpperCase();

            }while (!isValidGrade(arrMk[2]));

            System.out.print ("Masukan Jumlah SKS: ");
            arrMk[3] = scan.next();

            lstMataKuliah.add(arrMk);
        }

    }

    static int getGradeFromAlphabet(String alphabet){

        switch(alphabet){
            case "A":
                return 4;
            case "B":
                return 3;
            case "C":
                return 2;
            case "D":
                return 1;
            case "E" :
                return 0;

        }
        return 0;
    }

    static void perhitunganIPS(){
        if (lstMataKuliah.isEmpty()  ==  true) {
            System.out.println ("Lengkapi Pendataan Matakuliah terlebih dahulu!\n");
        }else {
            System.out.println ("\nMata kuliah yang anda ambil adalah:");
            int iSks = 0;
            int iGradeSks = 0;

            for (int i = 0; i< lstMataKuliah.size() ;i++){
                int iNumGrade = getGradeFromAlphabet(lstMataKuliah.get(i)[2]);
                int iNumSks = Integer.parseInt(lstMataKuliah.get(i)[3]);
                iGradeSks = iGradeSks + (iNumGrade*iNumSks);
                iSks = iSks+iNumSks;

                String str = String.format("%s %s \t\t%s \t%s", lstMataKuliah.get(i)[0], lstMataKuliah.get(i)[1], lstMataKuliah.get(i)[2], lstMataKuliah.get(i)[3]);
                System.out.println(str) ;
            }

            // perhitungan nilai IPS
            double dIps = iGradeSks/iSks;
            System.out.println(String.format("Nilai IPS Anda adalah %s",dIps ));
        }

    }

    static void updateGrade(){
        if (lstMataKuliah.isEmpty()  ==  true) {
            System.out.println ("Lengkapi Pendataan Matakuliah terlebih dahulu!\n");
        }else{
            System.out.print("\nMasukan Kode Mata Kuliah: ");
            String sKodeMk = scan.next();
            System.out.print("Masukan Grade Baru: ");
            String sGrade = scan.next();

            updateGrade(sKodeMk,sGrade);
        }

    }

    static void updateGrade(String matakuliah,String newGrade){
        for (int i = 0;i< lstMataKuliah.size() ;i++) {

            if (lstMataKuliah.get(i)[0].toLowerCase().equals(matakuliah.toLowerCase()) )
                lstMataKuliah.get(i)[2] = newGrade.toUpperCase();
        }

        // tampilkan
        for (int i = 0; i< lstMataKuliah.size() ;i++){

            String str = Arrays.toString(lstMataKuliah.get(i)).replace("[","");
            str = str.replace("]","");
            str = str.replaceFirst(",", "");
            str = str.replace(",","\t");

            System.out.println(str) ;
        }
    }

    static boolean isValidGrade(String grade){
        String[] values = {"A","B","C","D","E"};
        if(Arrays.stream(values).anyMatch(grade.toUpperCase()::equals)) return true;
        else System.out.println("Masukan Grade Mata Kuliah yang benar("+ String.join(",", values) +")!");

        return false;
    }
}
