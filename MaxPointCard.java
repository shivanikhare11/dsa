package study.array;

public class MaxPointCard {

    public static void main(String[] args) {

        int[] cardPoints = {1,2,3,4,5,6,1};
        int k = 3;
         int n = cardPoints.length;
                int sum = 0;

                for(int i = 0; i < k ; i++ ){
                    sum+=cardPoints[i];
                }



                int j = 1;
                int l = k;

                while(j < n-k && l < n){

                    sum = Math.max(sum, sum -cardPoints[j] + cardPoints[l]);
                    j++;
                    l++;

                }
                System.out.println(sum);

            }


        }


