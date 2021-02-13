import java.util.Arrays;

class ArrayOccNo{

    public static void main(String[] args) {
        
        int arr[] = new int[]{2,3,8,4,3,2,2,6,8};

         Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++)
        {
            int count=1;

            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
                else{
                    break;
                }
            }

            if(count >= 1)
            {
                System.out.println("Occ of no:"+arr[i]+" ="+ count);
                 i+=(count-1);
            }
        }
    }
}