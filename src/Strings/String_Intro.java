package Strings;
import java.util.*;
public class String_Intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = "vishal";
        String str2 = new String("vishal kumar");

        System.out.print("Enter first name : ");
        String fName = sc.next();

        System.out.print("Enter middle name : ");
        String mName = sc.next();

        System.out.print("Enter last name : ");
        String lName = sc.next();

        String full_name = fName + mName + lName;

//      // length()
        System.out.println("Length of full Name :" + full_name.length());

//        concat()
        System.out.println("Concatination");
        System.out.println(str1.concat(lName));

        String Name = fName.concat(mName).concat(lName);
        System.out.println(Name);

//        charAt()
        System.out.println("CharAt 4 : " + full_name.charAt(4));

//        print full name with one space
        System.out.println("print full name with one space");
        for (int i = 0; i < full_name.length(); i++){
            System.out.print(full_name.charAt(i) + " ");
        }
    }
}
