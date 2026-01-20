class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int f=findfirst(nums,target);
        int l=findlast(nums,target);
        
        //put two times binary search
       
        
        return new int[]{f,l};
       
         



    }
    int findfirst(int nums[],int target){
        int start=0;
        int last=nums.length-1;
        
        int ans=-1;
        while(start<=last){
            int mid=start+(last-start)/2;
            if(nums[mid]==target){
                ans=mid;
                last=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return ans;



    }
    int findlast(int nums[],int target){
        int start=0;
        int last=nums.length-1;
       
        int ans=-1;
        while(start<=last){
            int mid=start+(last-start)/2;
            if(nums[mid]==target){
                ans=mid;
                start=mid+1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return ans;


        


    }
}