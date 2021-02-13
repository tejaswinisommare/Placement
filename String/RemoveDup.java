public class RemoveDup {

    public static String RemoveD(String str) {

        char arr[] = str.toCharArray();

        String result = " ";

        for (char s : arr) {
            if (result.indexOf(s) == -1) {
                result = result + s;
            }

        }
        // System.out.println("Dup element:" + result);

        return result;

    }

    public static void main(String[] args) throws Exception {

        String str = "java";
        System.out.println("after rem dup:" + RemoveD(str));

    }
}