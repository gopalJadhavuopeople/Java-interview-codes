package Year2026.May_2026;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int n = 3;

        int length = arr.length;

   //     System.out.println(length);

        int[] arr1 = new int[length];

        int index = 0;//2

        //copy remaining elements

        for (int i = n; i < length; i++) {
            arr1[index++] = arr[i];//arr1[0]=4,5

        }
        for (int i = 0; i < n; i++) {
            arr1[index++] = arr[i];

        }

//        for (int num : arr1) {
//
//            System.out.print(num + ",");
//
//        }

        System.out.println(Arrays.toString(arr1));


    }
}
