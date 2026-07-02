class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for(int a = 0; a < nums.length; a++){
            if(a > 0 && nums[a] == nums[a-1]) continue;
            for(int b = a+1; b < nums.length; b++){
                if(b > a+1 && nums[b] == nums[b-1]) continue;

                int c = b+1;
                int d = nums.length -1;
                while(c < d){
                    long sum = nums[a];
                    sum = sum + nums[b];
                    sum = sum + nums[c];
                    sum = sum + nums[d];

                    if(sum > target){
                        d--;
                    }

                    else if(sum < target){
                        c++;
                    }

                    else{
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[a]);
                        temp.add(nums[b]);
                        temp.add(nums[c]);
                        temp.add(nums[d]);

                        ans.add(temp);

                        c++;
                        d--;

                        while(c<d && nums[c] == nums[c-1]) c++;
                        while(c<d && nums[d] == nums[d+1]) d--;
                    }
                }
            }
        }

        return ans;
    }
}