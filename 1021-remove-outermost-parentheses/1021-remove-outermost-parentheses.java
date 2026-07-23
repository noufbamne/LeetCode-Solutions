class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();

        int level =0;

        char [] a = s.toCharArray();

        for(char i : a){
            if(i == '('){
                if (level > 0) result.append(i);
                level++;
            }

            else if(i == ')'){
                level--; 
                if(level > 0) result.append(i);
                
            }
        }
        return result.toString();
    }
}