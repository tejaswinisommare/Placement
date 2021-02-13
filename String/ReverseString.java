
class ReverseString{

    public static void main(String[] args) {
        
        String s="teju";
        int i;
        char[] c = s.toCharArray();

        for(i=s.length()-1; i>=0; i--)
        {
               System.out.print(c[i]);
        }
    }
}