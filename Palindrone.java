package study.recursion;

public class Palindrone {

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
//        String s = "OP";
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int i = 0 ;

        int j = s.length()-1;

//        while(i<j){
//
//            if(s.charAt(i) != s.charAt(j)){
//                System.out.println(false);
//                break;
//            }
//            i++;
//            j--;
//
//        }


        System.out.println(check(s,i,j));

    }

    private static boolean check(String s, int i , int j){

        if(i >= j) return true;

        if(s.charAt(i) != s.charAt(j)){
            return false;
        }

        return check(s, i +1, j-1);

    }
}
