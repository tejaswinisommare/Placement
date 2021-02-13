public class minsubseq{


    public static void main(String[] args) {
        
      String s= "111000111110000";
      int mincounter=20000;
      char arr[] =s.toCharArray();
      int i,tail;
      for(i=0; i<s.length();)
      {
        if(arr[i]=='1')
        {
            tail=i;
            int count =0;

            while(tail <arr.length && arr[tail]=='1'){
                tail++;
                count++;
            }
            i=tail;

            if(mincounter > count){
                mincounter=count;
            }
        }
       else
       {
              i++;
         }

      }

      if(mincounter==20000){
          mincounter=-1;
      }

      System.out.println(mincounter);


 }
}