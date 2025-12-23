class Solution {
    public boolean strongPasswordCheckerII(String password) {
        String symbols="!@#$%^&*()-+";
        if(password.length()<8) return false;
        boolean up=false,low=false,dig=false,sym=false;

        for(int i=0;i<=password.length()-1;i++){
            char c=password.charAt(i);
            if(i>0 && c==password.charAt(i-1)) return false;
            if(Character.isUpperCase(c)) up=true;
            if(Character.isLowerCase(c)) low=true;
            if(Character.isDigit(c)) dig=true;
            if(symbols.indexOf(c)!=-1) sym=true;
        }
        return up && low && dig && sym;
    }
}