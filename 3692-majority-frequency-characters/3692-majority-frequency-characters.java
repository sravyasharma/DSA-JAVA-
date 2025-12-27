class Solution {
    public String majorityFrequencyGroup(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        Map<Integer,Set<Character>> map2 = new HashMap<>();
        for(Character ch : map.keySet()){
            if(map2.get(map.get(ch))!=null){
                Set<Character> set = map2.get(map.get(ch));
                set.add(ch);
            }
            else{
                Set<Character> set = new HashSet<>();
                set.add(ch);
                map2.put(map.get(ch),set);
            }
        }

        StringBuilder sb = new StringBuilder();
        int max = 0;
        int maxNumber = 0;
        for(Integer i : map2.keySet()){
            int size = map2.get(i).size();
            if(size == max){
                maxNumber = Math.max(i,maxNumber);
            }
            else if(size>max){
                maxNumber = i;
                max = size;
            }
        }

        for(char ch : map2.get(maxNumber)){
            sb.append(ch);
        }

        return sb.toString();
    }
}