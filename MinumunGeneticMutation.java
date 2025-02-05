package study.graphdfs;

import java.util.LinkedList;
import java.util.Queue;

public class MinumunGeneticMutation {
    public static void main(String[] args) {

        String startGene = "AACCGGTT",  endGene = "AAACGGTA";
        String[] bank = {"AACCGGTA","AACCGCTA","AAACGGTA"};
        System.out.println(minMutation(startGene, endGene, bank));

    }


    public static int minMutation(String startGene, String endGene, String[] bank) {

        boolean isEndGenePresent = false;

        for (int i = 0; i < bank.length; i++) {
            if (bank[i].equals(endGene))
                isEndGenePresent = true;
        }
        if (!isEndGenePresent)
            return -1;

        int[] isVisted = new int[bank.length];
        Queue<String> q = new LinkedList<>();

        q.offer(startGene);
        int mutation = 0;
        while (!q.isEmpty()) {

            int size = q.size();
            while (size > 0) {

                String gene = q.poll();
                for (int i = 0; i < bank.length; i++) {
                    int diff = 0;
                    if (isVisted[i] == 0) {
                        for (int j = 0; j < 8; j++) {
                            if (diff > 1)
                                break;
                            if (gene.charAt(j) != bank[i].charAt(j))
                                diff++;
                        }
                        if (diff == 0)
                            return mutation + 1;
                        if (diff == 1) {
                            if (bank[i] == endGene)
                                return mutation + 1;
                            q.offer(bank[i]);
                            isVisted[i] = 1;
                        }

                    }
                }
                size--;

            }
            mutation++;

        }

        return -1;
    }
}
