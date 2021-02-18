import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args)
    {
        long n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextLong();
        int i=1;
        System.out.print("Divisors:\t");
        while(i<=n/2)
        {
            if(n%i==0)
            {
                System.out.print(""+i+"\t");
                sum+=i;
            }
            i++;
        }
        if(sum==n)
        {
            System.out.println("\n"+n+" is a perfect number");
        }
        else
            System.out.println("\n"+n+" is not a  perfect number");

    }

}
