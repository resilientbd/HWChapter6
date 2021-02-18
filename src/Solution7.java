import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int number = sc.nextInt();
            if (number < 0) {
                return;
            } else {
                System.out.println(checkPrime(number));
            }
        }
    }

    private static String checkPrime(int number) {
        int i, m = 0, flag = 0;
        int n = number;//it is the number to be checked
        m = n / 2;
        String result = "";
        if (n == 0 || n == 1) {
            result = "not prime number";
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    result = "not prime number";
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                result = "prime number";
            }
        }//end of else
        return result;
    }
}

