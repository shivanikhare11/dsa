package study.dp;

public class EditDistance {
    public static void main(String[] args) {

    }

    public static int minDistance(String word1, String word2) {

        return helper(word1, word2, 0, 0);

    }

    public static int helper(String word1, String word2, int i, int j) {

        if (word1 == "" & word2 == "") {
            return 0;
        }


        if (word1 == "") {
            return word2.length();
        }
        if (word2 == "") {
            return word1.length();
        }

        if (word1.charAt(0) == word2.charAt(0)) {
            return helper(word1.substring(1), word2.substring(1), i + 1, j + 1);
        }

        int insert = 1 + helper(word1, word2.substring(1), i + 1, j + 1);
        int remove = 1 + helper(word1.substring(1), word2, i + 1, j + 1);
        int replace = 1 + helper(word1.substring(1), word2.substring(1), i + 1, j + 1);

        return Math.min(Math.min(insert, remove), replace);
    }

}
