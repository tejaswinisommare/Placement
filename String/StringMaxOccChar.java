
public class StringMaxOccChar {

public static char Stringchar(String str)
    {
    //for string ascii value 0 to 256

    //in array of 0 to 256 all are bydefault 0 value after this operation it will store the count of char value
  int arr[] = new int[256];

   for(int i=0; i<str.length();i++)
   {

    arr[str.charAt(i)]=arr[str.charAt(i)]+1;

   }
   char c =' ';
   int max= -1;

   for(int i=0; i<str.length(); i++)
   {
     if(max < arr[str.charAt(i)])
     {
       max = arr[str.charAt(i)];

       c = str.charAt(i);

     }

   }

   return c;


   }

    public static void main(String[] args) throws Exception {

        String str ="abbccc";
        System.out.println("max occurance "+Stringchar(str));
    }
}
