package forum.binusonline.ahmadilyas;

import java.util.Arrays;

public class JavaArrayCopyExample {
    public static void main(String[] args) {
        int[] source = {1,2,3,4,5,6,7,8,9};
        int[] source1 = {1,2,3};
        int[] destination=null;
        System.out.println("Source array = "+Arrays.toString(source));

        destination = copyFirstFiveFieldsOfArrayUsingSystem(source);
        System.out.println("Copy 5 elements pertama dari array jika ada. Hasil array = "+ Arrays.toString(destination));

        destination = copyFirstFiveFieldsOfArrayUsingSystem(source1);
        System.out.println("Copy 5 elements pertama dari array jika ada. Hasil array = "+Arrays.toString(destination));

        destination = copyFullArrayUsingSystem(source);
        System.out.println("Copy full array menggunakan System.copyarray() function. Hasil array = "+Arrays.toString(destination));

        destination = copyFullArrayUsingClone(source);
        System.out.println("Copy full array menggunakan clone() function. Hasil array = "+Arrays.toString(destination));

        destination = copyFullArrayUsingArrayCopyOf(source);
        System.out.println("Copy full array menggunakan Arrays.copyOf() function. Hasil array = "+Arrays.toString(destination));

        destination = copyLastThreeUsingArrayCopyOfRange(source);
        System.out.println("Copy 3 elements terakhir menggunakan Arrays.copyOfRange() function. Hasil array = "+Arrays.toString(destination));
    }

    /**
     * Method copy full array menggunakan Arrays.copyOf() function
     * @param source
     * @return
     */
    private static int[] copyFullArrayUsingArrayCopyOf(int[] source) {
        return Arrays.copyOf(source, source.length);
    }

    /**
     * Method copy partial array (3 elements terakhir) menggunakan Arrays.copyOfRange() function
     * @param source
     * @return
     */
    private static int[] copyLastThreeUsingArrayCopyOfRange(int[] source) {
        return Arrays.copyOfRange(source, source.length-3, source.length);
    }

    /**
     * Method copy full array menggunakan clone() function
     * @param source
     * @return
     */
    private static int[] copyFullArrayUsingClone(int[] source) {
        return source.clone();
    }

    /**
     * Method copy full array menggunakan System.arraycopy() function
     * @param source
     * @return
     */
    private static int[] copyFullArrayUsingSystem(int[] source) {
        int[] temp=new int[source.length];
        System.arraycopy(source, 0, temp, 0, source.length);
        return temp;
    }

    /**
     * Method copy full 5 elements pertama dari array menggunakan System.arraycopy() function
     * @param source
     * @return
     */
    private static int[] copyFirstFiveFieldsOfArrayUsingSystem(int[] source) {
        if(source.length > 5){
            int[] temp=new int[5];
            System.arraycopy(source, 0, temp, 0, 5);
            return temp;
        }else{
            int[] temp=new int[source.length];
            System.arraycopy(source, 0, temp, 0, source.length);
            return temp;
        }

    }
}
