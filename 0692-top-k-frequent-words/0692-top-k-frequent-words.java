class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        for(String w:words){
            map.put(w,map.getOrDefault(w,0)+1);
        }

        PriorityQueue<String> pq=new PriorityQueue<>((a,b)->map.get(a).equals(map.get(b))?a.compareTo(b):map.get(b)-map.get(a));
        
        pq.addAll(map.keySet());

        List<String> res=new ArrayList<>();
        while(k-->0){
            res.add(pq.poll());
        }
        return res;
    }
}