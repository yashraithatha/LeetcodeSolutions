public class Solution {
    public String convert(String s, int numRows) {
        StringBuffer arr[] = new StringBuffer[numRows];
        int i=0;
        while(i < s.length()){
            int j = 0;
            while(j < numRows && i < s.length()){
                if(arr[j] == null){
                    arr[j] = new StringBuffer();
                }
                arr[j].append(s.charAt(i++));
                j++;
            }

            int k = numRows - 2;
            while(k > 0 && i < s.length()){
                arr[k].append(s.charAt(i++));
                k--;
            }
        }

        for(int m=1; m < numRows; m++ ){
            if(arr[m] != null){
                arr[0].append(arr[m].toString());
            }
        }
        return arr[0].toString();
    }
}

  