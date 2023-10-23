package Oops.Constructor;

public class Constructor {

    public static void main(String[] args) {

        student s1 = new student();

        student s2 = new student("Vishal");
        System.out.println(s2.name);

        student s3 = new student(2);
        System.out.println(s3.roll);


        student s4 = new student();
        s4.name = "VkSingh";
        s4.roll = 1;
        s4.marks[0] = 99;
        s4.marks[1] = 98;
        s4.marks[2] = 97;

        student s5 = new student(s4);
        s5.password = "xyz";
        s5.marks[1] = 55;

        for(int i = 0; i < 3; i++){
            System.out.println(s5.marks[i]);
        }

    }
}

class student{
    String name;
    int roll;
    int[] marks = new int[3];
    String password;

    student(){           // Non-parameterized constructor
        System.out.println("Constructor is called.....");
    }

    student(String name){  // Parameterized constructor
        this.name = name;
    }

    student(int roll){      // Parameterized constructor
        this.roll = roll;
    }

//    copy constructor
    student(student s4){
        marks = new int[3];
        this.name = s4.name;
        this.roll = s4.roll;
        this.marks = s4.marks;
    }


}


