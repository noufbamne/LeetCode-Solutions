class Solution {
    public int maxDepth(String s) {
        int cnt = 0;
        int maxDepth = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                cnt++;
                maxDepth = Math.max(maxDepth, cnt);
            }
            else if(ch == ')'){
                cnt--;
            }
            else{
                continue;
            }
        }
        return maxDepth;
    }
}