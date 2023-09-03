package BasicsOfJava;

public class Percentage_Of_5_Subjects {
    public static void main(String[] args) {
//        Marks of subjects ......
        double physics = 90;
        double chemistry = 91;
        double maths = 92;
        double english = 93;
        double hindi = 94;

        double totalMarks = (physics + chemistry + maths + english + hindi);
        System.out.println(totalMarks);

        double percentage = totalMarks / 5;
        System.out.println(percentage);
    }
}
