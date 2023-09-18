import java.util.*;
public class sumOfDigits {
    public static int sumDigits(int n){
        int sum = 0;
        while(n>0){
            int lastDigit = n%10;
            sum = sum + lastDigit;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int n = sc.nextInt();
        System.out.println("Sum Of Digits is : "+sumDigits(n));
       
    }
}
