package src.question;
/*
a b c d e
f g h i j
k l m n o
p q r s t
u v w x y
z
*/

import java.util.HashMap;
import java.util.Map;

public class Ques {

 static Map<Character, int[]> keyBoardMap = new HashMap<>();

    public static void main(String[] args) {

        String input = "shivani";
        System.out.printf(typeRemoteNew(input));

    }

    public static String typeRemoteNew(String input){
        int startPositionR = 0;
        int startPositionC = 0;
        StringBuilder out= new StringBuilder();

        for(int i = 0; i < input.length();i++){

            char c = input.charAt(i);
            int posR =  (c- 'a')/5;
            int posC = (c-'a')%5;
            int rowMovement = posR - startPositionR;
            int columnMovement = posC - startPositionC;

            if(rowMovement> 0){
                while (rowMovement >0 ){
                    out.append("D");
                    rowMovement --;
                }
            }else {
                while (rowMovement <0 ){
                    out.append("U");
                    rowMovement++;
                }
            }

            if(columnMovement> 0){
                while (columnMovement >0 ){
                    out.append("R");
                    columnMovement--;
                }
            }else {
                while (columnMovement <0 ){
                    out.append("L");
                    columnMovement++;
                }
            }
            startPositionR = posR;
            startPositionC = posC;
            out.append("X");

        }
        return out.toString();

    }

    public static String typeRemote(String input){
        int startPositionR = 0;
        int startPositionC = 0;
        StringBuilder out= new StringBuilder();
        for(int i = 0; i < input.length();i++){
            int[] pos = keyBoardMap.get(input.charAt(i));
            int rowMovement = pos[0] - startPositionR;
            if(rowMovement> 0){
                while (rowMovement >0 ){
                    out.append("D");
                    rowMovement --;
                }
            }else {
                while (rowMovement <0 ){
                    out.append("U");
                    rowMovement++;
                }
            }
            int columnMovement = pos[1] - startPositionC;
            if(columnMovement> 0){
                while (columnMovement >0 ){
                    out.append("R");
                    columnMovement--;
                }
            }else {
                while (columnMovement <0 ){
                    out.append("L");
                    columnMovement++;
                }
            }
            startPositionR = pos[0]; // 3,3
            startPositionC = pos[1];
            out.append("X");
        }
        return out.toString();

    }
}
