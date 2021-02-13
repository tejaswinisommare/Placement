public class MaxSubSeq{

    public static void main(String[] args) {
        String s= "000011110011001110001111";
          int count=0;
        char arr[] = s.toCharArray();
        int i;

        for(i = 0; i<s.length();){
          if(arr[i] == '1' && arr[i] != '0')
          {
              count++;
          }
         i++;

        }
         if(count==0)
         {
           count=-1;
         }
        System.out.println(count);

        
    }
}