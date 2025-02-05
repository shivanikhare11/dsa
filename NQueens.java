package study.backtracking;

import java.util.HashSet;
import java.util.Set;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;

        System.out.println(totalNQueens(n));

    }

    private static int out = 0;
    private static Set<Integer> col = new HashSet<>();
    private static Set<Integer> posDg = new HashSet<>();
    private static Set<Integer> negDg = new HashSet<>();


    public static int totalNQueens(int n) {
        out = 0;
        Set<Integer> col = new HashSet<>();
        Set<Integer> posDg = new HashSet<>();
        Set<Integer> negDg = new HashSet<>();


        helper(n, 0);
        return out;

    }

    public static void helper(int n, int r) {

        if (r == n) {
            out =out+1;
            return;
        }

        for (int c = 0; c < n; c++) {
            if (col.contains(c) || posDg.contains(c + r) || negDg.contains(r - c))
                continue;
            col.add(c);
            posDg.add(c + r);
            negDg.add(r - c);
            helper(n, r+1);
            col.remove(c);
            posDg.remove(c + r);
            negDg.remove(r - c);
        }

    }
}
