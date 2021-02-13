public class StringPalindrome{

public static boolean isPalindrome(String s)
{
  int i=0,j=s.length()-1;

  while(i < j)
  {
      if(s.charAt(i)!= s.charAt(j))
      {
          return false;         //not palindrome

      }
      i++;
      j--;
  }

  return true; //palindrome

}


public static void main(String args[])
{

  String s = "aabba";

  if(isPalindrome(s))
  {
      System.out.println("string is palindrome");
  }
  else{
    System.out.println("string is  not palindrome");
  }
}


}