import java.util.Scanner;

public class factorial{
    public static int fact(int n){
        int fact = 1;
        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
        return fact;

    }

    public static int binomialCoefficient(int n,int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);    
        int ans = (fact_n)/((fact_r)*(fact_nmr));
        return ans;
    }
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a Number : ");
        // int n = sc.nextInt();
        // int ans = fact(n);
        // System.out.println("Factorial of "+n +" is " +ans);

        int n = 5;
        int r = 2;
        int ans = binomialCoefficient(n,r);
        System.out.println(ans);

    }
}