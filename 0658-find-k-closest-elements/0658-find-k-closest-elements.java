class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int ws=0,n=arr.length;
        for(int i=0;i<n-k;i++){
            if(Math.abs(arr[i]-x)>Math.abs(arr[i+k]-x)) ws=i+1;
        }
        List<Integer> res=new ArrayList<>();
        for(int i=ws;i<ws+k;i++) res.add(arr[i]);
        return res;
    }
}