package algorithms.data.structures.substring_search;

public class BoyerMoore {
    public int search(String txt, String pat) {
        int N = txt.length();
        int M = pat.length();

        int[] right = new int[26];
        for (int c = 0; c < 26; c++) {
            right[c] = -1;
        }
        for (int j = 0; j < M; j++) {
            right[pat.charAt(j) - 'A'] = j;
        }

        int skip;
        for (int i = 0; i <= N - M; i += skip) {
            skip = 0;
            for (int j = M - 1; j >= 0; j--) {
                if (pat.charAt(j) != txt.charAt(i + j)) {
                    skip = Math.max(1, j - right[txt.charAt(i + j)]);
                    break;
                }
            }

            if (skip == 0) return i;
        }

        return N;
    }
}
