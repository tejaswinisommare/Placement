import java.util.Scanner;
class ArrayMaxSecMax{

    public static void main(String[] args) {
        
        int arr[] = new int[5];
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter array element:");
      int max=0;
      int sMax=0;
        for(int i=0; i<arr.length; i++)
       {
          arr[i] = sc.nextInt();
       }

       for(int i=0 ;  i<arr.length; i++)
       {
           for(int j=i+1; j<arr.length; j++)
           {

            if(arr[i] < arr[j])
            {
                max=arr[j];
                sMax=arr[i];
            }
           }
       }

       System.out.println("Maximum:"+max);
       System.out.println("Sec Maximum:"+sMax);



    }
}