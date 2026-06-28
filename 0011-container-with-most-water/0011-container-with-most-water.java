class Solution {
    public int maxArea(int[] height) {

        int right = 0;
        int left = height.length - 1;
        int maxArea = 0;

        while (right < left) {

            int area = (left - right) * Math.min(height[right], height[left]);

            maxArea = Math.max(maxArea, area);

            if (height[right] > height[left]) {
                left--;
            } else {
                right++;
            }
        }

        return maxArea;
    }
}