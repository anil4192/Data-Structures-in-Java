public class shortestPath {
    public static float getShortestPath(String str)
    {
        int x =0;
        int y =0;
        for(int i=0;i<str.length();i++)
        {
            char dir = str.charAt(i);
            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int X = x*x;
        int Y = y*y;
        return (float)Math.sqrt(X+Y);
    }
    public static void main(String[] args) {
        String path = "WSESNSW";
        System.out.println(getShortestPath(path));
    }
}
