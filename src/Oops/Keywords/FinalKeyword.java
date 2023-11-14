package Oops.Keywords;
/*
Final keyword :-> When you declared a variable as final it means that it's value can not be changed, once it's assigned.
 */
public class FinalKeyword {

    public class Student{
        String name;
        int roll;
        double percent;

        final String college = "SAGE";

        public Student(String name, int roll, double percent){
            this.name = name;
            this.roll = roll;
            this.percent = percent;
//            this.college = college;  ----- You can not reassign a value to the college variable because of final keyword.
        }

    }

    public static void main(String[] args) {
        FinalKeyword.Student s1 = new FinalKeyword().new Student("Vishal", 24, 98.2);
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.percent);
        System.out.println(s1.college);
    }
}
