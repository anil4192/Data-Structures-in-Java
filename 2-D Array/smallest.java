public class smallest {
    public static void small(int matrix[][])
    {
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]<mini)
                {
                    mini = matrix[i][j];
                }
            }
        }
        System.out.println("Minimum Element is : "+mini);
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3},
            {5,6,4},
            {7,9,8}
            
        };
        small(matrix);
    }
}
