package DynamicProgramming.LongestCommonSubstring;

// Recursion.java
public class Recursion {
    public static int longestCommonSubstring(String s1, String s2, int n, int m, int count) {
        if (n == 0 || m == 0) {
            return count;
        }

        if (s1.charAt(n-1) == s2.charAt(m-1)) {
            count = longestCommonSubstring(s1, s2, n-1, m-1, count+1);
        }

        count = Math.max(count, Math.max(longestCommonSubstring(s1, s2, n-1, m, 0), longestCommonSubstring(s1, s2, n, m-1, 0)));

        return count;
    }

    public static void main(String[] args) {
        String s1 = "abcdgh";
        String s2 = "abedfhr";

        System.out.println(longestCommonSubstring(s1, s2, s1.length(), s2.length(), 0));
    }
}

