import java.util.*;

public class printNumbers{
    public static void printDigits(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }

        System.out.print(n+" ");
        printDigits(n-1);
    }

    public static void printDigit(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printDigit(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value: ");
        n= sc.nextInt();
        printDigits(n);
        printDigit(n);
        
    }
}