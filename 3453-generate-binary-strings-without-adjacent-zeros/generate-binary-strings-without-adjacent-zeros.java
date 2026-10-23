class Solution {
    private void helper(int n, ArrayList<String> ans,int lastplace, String str){
        if(n==0){
            ans.add(str);
            return;
        }
        else if(lastplace == 1){
            helper(n-1, ans, 0, str+"0");
            helper(n-1, ans, 1, str+"1");
        }
        else{
            helper(n-1, ans, 1, str+"1");
        }
    }
    public List<String> validStrings(int n) {
        ArrayList<String> ans = new ArrayList<>();
        helper(n, ans, 1, "");
        return ans;
    }
}