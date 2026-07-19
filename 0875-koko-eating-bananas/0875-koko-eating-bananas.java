class Solution {

    public long totalhours (int [] piles, int speed){

        long hours = 0;

        for(int i = 0; i < piles.length; i++){
            hours = hours + (piles[i] + speed -1) / speed;
        }
        return hours;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        for(int i = 0; i < piles.length; i++){
            high = Math.max(piles[i] , high);
        }

        int ans = high;

        while(low <= high){
            int mid = low + (high - low) / 2;

            long requiredhours = totalhours(piles, mid);

            if(requiredhours <= h){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}