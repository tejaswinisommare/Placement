
public class StringMinOccChar {

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
       int min= 1;
    
       for(int i=0; i<str.length(); i++)
       {
         if(min == arr[str.charAt(i)])
         {
           min = arr[str.charAt(i)];
    
           c = str.charAt(i);
    
         }
    
       }
    
       return c;
    
    
       }
    
        public static void main(String[] args) throws Exception {
    
            String str ="abbccc";
            System.out.println("minimum occurance "+Stringchar(str));
        }
    }
    