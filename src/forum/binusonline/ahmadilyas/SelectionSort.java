package forum.binusonline.ahmadilyas;

public class SelectionSort {
    public static void main(String args[]){
        final int[] arr = { 3, 4, 5, 2, 1 };
        int min;
        System.out.println("Selection Sort dengan pengurutan ascending");
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;

                }
            }
            if (min != i) {
                final int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
            System.out.println(arr[i]);
        }
    }
}
