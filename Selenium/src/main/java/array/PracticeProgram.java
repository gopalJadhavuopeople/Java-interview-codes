package array;

public class PracticeProgram {

    public static void main(String[] args) {
        int ar[] = {1, 2, 3,4, 5,6,7,8,9,10,12};
        //find out the missing numbers
       int length  = ar.length;
       int lastNumber = ar[length-1];
       int totalNumbers  = length;
       int sumOfNumbers  = lastNumber*(lastNumber+1)/2;
        System.out.println("sumOfNumbers :"+ sumOfNumbers);
       int totalOfNumbers = sumOfNumbers -totalNumbers;
       int missingNumber = sumOfNumbers-totalOfNumbers;
        System.out.println("Missing number is :" + missingNumber);

    }
}
