class Solution {
    public boolean isAnagram(String s, String t) {

    //For Upper and Lower Mixed Letter
    s=s.toLowerCase();
    t=t.toLowerCase();

    //Remove All space
    s=s.replace(" ","");
    t=t.replace(" ","");
    
     int[] counts = new int[26];
     for(int i=0;i<s.length();i++){
        counts[s.charAt(i) - 'a']++;
     }   
     for(int i=0;i<t.length();i++){
        counts[t.charAt(i) - 'a']--;
     }
     for(int x : counts){
        if(x!=0)
        return false;
     }
     return true;
    }
}