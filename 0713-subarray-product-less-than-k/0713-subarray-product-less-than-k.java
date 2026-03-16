class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        //sliding window single variation
        int prod=1;
        int count=0;
        int start=0;
        for(int i=0; i<nums.length; i++){
            prod=prod*nums[i];
            while(prod>=k &&start<=i){
                prod/=nums[start++];


            }
            count+=(i-start+1);
        }
        return count;
    }
}