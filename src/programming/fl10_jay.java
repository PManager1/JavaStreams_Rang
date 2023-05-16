package programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class fl10_jay {


    public static void main(String[] args) {

        List <String> courses = List.of("java", "spring", "boot", "spring boot", "python");
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);


        List<Integer> ListWithLengthsOfTitles  =  ListWithLengthsOfTitlesFn(courses);
        System.out.println(ListWithLengthsOfTitles);

//        List<Integer> EvenNosFilteredFromNumList  =  listWithEvenNosFilteredFromNumList(numbers);
//        System.out.println(EvenNosFilteredFromNumList); //[12, 4, 6, 2, 4, 12]

//        List<Integer> doubledNumbers  =  doubleList(numbers);
//        System.out.println(doubledNumbers);

//            List<Integer> doubledNumbers  =  doubleList(numbers);
//        System.out.println(doubledNumbers);
//        revSortFns(numbers);
//            sortFns(numbers);
//        int sum = SumOfOddNumbersInList (numbers); //37
//        int sum = CubeAllNumsAndFindtheSumofSquares(numbers);  // 10109
//        int sum = squareAllNumsAndFindtheSumofSquares(numbers); //835
//        int sum = findMAxInList(numbers);
//        int sum = addListStructured2(numbers);
//        int sum = addListStructured(numbers);
//        System.out.println("15-sum="+ sum);

    }

    private static List<Integer> ListWithLengthsOfTitlesFn(List<String> courses) {
//        return courses.stream().map(e -> e.length()).toList();

        return courses.stream().map(getStringIntegerFunction()).toList();
    }
// good , created a whole method out of small operation.
    private static Function<String, Integer> getStringIntegerFunction() {
        return e -> e.length();
    }

    private static List<Integer> listWithEvenNosFilteredFromNumList(List<Integer> nums) {
        return nums.stream().filter( i -> i%2 ==0 ).collect(Collectors.toList());
    }



    public static List<Integer> doubleList (List<Integer> nums) {
        return nums.stream().map(a ->a*a).toList(); //good
    }

    public static void revSortFns (List<Integer> nums) {

        nums.stream().sorted(Comparator.reverseOrder()).forEach( System.out::println );
    }

    public static void sortFns (List<Integer> nums) {

            nums.stream().sorted().forEach( System.out::println );
//            nums.stream().distinct().forEach( System.out::println );
    }
    public static int SumOfOddNumbersInList (List<Integer> nums){
        return nums.stream().filter( n -> n%2 !=0 ).reduce(0, (x,y) -> x+y ); //37
    }

    public static int CubeAllNumsAndFindtheSumofSquares (List<Integer> nums){
        return nums.stream().map( s -> s*s*s ).reduce(0, (x,y) -> x+y );
    }

    public static int squareAllNumsAndFindtheSumofSquares (List<Integer> nums){
                return nums.stream().map( s -> s*s ).reduce(0, (x,y) -> x+y );

    }
    public static int findMAx(int a, int  b){
        if (a > b) return a; else return b;
    }
    public static int findMAxInList(List<Integer> nums) {

        return nums.stream().reduce(Integer.MAX_VALUE, (x,y) -> x>y? y:x   );
//        return nums.stream().reduce(0, (x,y) -> x>y? y:x   );
//       return nums.stream().reduce(0, fl10_jay::findMAx  );
    }


//Good
    public static int addListStructured2(List<Integer> nums) {
        return nums.stream().reduce(0, (a,b) -> a+b  );
    }


    public static int sum(int a, int b){
        System.out.println(" a ="+ a + " b="  + b );
        return a + b;
    }

    public static int addListStructured(List<Integer> nums) {
        return nums.stream().reduce(0, fl10_jay:: sum);
    }


}

