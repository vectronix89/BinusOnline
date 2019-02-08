package forum.binusonline.ahmadilyas;

import java.util.Vector;

public class ContohVector {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<Integer>();
        vec.add(22);
        vec.add(10);
        vec.add(15);
        System.out.println("jumlah elemen vektor : " +vec.size());
        System.out.println("cetak isi vektor : ");
        for ( int i=0;i<vec.size();i++){
            System.out.println(""+vec.get(i));
        }
    }
}
