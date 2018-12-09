package assigment.binusonline.ahmadilyas;

public class NilaiD {
    public static void main(String[] args) {
        keluaranPertama();
        keluaranKedua();
        keluaranKetiga();
        keluaranKeempat();
    }
    private static void keluaranPertama(){
        int  A=10,B=2,C=4;
        int D = A & B + A++ *  C;
        System.out.println("Nilai D = "+D);
    }
    private static void keluaranKedua(){
        int  A=10,B=2,C=4;
        int D = ++A % B | C;
        System.out.println("Nilai D = "+D);
    }
    private static void keluaranKetiga(){
        int  A=10,B=2,C=4;
        int D = A++ % B-- * ++C;
        System.out.println("Nilai D = "+D);
    }
    private static void keluaranKeempat(){
        int  A=10,B=2,C=4;
        int D =  C & B / A;
        System.out.println("Nilai D = "+D);
    }
}
