public class RecursiveSolution {
    // tri(int n)
    // fact(int n)
    // fib(int n)
    // reverseStr(String str)
    public static String reverseString(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        char[] chars = str.toCharArray();
        reverseHelper(chars, 0, chars.length- 1);
        return new String(chars);

    }

    public static void reverseHelper(char[] chars, int first, int last) {
        if (first >= last) {
            return;
        }
        char temp = chars[first];
        chars[first] = chars[last];
        chars[last] = temp;
        reverseHelper(chars, first + 1, last - 1 );

    }
    // hasChar(String str, char c)

    public static boolean hasChar(String str, char c) {
        if (str == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        return hasCharHelper(str, c, 0);
    }

    public static boolean hasCharHelper(String str, char c, int index) {
        if (index >= str.length()) {
            return false;
        }
        if (str.charAt(index) == c) {
            return true;
        }
        return hasCharHelper(str, c, index + 1);
    }
    // gcd(int x1, int x2)

    // countUniquePaths(int n, int m)
    public static int countUniquePaths(int n, int m ){
        return paths (0,0, n,m);
    }


    private static int paths (int i, int j, int n, int m){
        if (i == n-1 && j == m-1) return 1;
        if (i >= n || j>=m) return 0;
        return paths(i+1, j, n, m) + paths(i, j+1, n, m);
    }
}
