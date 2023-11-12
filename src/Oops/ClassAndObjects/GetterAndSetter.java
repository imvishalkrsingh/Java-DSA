package Oops.ClassAndObjects;

public class GetterAndSetter {

    public String name;
    private int rno;
    double percent;

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public static void main(String[] args) {
        // Creating an instance of the Student class
        GetterAndSetter student1 = new GetterAndSetter();

        // Setting values using setter methods
        student1.name = "John Doe";
        student1.setRno(101);
        student1.percent = 85.5;

        // Getting values using getter methods
        System.out.println("Student Name: " + student1.name);
        System.out.println("Roll Number: " + student1.getRno());
        System.out.println("Percentage: " + student1.percent);
    }
}
