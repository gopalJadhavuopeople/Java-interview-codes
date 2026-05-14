package array;

public class minMaxFromArray {

    public static void main(String[] args) {

        //min or max from array

        int ar[]={8,100,2,3,6,3,7};

        int min= ar[0];//Integer.MAX_VALUE;//-21566565
        int max=ar[0];//Integer.MIN_VALUE;//21465656

        for(int i = 0; i<ar.length; i++){

            if(ar[i]>max){

                max = ar[i];

            }
            if(ar[i]<min){

                min = ar[i];

            }



        }

        System.out.println(min + "= min");
        System.out.println(max + "= max");


    }


}
