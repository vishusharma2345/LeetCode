class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0; int start=0;
        int []fr=new int[256];
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            fr[ch]++; 
            //to check valid window when 
            while(fr[ch]>1){
                char sh=s.charAt(start++);
                fr[sh]--;
                //ye if window shrink kr rhi hogi

            }
            int size=i-start+1;
            max=Math.max(max,size);
            
        
        }
        return max;

        
    }
}