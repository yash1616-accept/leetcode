class Solution {
    public long countCommas(long n) {
        long lower = 1000;
        long result = 0;
        long commas = 1;
        while (lower <= n) {
            long upper = lower * 1000 - 1;
            if (upper > n)
                upper = n;
            long countnos = upper - lower + 1;
            result += countnos * commas;
            lower *= 1000;
            commas ++;
        }
        return result;
    }
}