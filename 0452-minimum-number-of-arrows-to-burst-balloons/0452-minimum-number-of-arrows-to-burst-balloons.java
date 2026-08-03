class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(point -> point[1]));
      
        int arrowCount = 0;
      
        long lastArrowPosition = -(1L << 60);
      
        for (int[] balloon : points) {
            int startPosition = balloon[0];
            int endPosition = balloon[1];
            if (startPosition > lastArrowPosition) {
                arrowCount++;
                lastArrowPosition = endPosition;
            }
        }
      
        return arrowCount;
    }
}