package Day14;

public class FirstBadVersion {

    // Simulating the first bad version (LeetCode does this internally)
    static int firstBad = 4;   // you can change this to test

    // Mock API (LeetCode already provides this)
    public static boolean isBadVersion(int version) {
        return version >= firstBad;
    }

    // Method to find first bad version
    public static int firstBadVersion(int n) {

        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;       // first bad is at mid or before
            } else {
                left = mid + 1;    // first bad is after mid
            }
        }

        return left;
    }

    // main method for VS Code testing
    public static void main(String[] args) {

        int n = 5;  // total versions
        int result = firstBadVersion(n);

        System.out.println("First bad version is: " + result);
    }
}
