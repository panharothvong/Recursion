public class RecursiveSolution {
    // tri(int n)
    // fact(int n)
    // fib(int n)
    // reverseStr(String str)
    // hasChar(String str, char c)
    // gcd(int x1, int x2)
    // countUniquePaths(int n, int m)
    public int countUniquePaths(int m, int n ){
        return paths (0,0, m,n);
    }


    private int paths (int i, int j, int m, int n){
        if (i == m-1 && j == n-1) return 1;
        if (i >= m || j>=n) return 0;
        return paths(i+1, j, m, n) + paths(i, j+1, m, n);
    }
}
