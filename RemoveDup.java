import java.util.Arrays;
class RemoveDup{


    public static void main(String[] args) {
    
        int arr[] = {2,3,4,5,2,4,2};
        int len=arr.length;

        int temp[] = new int[arr.length];
         int j=0;

         Arrays.sort(arr);
        for(int i=0; i<len-1; i++)
        {
            if(arr[i] != arr[i+1])
            {
                temp[j++]=arr[i];
            }
        }
        temp[j++] = arr[len-1];  
        
        for(int k=0; k<j; k++)
        {
            System.out.println(temp[k]);
        }

    }
}