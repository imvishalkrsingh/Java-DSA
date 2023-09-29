package Arrays.singleDimensional;

class newArray{
    void demoArray(){
        int [] ages = new int[3];
        float [] weight = new float[3];
        String [] names = new String[3];

        ages[0] = 10;
        ages[1] = 20;
        ages[2] = 30;

        weight[0] = 30.1F;
        weight[1] = 40.1F;
        weight[2] = 50.1F;

        names[0] = "Vishal";
        names[1] = "Aman";
        names[2] = "Bhim";

        System.out.println("Age of 1 : " + ages[0]);
        System.out.println("Age of 2 : " + ages[1]);
        System.out.println("Age of 3 : " + ages[2]);

        System.out.println("weight of 1 : " + weight[0]);
        System.out.println("weight of 2 : " + weight[1]);
        System.out.println("weight of 1 : " + weight[2]);

        System.out.println("Name of 1 : " + names[0]);
        System.out.println("Name of 2 : " + names[1]);
        System.out.println("Name of 3 : " + names[2]);

    }
}

public class arraysExample {
    public static void main(String[] args) {

        newArray object = new newArray();
        object.demoArray();


    }
}
