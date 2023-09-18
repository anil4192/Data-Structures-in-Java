import java.util.*;
class product{

    public static int multiply(int a,int b){
        int ans = a*b;
        return ans;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        int ans = multiply(a,b);
        System.out.println(ans);
    }
}