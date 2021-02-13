class ArrayNoOcc{

    public static void main(String[] args) {
        
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
       int j,i,temp=-1;

       int newarr[] = new int[arr.length];

        for(i=0; i<arr.length; i++)
        {
            int count=1;
            for( j=i+1; j<arr.length; j++)
            {
               if(arr[i] == arr[j])
                {
                   count++;
                   
                   newarr[j]=temp;
             
                }
            }
            if(newarr[i] != temp )
            {
               newarr[i]=count;
            }
              
        }
       
        for(i=0; i<arr.length; i++)
        {
            if(newarr[i] != temp)
            {
                System.out.println("Occ of number:"+arr[i]+ " = " + newarr[i]);
            }
        }


    }

   
}