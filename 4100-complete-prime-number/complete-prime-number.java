class Solution {
    public boolean completePrime(int num) {
        if (num < 2) return false;

        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count += 1;
                if (num / i != i) count += 1;
            }
        }
        if (count != 2) return false;

        int divisor = 1;
        while (divisor <= num / 10) divisor *= 10;

        int prefix = 0, temp = num;
        while (divisor > 0) {
            prefix = prefix * 10 + temp / divisor;
            count = 0;

            for (int i = 1; i * i <= prefix; i++) {
                if (prefix % i == 0) {
                    count++;
                    if (prefix / i != i) count++;
                }
            }

            if (count != 2) return false;

            temp %= divisor;
            divisor /= 10;
        }

        temp = num;
        while (temp > 0) {
            count = 0;
            for (int i = 1; i * i <= temp; i++) {
                if (temp % i == 0) {
                    count++;
                    if (temp / i != i) count++;
                }
            }

            if (count != 2) return false;

            int p = 1;
            while (p <= temp / 10) p *= 10;
            temp %= p;
        }

        return true;
    }
}