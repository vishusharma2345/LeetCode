class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0;
        int maxlength=0;
        int zerocount=0;
        //yha i end ko refer krega:
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                zerocount++;
            }
            while(zerocount>k){
                if(nums[start]==0){
                    zerocount--;
                }
                start++;
            }
            int size=i-start+1;
            maxlength=Math.max(maxlength,size);
        }
        return maxlength;
    }
}