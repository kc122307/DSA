package com.kunal.Dsa.TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> ouput = new ArrayList<>();
       if(matrix==null||matrix.length==0){
           return ouput;
       }
       int m = matrix.length, n=matrix[0].length;
       int left=0,top=0,right=n-1,bottom=m-1;
       while(left<=right&&top<=bottom){
           for (int i = left; i <=right ; i++) {
               ouput.add(matrix[top][i]);
           }
           top++;
           for (int i = top; i <=bottom ; i++) {
               ouput.add(matrix[i][right]);
           }
           right--;
           if(top<=bottom) {
               for (int i = right; i >= left; i--) {
                   ouput.add(matrix[bottom][i]);
               }
               bottom--;
           }
           if(left<=right) {
               for (int i = bottom; i >= top; i--) {
                   ouput.add(matrix[i][left]);
               }
               left++;
           }
       }
       return ouput;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(spiralOrder(matrix1)); // Output: [1,2,3,6,9,8,7,4,5]

        int[][] matrix2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println(spiralOrder(matrix2)); // Output: [1,2,3,4,8,12,11,10,9,5,6,7]
    }
}
