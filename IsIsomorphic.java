package study.hashMap;

public class IsIsomorphic {

    public static void main(String[] args) {

        String s = "foo", t = "bar";

        System.out.println(solution(s,t));

    }

    public static boolean solution(String s, String t) {

        int[] map1 = new int[255];
        int[] map2 = new int[255];


        for(int i = 0 ; i < s.length();i++){
            System.out.println(map1[s.charAt(i)]);
            System.out.println(map2[t.charAt(i)]);

            if(map1[s.charAt(i)] !=  map2[t.charAt(i)]) return false;


            map1[s.charAt(i)] =i+1;
            map2[t.charAt(i)] = i+1;

        }
        return true;

    }
}
