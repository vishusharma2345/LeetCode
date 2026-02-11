class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();

        List<Integer>lis=new ArrayList<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            int fr=map.get(i);
            if(fr>(n/3)){
                lis.add(i);

            }
        }
        return lis;
    }
}