class Solution {

    int intervals[][];
    Result dp[][];

    class Result {
        long score;
        List<Integer> indices;

        Result(long score, List<Integer> indices) {
            this.score = score;
            this.indices = indices;
        }
    }

    public int[] maximumWeight(List<List<Integer>> intervals) {

        int n = intervals.size();

        this.intervals = new int[n][4];

        for (int i = 0; i < n; i++) {
            this.intervals[i][0] = intervals.get(i).get(0);
            this.intervals[i][1] = intervals.get(i).get(1);
            this.intervals[i][2] = intervals.get(i).get(2);
            this.intervals[i][3] = i;
        }

        Arrays.sort(this.intervals, (a, b) -> a[0] - b[0]);

        dp = new Result[n][5];

        Result ans = solve(0, 4);

        int result[] = new int[ans.indices.size()];

        for (int i = 0; i < ans.indices.size(); i++) {
            result[i] = ans.indices.get(i);
        }

        Arrays.sort(result);

        return result;
    }

    Result solve(int i, int k) {

        // base case
        if (i >= intervals.length || k == 0) {
            return new Result(0, new ArrayList<>());
        }

        // already calculated
        if (dp[i][k] != null) {
            return dp[i][k];
        }

        // SKIP
        Result skip = solve(i + 1, k);

        // TAKE
        int next = findnext(i);

        Result nextResult = solve(next, k - 1);

        long takeScore = intervals[i][2] + nextResult.score;

        List<Integer> takeIndices = new ArrayList<>();

        takeIndices.add(intervals[i][3]);
        takeIndices.addAll(nextResult.indices);

        Result take = new Result(takeScore, takeIndices);

        // Take has better score
        if (take.score > skip.score) {
            return dp[i][k] = take;
        }

        // Skip has better score
        if (take.score < skip.score) {
            return dp[i][k] = skip;
        }

        // Same score
        // Choose lexicographically smaller answer
        if (isSmaller(take.indices, skip.indices)) {
            return dp[i][k] = take;
        } else {
            return dp[i][k] = skip;
        }
    }

    int findnext(int i) {

        int end = intervals[i][1];

        int low = i + 1;
        int high = intervals.length;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (intervals[mid][0] > end) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    boolean isSmaller(List<Integer> a, List<Integer> b) {

        List<Integer> x = new ArrayList<>(a);
        List<Integer> y = new ArrayList<>(b);

        Collections.sort(x);
        Collections.sort(y);

        int n = Math.min(x.size(), y.size());

        for (int i = 0; i < n; i++) {

            if (!x.get(i).equals(y.get(i))) {
                return x.get(i) < y.get(i);
            }
        }

        return x.size() < y.size();
    }
}