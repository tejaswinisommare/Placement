public class ArrayDup {
    public static void main(String[] args) throws Exception {

        int arr[]={2,2,3,4,5};
          System.out.print("Duplicate element");
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[j]);
                }
            }
        }

    }
}
