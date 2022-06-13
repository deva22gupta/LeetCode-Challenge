class Solution {
    public boolean halvesAreAlike(String s) {
     
          HashSet<Character> set = new HashSet<>();
    set.add('a');
    set.add('e');
    set.add('i');
    set.add('o');
    set.add('u');
    set.add('A');
    set.add('E');
    set.add('O');
    set.add('I');
    set.add('U');
    int left =0;
    int right = 0;
    for(int i=0;i<s.length()/2;i++){
        if(set.contains(s.charAt(i))){
            left++;
        }
        if(set.contains(s.charAt(s.length()-1-i))){
            right++;
        }
    }
    return left == right;
    }
}