class Solution {
    private static final long LIMIT = 1_000_000_000_000_000_000L;

    public String smallestPalindrome(String s, int k) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        String mid = "";
        int[] half = new int[26];
        int len = 0;
        for (int i = 0; i < 26; i++) {
            if ((freq[i] & 1) == 1) {
                mid = String.valueOf((char) ('a' + i));
            }
            half[i] = freq[i] / 2;
            len += half[i];
        }

        long total = countWays(half, len);
        if (total < k)
            return "";

        StringBuilder left = new StringBuilder();
        while (len > 0) {
            for (int c = 0; c < 26; c++) {
                if (half[c] == 0)
                    continue;
                half[c]--;
                long ways = countWays(half, len - 1);
                if (ways >= k) {
                    left.append((char) ('a' + c));
                    len--;
                    break;
                } else {
                    k -= ways;
                    half[c]++;
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        ans.append(left);
        ans.append(mid);
        ans.append(new StringBuilder(left).reverse());
        return ans.toString();
    }

    // Number of distinct arrangements of the multiset described by `half`,
    // using exactly `total` characters. Capped at LIMIT to avoid overflow.
    private long countWays(int[] half, int total) {
        long res = 1;
        int remaining = total;
        for (int i = 0; i < 26; i++) {
            int cnt = half[i];
            if (cnt == 0)
                continue;
            long nCr = nCrLimited(remaining, cnt);
            // guard BEFORE multiplying
            if (res > LIMIT / Math.max(nCr, 1)) {
                return LIMIT;
            }
            res *= nCr;
            if (res > LIMIT)
                return LIMIT;
            remaining -= cnt;
        }
        return Math.min(res, LIMIT);
    }

    // C(n, r), capped at LIMIT, with overflow-safe multiplication.
    private long nCrLimited(int n, int r) {
        if (r > n)
            return 0;
        r = Math.min(r, n - r);
        long ans = 1;
        for (int i = 1; i <= r; i++) {
            long numerator = n - r + i;
            // guard BEFORE multiplying to avoid long overflow
            if (ans > LIMIT / numerator) {
                ans = LIMIT + 1;
            } else {
                ans = ans * numerator / i;
            }
            if (ans > LIMIT)
                return LIMIT;
        }
        return Math.min(ans, LIMIT);
    }
}