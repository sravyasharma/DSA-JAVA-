class Solution {
   public List<String> commonChars(String[] A) {
        int[] minfreq=new int[26];
        Arrays.fill(minfreq,Integer.MAX_VALUE);

        for(String word:A){
            int[] charcount=new int[26];
            for(char c:word.toCharArray()){
                charcount[c-'a']++;
            }
            for(int i=0;i<26;i++){
                minfreq[i]=Math.min(minfreq[i],charcount[i]);
            }
        }
        List<String> res=new ArrayList<>();
        for(int i=0;i<26;i++){
            while(minfreq[i]>0){
                res.add(Character.toString(i+'a'));
                minfreq[i]--;
            }
        }
        return res;
    }
}