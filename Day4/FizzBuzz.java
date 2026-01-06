package Day4;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add("" + i);
            }
        }
        return list;
    }

    // ✅ main method MUST be inside the class
    public static void main(String[] args) {
        //the method is staitc so we not created object here 
        int num = 15;
        List<String> result = fizzBuzz(num);
        System.out.println(result);
    }
}
