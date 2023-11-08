package ArrayList;
import java.util.ArrayList;
public class FindMaximum {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(9);
        list.add(11);
        list.add(34);
        list.add(54);
        list.add(4);

        System.out.println("Array list : " + list);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }

        // One line code
        int maxx = Integer.MIN_VALUE;
        System.out.println("Simple method");
        for (int i = 0; i < list.size(); i++){
            maxx = Math.max(max, list.get(i));
        }

        System.out.println("Max element : " + max);
        System.out.println("Max element : " + maxx);
    }
}
