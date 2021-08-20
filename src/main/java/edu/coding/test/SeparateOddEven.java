package edu.coding.test;

public class SeparateOddEven {

    //  Separate odd and even numbers in an array
    public static void main(String[] args) {

        int arr[]={12, 17, 70, 15, 22, 65, 21, 90, 97, 33, 28};

        System.out.println("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        arr = separateEvenOddNumbers(arr);

        System.out.println("\nArray after separating even and odd numbers : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println("-------------------------------------------");
        int arr1[] = {12, 34, 45, 9, 8, 90, 3};
        rearrangeEvenAndOdd(arr1, arr1.length);
        for (int i = 0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");
    }

    public static int[] separateEvenOddNumbers(int[] arr){

        int left = 0;
        int right = arr.length-1;

        for(int i=0;i<arr.length;i++){

            while(arr[left]%2==0){
                left++;
            }
            while(arr[right]%2==1){
                right--;
            }

            if(left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        return arr;
    }

    static void rearrangeEvenAndOdd(int arr[], int n)
    {
        // variables
        int j = -1,temp;

        // quick sort method
        for (int i = 0; i < n; i++) {

            // if array of element
            // is odd then swap
            if (arr[i] % 2 == 0) {

                // increment j by one
                j++;

                // swap the element
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

}
