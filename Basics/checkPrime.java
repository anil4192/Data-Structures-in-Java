import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int n = sc.nextInt();

        if(n==2)
        {
            System.out.println("Number is Prime");
        }
        else
        {
            boolean isPrime = true;
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    isPrime=false;
                }
            }

            if(isPrime)
            {
                System.out.println("Number is Prime");
            }
            else
            {
                System.out.println("Number is Not Prime");
            }
        }

    }
}
