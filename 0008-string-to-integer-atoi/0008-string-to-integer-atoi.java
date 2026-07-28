class Solution {
    public int myAtoi(String s) {
        
        s = s.trim();
        int result = 0;

        if (s.length() == 0) {
            return 0;
        }
        
        for (int i = 0; i < s.length(); i++) {

            if (i == 0 && s.charAt(i) == '-') {

                for (i = 1; i < s.length(); i++) {
                    if (!Character.isDigit(s.charAt(i))) {
                        break;
                    }
                    int digit = s.charAt(i) - '0'; // CHANGED

                    // CHANGED: Check overflow
                    if (result > (Integer.MAX_VALUE - digit) / 10) {
                        return Integer.MIN_VALUE;
                    }

                    result = result * 10 + digit; // CHANGED
                }

                return -result;
            }

            else if (i == 0 && s.charAt(i) == '+') {
                continue;
            }

            else if (!Character.isDigit(s.charAt(i))) {
                break;
            }

            else {
                int digit = s.charAt(i) - '0'; // CHANGED

                    // CHANGED: Check overflow
                    if (result > (Integer.MAX_VALUE - digit) / 10) {
                        return Integer.MAX_VALUE;
                    }

                    result = result * 10 + digit; // CHANGED
            }
        }

        return result;
    }
}