class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;

        int[] previousSmaller = new int[n];
        int[] nextSmaller = new int[n];

        Arrays.fill(previousSmaller, -1);
        Arrays.fill(nextSmaller, n);

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                previousSmaller[i] = stack.peek();
            }
            stack.push(i);
        }

        stack.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                nextSmaller[i] = stack.peek();
            }
            stack.push(i);
        }

        final int MOD = (int) 1e9 + 7;
        long result = 0;

        for (int i = 0; i < n; i++) {
            long leftCount = i - previousSmaller[i];
            long rightCount = nextSmaller[i] - i;

            long contribution = (leftCount * rightCount % MOD) * arr[i] % MOD;
            result = (result + contribution) % MOD;
        }

        return (int) result;
    }
}