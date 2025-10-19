class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        List<Character> vowelsList=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(vowels.contains(c)){
                vowelsList.add(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        int j=vowelsList.size()-1;
         for(char c:s.toCharArray()){
            if(vowels.contains(c)){
                sb.append(vowelsList.get(j));
                j--;
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}