package study.array;

import java.util.*;

public class RandomisedSet {
    Map<Integer, Set<Integer>> idx;
    List<Integer> list;
    Random random;


    public RandomisedSet() {

        idx = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();

    }

    public boolean insert(int val) {

        boolean res = !idx.containsKey(val);
        if(res) {
            idx.put(val, new HashSet<Integer>());

        }
        idx.get(val).add(list.size());
        list.add(val);

        return res;

    }

    public boolean remove(int val) {

        boolean res = idx.containsKey(val);

        if(res) {

            int index = idx.get(val).iterator().next();
            list.remove(index);
        }

        return res;
    }

    public int getRandom() {
        return  list.get(random.nextInt(list.size()));

    }
}
