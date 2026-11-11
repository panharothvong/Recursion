public class IterativeSolution {
    // tri(int n)
    // fact(int n)
    // fib(int n)
    // reverseStr(String str)
    // hasChar(String str, char c)
    // gcd(int x1, int x2)
    // countUniquePaths(int n, int m)
    public int countUniquePaths(int m, int n){
        long [][] grid = new long[m][n];
        for (int i = 0; i < m; i++){
            for(int j=0; j < n; j++){
                if(i==0 || j==0){
                    grid[i][j] = 1;
                }
                else {
                    grid[i][j] = grid[i-1][j] + grid[i][j-1];
                }
            }
        }
        return Math.toIntExact(grid[m - 1][n - 1]);
    }
}
