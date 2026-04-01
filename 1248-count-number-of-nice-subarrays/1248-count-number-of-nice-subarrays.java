class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
    public int atmost(int[]nums,int k){
        int start=0; int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2!=0){
                k--;
            }
            while(k<0){
                if(nums[start]%2!=0){
                    k++;
                }
                start++;
            }
           
            count+=i-start+1;
        }
        return count;
    }
}