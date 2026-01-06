package Day5;

public class NumberOfSteps {

    public static int numberOfSteps(int num) {
        int count = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            count++;
        }
        return count;
    }

    // main method for VS Code testing
    public static void main(String[] args) {
        int num = 14;
        int result = numberOfSteps(num);
        System.out.println(result); // Expected output: 6
    }
}

