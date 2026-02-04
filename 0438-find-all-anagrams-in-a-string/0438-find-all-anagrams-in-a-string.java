class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>res=new ArrayList<Integer>();
        
        int[] f1=new int[26];
        int k=p.length();
        for(char ch:p.toCharArray()){
            f1[ch-'a']++;
        }

        int[] f2=new int[26];
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            f2[ch-'a']++;
            if(i<k-1) continue;
            if(Arrays.equals(f1,f2)) res.add(i-k+1);
            int sin=i-(k-1);
            char r=s.charAt(sin);
            f2[r-'a']--;
        }
        return res;
    }
}