class ArrayMINI {

    public static void main(String[] args) {

        int arr[] = new int[] { 2, 1, 2, 3, 5 };

        int mini = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    mini = arr[j];
                }
            }

        }

        System.out.println("minimum:" + mini);

    }
}