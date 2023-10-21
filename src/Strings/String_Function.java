package Strings;

public class String_Function {

    public static String subString(String str, int si, int ei){
        String substr = "";
        for (int i = si; i < ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {

        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String("tony");

        if(s1 == s2){
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }

        if(s1 == s3){
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }

//        String equal function
        if (s1.equals(s2)){
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }

        if (s1.equals(s3)){
            System.out.println("Strings are equal");  // because equals function only check value
        }else {
            System.out.println("Strings are not equal");
        }


//        substring function
        System.out.println("Substring by predefined function : ");
        String s4 = s1.substring(1,3);
        System.out.println(s4);

        String str = "HelloWorld";

        System.out.println("Substring by User defined function : ");
        System.out.println(subString(str,0,5));;



    }
}
