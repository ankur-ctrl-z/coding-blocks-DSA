// package Lec43;

public class Edit_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "FOOD";
		String t = "MONEY";
		long[][] dp;
		dp = new long[s.length()][t.length()];
        for (int i = 0; i < s.length(); i++) {
            Arrays.fill(dp[i], -1);
        }
		System.out.println((int) count(s, t, 0, 0));
	}

        public long count(String s, String t, int i, int j) {
        if (j == t.length()) return 1;
        if (i == s.length()) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        long inc = 0, exc;

        if (s.charAt(i) == t.charAt(j)) {
            inc = count(s, t, i + 1, j + 1);
        }

        exc = count(s, t, i + 1, j);

        return dp[i][j] = inc + exc;
    }

}
