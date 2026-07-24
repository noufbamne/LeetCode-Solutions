class Solution {
    public String frequencySort(String s) {
        
        int [] freq = new int [128];

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)]++;
        }

        StringBuilder[] bucket = new StringBuilder[s.length() +1];
        for(int i = 0; i <128; i++){
            if(freq[i] > 0){

                if(bucket[freq[i]] == null){
                    bucket[freq[i]] = new StringBuilder();
                }
                bucket[freq[i]].append((char) i);
            }
        }

        StringBuilder result = new StringBuilder();

        for(int f = s.length(); f >= 0; f--){
            if(bucket[f] !=null){
                for(int j = 0; j< bucket[f].length(); j++){
                     char ch = bucket[f].charAt(j);

                    for (int k = 0; k < f; k++) {
                        result.append(ch);
                    }
                }
            }
        }

        return result.toString();
    }
}