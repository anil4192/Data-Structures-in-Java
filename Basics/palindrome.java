import java.util.*;
public class palindrome{
    public static boolean isPalindrome(int n){
        int palindrome = n;
        int rev = 0;
        while(palindrome != 0){
            int rem = palindrome%10;
            rev = rev *10 + rem;
            palindrome /=10;
        }

        if(n == rev)
        {
            return true;
        }

        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();

        if(isPalindrome(n)){
            System.out.println(n+" is Palindrome Number!!!");
        }
        else{
            System.out.println(n+" Not Palindrome Number!!!");
        }
    }
}