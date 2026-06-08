class Solution {
    public int singleNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            int num = arr[i];
            int cnt = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == num){
                    cnt ++;
                }
            }
            if (cnt == 1){
                return num;
            }
        
        }
        return -1;
    }
}