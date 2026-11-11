public class RecursiveSolution {
    // tri(int n)
    // O(n)
    public int tri(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }

        if(n == 0){
            return 0;
        }

        int result = tri(n - 1);
        if(result > Integer.MAX_VALUE - n){
            throw new ArithmeticException("Number is too large");
        }

        return n + result;
    }
    
    // fact(int n)
    // O(n)
    public int fact(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }

        if(n <= 1){
            return 1;
        }

        int result = fact(n - 1);
        if(result > Integer.MAX_VALUE / n){
            throw new ArithmeticException("Number is too large");
        }

        return n * result;
    }
    
    // fib(int n)
    // O(n) time
    public static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        long[] memo = new long[n + 1];
        return (int) fibMemo(n, memo);
    }

    private static long fibMemo(int n, long[] memo) {
        if (n <= 1) {
            return n; 
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = fibMemo(n - 1, memo) + fibMemo(n - 2, memo);
        if (memo[n] > Integer.MAX_VALUE) {
            throw new ArithmeticException("Number is too large");
        }
        return memo[n];
    }

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
        if (n <= 0 || m <= 0) {
            return 0;
        }
        if (n == 1 && m == 1) {
            return 1;
        }
        if (n > 17 || m > 17){
            throw new IllegalArgumentException("Dimensiomns are too large");
        }
        return paths (0,0, n,m);

    }


    private static int paths (int i, int j, int n, int m){
        if (i == n-1 && j == m-1) {
            return 1;
        }
        if (i >= n || j>=m){
            return 0;
        }
        return paths(i+1, j, n, m) + paths(i, j+1, n, m);
    }
}
