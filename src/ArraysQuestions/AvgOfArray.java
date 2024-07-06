package ArraysQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AvgOfArray {
    public static void main(String[] args) {

      // Average of an Array

      /*  int [] arr = {5,7,2,9,5,3,6};
         Arrays.sort(arr);
        System.out.println("aa "+Arrays.toString(arr));
        int sum = 0;
        int avg = 0;
        int count = arr.length;
        for(int i =0; i < arr.length;i++){
            sum = sum + arr[i];
        }
        avg = sum/count;

        System.out.println("AVG "+ avg);*/
   /* int [][] arr = new int[10][10];
      for(int i =0; i <10;i++){
          for(int j=0;j<10;j++){
              System.out.print(" "+arr[i][j]);
          }
          System.out.println();
      }
    */

  // sorting in descending order
        int [] arr = {5,7,2,9,5,3,6};
        System.out.println("aa "+Arrays.toString(arr));
        int temp = 0;
        for(int i =0;i < arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] < arr[j]){  // if i less than j then i should swap to J
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();

        System.out.println(Arrays.toString(arr));
    }
}
