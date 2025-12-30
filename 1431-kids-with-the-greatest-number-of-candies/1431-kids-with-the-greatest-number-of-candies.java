class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res=new ArrayList<>();
        int max=Arrays.stream(candies).max().getAsInt();
        for(int candie:candies){
            int tot=candie+extraCandies;
            if(tot>=max) res.add(true);
            else res.add(false);
        }
        return res;
    }
}