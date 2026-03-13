class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> lis=new ArrayList<>();
        int[]f1=new int[26];
        int []f2=new int[26];
        for(char c:p.toCharArray()){
            f1[c-'a']++;
        }
        int k=p.length();
        for(int i=0; i<s.length(); i++){
            f2[s.charAt(i)-'a']++;
            if(i>=k){
                f2[s.charAt(i-k)-'a']--;
               
                
            }
            if(i >= k-1){
                if(Arrays.equals(f1,f2)){
                    lis.add(i - k + 1);
                }
        }
        }
             
        return lis;
    }
}