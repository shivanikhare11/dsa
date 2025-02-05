package study.twoPointers;

public class TrappingRainWater {

    public static void main(String[] args) {

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(trap(height));


    }

    public static int trap(int[] height) {

        if(height.length <=1) return 0;

        int start =0;
        int end = 1;
        int currentWaterStore = 0;
        int finalWaterStore = 0;

        if(start < height.length && end <height.length ){
            if(height[end] >= height[start]){
                finalWaterStore = finalWaterStore + currentWaterStore;
                currentWaterStore=0;
                start=end ;
                end++;
            }else {
                if(end+1 == height.length){
                    start++;
                    end = start+1;
                    currentWaterStore=0;
                }else{
                    currentWaterStore = currentWaterStore+ (height[start] - height[end]);
                    end++;
                }
            }

        }

        return finalWaterStore;

    }
}
