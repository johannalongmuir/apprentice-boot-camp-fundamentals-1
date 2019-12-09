import java.util.ArrayList;
import java.util.List;

public class Scratch {

    public static void main(String[] args) {


//        Object[][][] cubbies = new Object[3][][];
//        cubbies[0] = new Object[2][];
//
//        for (Object a: cubbies) {
//
//        }
//        System.out.println("cubbies = " + cubbies);


        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(null);
        for (int age : ages) System.out.print(age);
    }
}
