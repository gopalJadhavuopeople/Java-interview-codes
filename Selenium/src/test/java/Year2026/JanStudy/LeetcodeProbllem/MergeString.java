package Year2026.JanStudy.LeetcodeProbllem;

public class MergeString {

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr3";
        //output: "apbqcr"
        char chars1[] = word1.toCharArray();
        char chars2[] = word2.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while (i < chars1.length && j < chars2.length) {
            sb.append(word1.charAt(i++));

            sb.append(word2.charAt(j++));


        }
        System.out.println(sb.toString());
        while (i < chars1.length) {
            sb.append(chars1[i++]);

        }
        while (j < chars2.length) {
            sb.append(chars2[j++]);}
        System.out.println(sb.toString());


    }

}
