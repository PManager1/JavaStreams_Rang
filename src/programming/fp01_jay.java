package programming;

import java.util.ArrayList;
import java.util.List;

public class fp01_jay {
    public static void main(String[] args) {

         List<Integer> nums = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        List<Integer> test = java.util.Arrays.asList(2,4,1,0,4,2);


        printAllNumbsInList (test);
    }

    public static void printAllNumbsInList ( List<Integer> nums ){
        System.out.println(" callign fun");

            nums.stream().forEach(p -> System.out.println("num ="+ p));


        //Functioal
//        for ( int num  : nums) {
//            System.out.println("num ="+ num);
//
//        }

    }

}
