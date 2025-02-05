//package study.array;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//
//public class InvalidTransaction {
//
//
//    public static void main(String[] args) {
//
//        String[] transactions = {"alice,20,800,mtv","alice,50,100,beijing"};
//        List<String> list = new ArrayList<>();
//        boolean[] isInvalid = new boolean[transactions.length];
//
//
//        for(int i = 0 ; i < transactions.length;i++){
//
//        if (isInvalid[i]) continue;
//
//        helper(transactions, i, list, isInvalid);
//        }
//
//
//
//        for (int i = 0 ; i < list.size(); i ++){
//            System.out.println(list.get(i));
//        }
//
//
//    }
//
//    public static void helper( String[] transactions,int i,  List<String> list, boolean[] isInvalid){
//
//        if (isInvalid[i]) return;
//
//       String[] s1= transactions[i].split(",");
////       String[] s2= transactions[j].split(",");
//
//       if(Integer.parseInt(s1[2]) > 1000){
//            list.add(transactions[i]);
//            isInvalid[i] = true;
//        }else if ((Objects.equals(s1[0], s2[0])) && (Math.abs((Integer.parseInt(s1[1])  - Integer.parseInt(s2[1]))) < 60) && (!Objects.equals(s1[3], s2[3]))){
//            list.add(transactions[i]);
////            list.add(transactions[j]);
//       }
//
//
//
//    }
//}
