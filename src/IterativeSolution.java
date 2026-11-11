public class IterativeSolution {
    // tri(int n)
    // fact(int n)
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
}
