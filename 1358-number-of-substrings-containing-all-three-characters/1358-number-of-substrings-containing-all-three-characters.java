class Solution {
    public int numberOfSubstrings(String s) {
        int count=0; int start=0;
        int []fr=new int[3];
        for(int i=0; i<s.length(); i++){
            fr[s.charAt(i)-'a']++;
            while(fr[0]>0 && fr[1]>0 && fr[2]>0){
                count+=s.length()-i;
                fr[s.charAt(start)-'a']--;
                start++;
               

            }

        }
        return count;
    }
}