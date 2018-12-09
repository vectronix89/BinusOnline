package assigment.binusonline.ahmadilyas;

public class OperatorLogical {
    public static void main(String[] args) {
        int bilangan1 = 1, bilangan2 = 4, bilangan3 = 9;
        boolean hasil;

        // Setidaknya satu ekspresi harus true untuk hasil yang true
        hasil = (bilangan1 > bilangan2) || (bilangan3 > bilangan1);
        // hasil akan true karena (bilangan1 > bilangan2) adalah true
        System.out.println(hasil);

        // Semua ekspresi harus true dari hasil menjadi true
        hasil = (bilangan1 > bilangan2) && (bilangan3 > bilangan1);
        // hasil akan false karena	(bilangan3 > bilangan1) adalah false
        System.out.println(hasil);
    }
}

