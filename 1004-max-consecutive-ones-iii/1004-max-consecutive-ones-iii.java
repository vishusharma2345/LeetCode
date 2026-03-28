class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0;
        int max=0;
        int zero=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0)zero++;
    
            while(zero>k){
                if(nums[start]==0){zero--;
                nums[start]=1;
                }
                start++;
            }
            int size=i-start+1;
            max=Math.max(size,max);
        }
        return max;
        
    }
}