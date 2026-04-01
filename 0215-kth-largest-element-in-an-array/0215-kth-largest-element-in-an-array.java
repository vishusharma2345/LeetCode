class Solution {
    public int findKthLargest(int[] nums, int k) {
         PriorityQueue<Integer> pq=new PriorityQueue<>();
         for(int i=0; i<nums.length; i++){  //o(n)
            pq.add(nums[i]); //logk
            //pol -1 nhi deta queue agar khali ho remove will gives
            if(i>=k)pq.poll(); //log n sab plus ho jayenge
         }
         return pq.peek();
         // therfore tc= nlogk   = log n
    }
}