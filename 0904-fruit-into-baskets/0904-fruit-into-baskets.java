class Solution {
    public int totalFruit(int[] fruits) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int s = 0;
        int max = 0;

        for(int e = 0; e < fruits.length; e++) {

            // add fruit in window
            map.put(fruits[e], map.getOrDefault(fruits[e], 0) + 1);

            // shrink window if types > 2
            while(map.size() > 2) {
                map.put(fruits[s], map.get(fruits[s]) - 1);

                if(map.get(fruits[s]) == 0) {
                    map.remove(fruits[s]);
                }
                s++;
            }

            // update answer
            max = Math.max(max, e - s + 1);
        }

        return max;
    }
}