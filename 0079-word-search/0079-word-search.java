class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        boolean res=true;
        boolean[][] vis=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                    res=backtrack(board,word,vis,i,j,0);
                    if(res) return true;
                }
            }
        }
        return false;
    }
    private boolean backtrack(char[][] board,String word,boolean[][] vis,int i,int j,int index){
        if(index==word.length()) return true;
        if(i<0||i>=board.length||j<0||j>=board[0].length||vis[i][j]||board[i][j]!=word.charAt(index)) return false;
        vis[i][j]=true;
        if(backtrack(board,word,vis,i+1,j,index+1) ||
           backtrack(board,word,vis,i-1,j,index+1) ||
           backtrack(board,word,vis,i,j+1,index+1) ||
           backtrack(board,word,vis,i,j-1,index+1)) return true;
        vis[i][j]=false;
        return false;
    }
}