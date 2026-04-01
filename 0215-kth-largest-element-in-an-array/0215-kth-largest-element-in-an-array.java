class Solution {
    public int findKthLargest(int[] nums, int k) {
         PriorityQueue<Integer> pq=new PriorityQueue<>();
         for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
            //pol -1 nhi deta queue agar khali ho remove will gives
            if(i>=k)pq.poll();
         }
         return pq.peek();
    }
}