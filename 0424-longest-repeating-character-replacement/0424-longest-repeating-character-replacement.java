class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int e=0;
        int maxlength=0;int maxfreq=0;
        int[]fr=new int[26];
        while(e<s.length()){
            fr[s.charAt(e)-'A']++;
            //maxfreq++;
            maxfreq=Math.max(maxfreq,fr[s.charAt(e)-'A']);
            while(e-l+1-maxfreq>k){
                fr[s.charAt(l)-'A']--;
                l++;
            }
            maxlength=Math.max(maxlength,e-l+1);
            e++;

        }
        return maxlength;
    }
}