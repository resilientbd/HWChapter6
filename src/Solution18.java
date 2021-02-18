import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int number = sc.nextInt();
            if (number < 0) {
                return;
            } else {
                String numString = ""+number;
                System.out.println("Total digits:\t"+numString.length());
            }
        }
    }
}
