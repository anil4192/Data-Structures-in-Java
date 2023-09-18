public class subString {
    public static String getSubStr(String str,int si,int ei)
    {
        String substr ="";
        for(int i=si;i<ei;i++)
        {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "ThisIsAnil Misal";
        System.out.println(getSubStr(str,6,16));
    }
}
