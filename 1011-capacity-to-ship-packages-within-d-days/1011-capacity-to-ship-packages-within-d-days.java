class Solution {

    public int days(int [] weights, int capacity){

        int days = 1;
        int load = 0;

        for(int i = 0; i < weights.length; i++){
            
            if(load + weights[i] > capacity){
                days = days +1;
                load = weights[i];
            }
            else{
                load = load + weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        
        int low = 0;

        int sum = 0;

        for(int i = 0; i < weights.length; i++){
            sum  = sum + weights[i];
        }

        for(int i = 0; i < weights.length; i++){
            low = Math.max(weights[i], low);
        }

        int high = sum;
        int ans = high;
        
        while(low <= high){

            int mid = low + (high - low)/ 2;
            int requiredays = days(weights, mid);

            if(requiredays <= days){
                ans = mid;
                high = mid - 1;

            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}