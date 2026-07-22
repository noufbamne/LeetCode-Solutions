class Solution {

    public int func(int [] nums, int number){
        int num = 1;
        int foreach = 0;

        for (int i = 0; i < nums.length; i++){
            if(foreach + nums[i] <= number){
            foreach = foreach + nums[i];
            }
            else{
                num++;
                foreach = nums[i];
            }
        }
        return num;
    }
    public int splitArray(int[] nums, int k) {
        
        if(k > nums.length) return -1;
        int low = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            low = Math.max(low, nums[i]);
            sum = sum + nums[i];
        }

        int high = sum;

        while(low <= high){
            int mid = low + (high - low) /2;

             int cntnums = func(nums, mid);

            if(cntnums > k){
                low = mid + 1;
            }

            else{
                high = mid -1;
            }
        }
        return low;
    }
}