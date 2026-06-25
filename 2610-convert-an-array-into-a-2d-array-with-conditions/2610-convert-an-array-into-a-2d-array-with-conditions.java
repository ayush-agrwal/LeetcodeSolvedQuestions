class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {

        Map<Integer, Integer> freq = new HashMap<>();

        int maxFreq = 0;

        for (int num : nums) {
            int count = freq.getOrDefault(num, 0) + 1;
            freq.put(num, count);

            maxFreq = Math.max(maxFreq, count);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < maxFreq; i++) {
            ans.add(new ArrayList<>());
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {

            int num = entry.getKey();
            int count = entry.getValue();

            for (int row = 0; row < count; row++) {
                ans.get(row).add(num);
            }
        }

        return ans;
    }
}