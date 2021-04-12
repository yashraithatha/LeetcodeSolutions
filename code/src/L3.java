public class Solution {
    // TC -> O(n), SC -> O(1)
    public int lengthOfLongestSubstring(String s) {
        int charToIndexMap[] = new int[256];
        int begin  = 0;
        int len = 0;
        Arrays.fill(charToIndexMap,-1);

        for(int i=0; i < s.length(); i++){
            if(charToIndexMap[s.charAt(i)] != -1){
                begin = Math.max(begin,charToIndexMap[s.charAt(i)] + 1);
            }
            charToIndexMap[s.charAt(i)] = i;
            len = Math.max(len, i - begin + 1);
        }
        return len;
    }
}
