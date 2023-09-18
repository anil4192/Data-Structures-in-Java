import java.util.*;
//Sum of first n Natural Numbers


public class sumNnumber {
    public static int sumOfNnumber(int n){
        if(n==1){
            return 1;
        }
        return n+sumOfNnumber(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a number: ");
        int n = sc.nextInt();
        int sum = sumOfNnumber(n);
        System.out.println("Sum of first "+n+" Natural number is : "+sum);

    }
}
