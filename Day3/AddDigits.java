package Day3;

public class AddDigits {

    public static int addDigits(int num) {

        int sum;

        while (num > 9) {
            sum = 0;

            while (num != 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }

            num = sum;
        }

        return num;
    }

    public static void main(String[] args) {
        int num = 38;
        int result = addDigits(num);
        System.out.println(result); // Output: 2
    }
}

