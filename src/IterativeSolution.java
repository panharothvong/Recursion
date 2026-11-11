public class IterativeSolution {
    // tri(int n)
    public int tri(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }

        int result = 0;
        for (int i = n; i > 0; i--){
            if(result > Integer.MAX_VALUE - i){
                throw new ArithmeticException("Number is too large");
            }
            result = result + i;
        }
        return result;
    }

    // fact(int n)
     public int fact (int n){
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }

        int result = 1;
        for (int i = n; i > 0; i--){
            if(result > Integer.MAX_VALUE / i){
                throw new ArithmeticException("Number is too large");
            }
            result = result * i;
        }
        return result;
    }
    
    // fib(int n)
    // reverseStr(String str)
    public static String reverseString(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        char[] chars = str.toCharArray();
        int first = 0;
        int last = chars.length - 1;
        while (first < last) {
            char temp = chars[first];
            chars[first] = chars[last];
            chars[last] = temp;
            first++;
            last--;

        }
        return new String(chars);
    }
    // hasChar(String str, char c)


    // gcd(int x1, int x2)
    // countUniquePaths(int n, int m)

        public static int countUniquePaths(int n, int m){
        if (n <= 0 || m <= 0) {
            return 0;
        }
        if (n == 1 && m == 1) {
            return 1;
        }
        if (n> 17 || m> 17){
            throw new IllegalArgumentException("Dimensiomns are too large");
        }
        long [][] grid = new long[n][m];
        for (int i = 0; i < n; i++){
            for(int j=0; j < m; j++){
                if(i==0 || j==0){
                    grid[i][j] = 1;
                }
                else {
                    grid[i][j] = grid[i-1][j] + grid[i][j-1];
                }
            }
        }
        return Math.toIntExact(grid[n - 1][m - 1]);
    }
}

