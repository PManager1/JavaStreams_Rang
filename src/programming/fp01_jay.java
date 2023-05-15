package programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class fp01_jay {
    public static void main(String[] args) {

         List<Integer> nums = List.of(12, 9, 13, 4, 6, 4, 12, 15);

        List<Integer> test = java.util.Arrays.asList(2,4,1,0,4,2);

        List<String> alphabets = List.of("a", "b", "c", "d");

        List <String> courses = List.of("java", "spring", "boot", "spring boot", "python");


        printNoOfCharsInEachCourseName(courses);
//        printCubeOfODDnos(nums);
//        printSquaresOfAllNos(nums);
//        CoursesWithAtleast4letters(courses);
//        printCoursesContainWord(courses, "spring");
//        printAllCourses(courses);
//        printEvenNumbsInList (nums, al  phabets);
    }



    public static void printNoOfCharsInEachCourseName ( List<String> courses ) {
        courses.stream().map(n -> n.length()).forEach(System.out::println );
    }

    public static void printCubeOfODDnos ( List<Integer> nums ) {
        nums.stream().filter( n -> n%2!= 0).map(m -> m*m*m).forEach(System.out::println);
    }

    public static void printSquaresOfAllNos ( List<Integer> nums ){
              nums.stream().map(n -> n*n).forEach(System.out::println);
    }

    public static void CoursesWithAtleast4letters ( List<String> courses ){
        courses.stream().filter(c -> c.length() > 4 ).forEach(System.out::println); ;

    }

    public static void printCoursesContainWord ( List<String> courses, String s1 ){
            courses.stream().filter( c -> c.contains("spring")).forEach(System.out::println);
    }


    public static void printAllCourses ( List<String> courses ){
        courses.stream().forEach(System.out::println);

//        for ( String s: courses ) {
//            System.out.println("courses = " + s);
//        }


    }

    public static boolean isEven(int n){
        System.out.println("isEven being called with n =" + n);
        if (n%2 == 0 ) { return true; }
        else { return false; }

    }

    public static void printEvenNumbsInList ( List<Integer> nums, List<String> alphas ){
//            nums.stream().map(n->(n%2==0));

        var o = alphas.stream().map(String:: toUpperCase).collect(Collectors.toList());
        System.out.println(o);

        var even = nums.stream().filter(n -> n%2==0 ).collect(Collectors.toList());
        System.out.println("even ="+even);

        var evenFn = nums.stream().filter( fp01_jay::isEven ).collect(Collectors.toList());
        System.out.println("evenFn ="+evenFn);
//Print Odd numbers.
        var odd = nums.stream().filter(n -> n%2!=0 ).collect(Collectors.toList());
        System.out.println("odd ="+odd);



    }
    public static void printAllNumbsInList ( List<Integer> nums ){

//            nums.stream().forEach(p -> System.out.println("num ="+ p));
        nums.stream().forEach(System.out::println);

        //Here :: is a method reference, which means that for each of the numbers coming up ,
        // do some operatoin on it.

        //Functioal
//        for ( int num  : nums) {
//            System.out.println("num ="+ num);
//
//        }

    }

}
