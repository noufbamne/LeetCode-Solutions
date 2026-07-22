class Solution {
    public int max(int [][]matrix, int n, int m, int col){

        int maxValue = -1;
        int index = -1;

        for(int i = 0; i < n; i++){
            if(matrix[i][col] > maxValue){
            maxValue = matrix[i][col];
            index = i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        
        int n = mat.length;
        int m = mat[0].length;

        int low = 0;
        int high = m-1;

        while(low<=high){
            int mid = low +(high - low) / 2;

            int maxElIndex = max(mat, n, m, mid);

            int left = mid -1 >= 0 ? mat[maxElIndex][mid-1] : -1;
            int right = mid + 1 < m ? mat[maxElIndex][mid +1 ] : -1;

            if(mat[maxElIndex][mid] > left && mat[maxElIndex][mid] > right){
                return new int[]{maxElIndex, mid};
            }

            else if(mat[maxElIndex][mid] < left){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }

        return new int []{-1, -1};
    }
}