package substring_search;

public class BruteForceSearch {
    public static int search(String pat, String txt) {
        int m = pat.length();
        int n = txt.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j))
                    break;
            }
            if (j == m) return i;
        }
        return n;
    }
}
