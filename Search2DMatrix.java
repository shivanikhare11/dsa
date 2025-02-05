package study.binarySearch;

public class Search2DMatrix {
    public static void main(String[] args) {

        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
//        System.out.println(searchMatrix(matrix, target));
        System.out.println(searcMatrix2(matrix, target));

    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int i = 0;
        int j = matrix.length-1;

        while (i < j) {

            int m = (i + j) / 2 ;

            if (target == matrix[m][0])
                return true;
            else if (target < matrix[m][0]) {
                j = m-1;
            } else {
                i = m;
            }
        }

        int start = 0;
        int end = matrix[0].length -1;

        while (start < end) {
            int m = (start + end) / 2 ;
            if (target == matrix[i][m])
                return true;
            else if (target < matrix[i][m]) {
                end = m-1;
            } else {
                start = m;
            }
        }
        return false;
    }

    public static boolean searcMatrix2(int[][] matrix, int target){

            int i = 0;
            int n = matrix[0].length;
            int j = matrix.length * matrix[0].length -1;

            while (i <= j) {

                int m = (i + j) / 2 ;
                int midVal = matrix[m/n][m%n];
                if (target == midVal)
                    return true;
                else if (target < midVal) {
                    j = m;
                } else {
                    i = m+1;
                }
            }
            return false;
    }
}
