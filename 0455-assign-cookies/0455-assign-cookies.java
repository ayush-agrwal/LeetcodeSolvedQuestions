class Solution {
    // Greedy Approach 
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int max = 0;
        int i = 0, j = 0;
        while(i < g.length  && j < s.length){
            if(g[i] <= s[j]){
                i += 1;
                j += 1;
                max += 1;
            }else{
                j += 1;
            }
        }
        return max;
    }
}