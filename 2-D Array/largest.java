import java.util.*;
public class largest {
    public static void largestElement(int matrix[][])
    {
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]>maxi)
                {
                    maxi = matrix[i][j];
                }
            }
        }
        System.out.println("Lagest Element is : "+maxi);
    }
    public static void main(String[] args) {
        int matrix[][]= new int[3][4];
        int n=matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Elements of Array");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        largestElement(matrix);

    }
}
