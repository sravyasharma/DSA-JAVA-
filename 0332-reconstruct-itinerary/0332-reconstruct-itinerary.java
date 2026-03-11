class Solution {
    Map<String,PriorityQueue<String>> map=new HashMap<>();
    LinkedList<String> list=new LinkedList<>();
    public List<String> findItinerary(List<List<String>> tickets) {
        for(List<String> l:tickets){
            String from=l.get(0);
            String to=l.get(1);
            map.putIfAbsent(from,new PriorityQueue<>());
            map.get(from).add(to);
        }
        dfs("JFK");
        return list;
    }
    void dfs(String abx){
        PriorityQueue<String> pq=map.get(abx);
        while(pq!=null && !pq.isEmpty()) dfs(pq.poll());
        list.addFirst(abx);
    }
}