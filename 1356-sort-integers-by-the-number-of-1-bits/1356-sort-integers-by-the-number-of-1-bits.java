class Solution {
    public int[] sortByBits(int[] arr) {
        int[] ans=new int[arr.length];
        int[] bits=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i];
            int temp=arr[i];
            int count=0;
            while(temp>0){
                count+=(temp&1);
                temp>>=1;
            }
            bits[i]=count;
        }

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(bits[j]>bits[j+1] || bits[j]==bits[j+1] && ans[j]>ans[j+1]){

                    int temp1=bits[j];
                    bits[j]=bits[j+1];
                    bits[j+1]=temp1;


                    int temp2=ans[j];
                    ans[j]=ans[j+1];
                    ans[j+1]=temp2;
                }
            }
        }
        return ans;
    }
}