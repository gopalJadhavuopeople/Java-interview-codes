package Year2026.May_2026;

public class ReverseString {

    String name = "Gopal Jadhav";

    static String  reverse ="";


    //using String builder

    public static String reverseString(String name) {

        StringBuilder sb = new StringBuilder();
        for (int i = name.length() - 1; i >= 0; i--) {
            sb.append(name.charAt(i));


        }
        reverse = sb.toString();
        return reverse;

    }

    //using loop

    public static  String ReverseStringUsingLoop (String name){

        for(int i = name.length()-1 ; i>=0; i--){
            reverse += name.charAt(i);

        }
        return reverse;

    }

    public static void main(String[] args) {
//        String name  = reverseString("Gopal Jadhav");
//        System.out.println(name);
       String girlName  =  ReverseStringUsingLoop("kavita pathak");
        System.out.println("girlName" + girlName);

    }
}
