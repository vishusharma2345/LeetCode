class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] ch=s1.toCharArray();
       int k=ch.length;
       for(int i=0; i<=s2.length()-k; i++){
        String sub=s2.substring(i,i+k);
        if (isanagram(s1,sub)){
            return true;

        }}
       return false;
       }
    


       
       public static boolean isanagram(String s1, String s2){
       int []fr1=new int[26];
       for(char ch:s1.toCharArray()){
        fr1[ch-'a']++;
       }
       int [] fr2=new int [26];
       for(char ch:s2.toCharArray()){
        fr2[ch-'a']++;
       }
       return Arrays.equals(fr1,fr2);
       }
        
}
