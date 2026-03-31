class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count=0; int mx=0; 
        for(int i=0; i<nums.length; i++){
            int sum=0;
            for(int j=i; j<nums.length; j++){
                sum= sum+nums[j];
                if(sum==goal){
                    count++;
                }
                
                
            }
            mx=Math.max(mx,count);
        }
        return mx;
    }
}