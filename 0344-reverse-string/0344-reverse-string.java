class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j){
            //[1,2]
            char temp= s[i]; //temp=1
            s[i]=s[j]; //s[i]==[2,2]
            s[j]=temp;
            i++;
            j--;


        }
    }
}