package forum.binusonline.ahmadilyas;

public class ContohOverloading {
    private static void jumlah (int a, int b){
        System.out.println("Jumlah 2 angka ="+ (a + b));
    }

    //oveloading perbedaan jumlah parameter
    private static void jumlah (int a, int b, int c){
        System.out.println("Jumlah 3 angka =" + (a + b + c));
    }

    //overloading perbedaan tipe data parameter
    private static void jumlah (double a,int b){
        System.out.println("Jumlah 2 angka (double+int) = "+ (a + b));
    }
    public static void main(String[] args) {

        jumlah(5,10);
        jumlah(100,8,43);
        jumlah(2.7,9);

    }
}
