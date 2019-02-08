package forum.binusonline.ahmadilyas;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args)
    {
        System.out.println("Input: ");

        Scanner read  = new Scanner(System.in);
        String str  = read.nextLine();

        StringBuilder sb  = new StringBuilder(str);

        System.out.println("Output: \n" + sb.reverse().toString());
    }
}
