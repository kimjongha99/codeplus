package study;

public class ArrayConversionExample {
    public static void main(String[] args) {
        int [][] arr2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {7,8,9}
                };

        int rows = arr2.length; //행
        int cols = arr2[0].length;//열


        int []arr = new int[rows*cols];
        int index = 0;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j <cols; j++) {
                arr[index] = arr2[i][j];
                index++;

            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        }
}
