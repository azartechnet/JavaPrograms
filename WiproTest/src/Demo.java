class Main
{
    // Function to count number of times the pattern Y[0..n)
    // appears in given String X[0..m) as a subsequence
    public static int count(String X, String Y, int m, int n)
    {
        // T[i][j] stores number of of times the pattern Y[0..j)
        // appears in given String X[0..i) as a subsequence
        int[][] T = new int[m + 1][n + 1];
 
        // if pattern Y is empty, we have found subsequence
        for (int i = 0; i <= m; i++) {
            T[i][0] = 1;
        }
 
        // If current character of both String and pattern matches,
        // 1. exclude current character in both String and pattern
        // 2. exclude only current character in the String
 
        // else if current character of String and pattern do not match,
        // exclude current character in the String
 
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++){
                T[i][j] = ((X.charAt(i-1) == Y.charAt(j-1)) ? T[i-1][j-1] : 0)
                            + T[i-1][j];
            }
        }
 
        // return last entry in lookup table
        return T[m][n];
    }
 
    public static void main(String[] args)
    {
        String X = "wipro";   // input String
        String Y = "technology";        // pattern
 
        System.out.print(count(X, Y, X.length(), Y.length()));
 
    }
}