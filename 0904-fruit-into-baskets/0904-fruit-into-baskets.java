class Solution {
    public int totalFruit(int[] fruits) {
        
        int type=0;
        int max=0;
        int start=0;
        //size has taken of fr array due to constraints of question
        int []fr=new int[100001];
        //here i is referring to the end point of the fruits array
        for(int i=0; i<fruits.length; i++){
            int f=fruits[i];
            if(fr[f]==0){
                type++;
            }
            fr[f]++;
            while(type>2){
                int sf=fruits[start];
                fr[sf]--;
                if(fr[sf]==0){
                    type--;
                }
                start++;
            }
            int size=i-start+1;
            max=Math.max(max,size);
        }
        return max;
    }
}