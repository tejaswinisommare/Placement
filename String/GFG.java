
public class GFG {

    // function to transform string with
    // string passed as reference
    static boolean transformString(StringBuilder s) {

        // initializing the variable ch to 'a'
        char ch = 'a';

        // if the length of string is less than
        // 26, we can't obtain the required
        // subsequence
        if (s.length() < 26)
            return false;

        for (int i = 0; i < s.length(); i++) {

            // if ch has reached 'z', it means
            // we have transformed our string
            // such that required subsequence
            // can be obtained
            if ((int) ch > (int) 'z')
                break;

            // current character is not greater
            // than ch, then replace it with
            // ch and increment ch
            if (s.charAt(i) <= ch) {
                s.setCharAt(i, ch);
                ch = (char) ((int) ch + 1);
            }
        }

        if (ch <= 'z')
            return false;
        return true;
    }

    // Driver Code
    public static void main(String args[]) {
        StringBuilder str = new StringBuilder("aaaaaaaaaaaaaaaaaaaaaaaaaa");

        if (transformString(str))
            System.out.println(str.toString());
        else
            System.out.println("Not Possible");
    }
}

// This code is contributed by Manish Shaw
