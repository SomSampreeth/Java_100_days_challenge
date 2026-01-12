package Day8;

import java.util.HashMap;

public class JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Store jewels
        for (int i = 0; i < jewels.length(); i++) {
            char ch = jewels.charAt(i);
            map.put(ch, 1);
        }

        // Count stones that are jewels
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            char ch = stones.charAt(i);
            if (map.containsKey(ch)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        int result = numJewelsInStones(jewels, stones);
        System.out.println(result); // Expected output: 3
    }
}
