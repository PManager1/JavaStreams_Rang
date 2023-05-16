package programming;

import java.util.List;

public class fl25_jay {

     class Course {
         private String name;
         private String category;
         private int reviewScore;
         private int noOfStudents;

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }

         public String getCategory() {
             return category;
         }

         public void setCategory(String category) {
             this.category = category;
         }

         public int getReviewScore() {
             return reviewScore;
         }

         public void setReviewScore(int reviewScore) {
             this.reviewScore = reviewScore;
         }

         public int getNoOfStudents() {
             return noOfStudents;
         }

         public void setNoOfStudents(int noOfStudents) {
             this.noOfStudents = noOfStudents;
         }
     }

    public static void main(String[] args) {

        List l1 = List.of(
                new Course("Spring", "Framework". 98, 2000),
                new Course("Spring", "Framework". 98, 2000)

        )
    }

}
