package forum.binusonline.ahmadilyas;

public class Main {

    public static void main(String[] args) {
        boolean benar = true;
        String str = String.valueOf(benar);
        System.out.println("String dari true: "+str);
        System.out.println("Int dari true: "+boolToInt(benar));

        boolean salah = false;
        String str2 = Boolean.toString(salah);
        System.out.println("String dari false: "+str2);
        System.out.println("Int dari false: "+boolToInt(salah));
    }

    static int boolToInt(Boolean b) {
        return b.compareTo(false);
    }
}
