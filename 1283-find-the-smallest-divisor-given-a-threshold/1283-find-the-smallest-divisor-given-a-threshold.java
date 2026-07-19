class Solution {

    public int divisor(int [] nums, int divisor){

        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + (nums[i] + divisor - 1) / divisor;
        }

        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;

        for (int i = 0; i < nums.length; i++){
            high = Math.max(nums[i], high);
        }

        int ans = high;

        while(low<= high){
            int mid = low + (high - low) / 2; 
            int required = divisor(nums, mid);

            if(required <= threshold){
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