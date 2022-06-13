class Solution {
    public boolean halvesAreAlike(String s) {
     
//         We could have used a single vowel counter for both left and right part. For each vowel on the left side increment the counter and for each vowel on right side decrement the counter. At the end, we could simply
// return counter == 0;

// In addition to that, we can also use only one counter rather that two. Basically start from 0 and other pointer will be
// s.length()/2 + pointer
        
    //       HashSet<Character> set = new HashSet<>();
    // set.add('a');
    // set.add('e');
    // set.add('i');
    // set.add('o');
    // set.add('u');
    // set.add('A');
    // set.add('E');
    // set.add('O');
    // set.add('I');
    // set.add('U');
    // int left =0;
    // int right = 0;
    // for(int i=0;i<s.length()/2;i++){
    //     if(set.contains(s.charAt(i))){
    //         left++;
    //     }
    //     if(set.contains(s.charAt(s.length()-1-i))){
    //         right++;
    //     }
    // }
    // return left == right;
        
        
        
        
        
     //   public boolean halvesAreAlike(String s) {
    Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    int count = 0, i = 0, j = s.length() - 1;

    while(i < j){
        if(set.contains(s.charAt(i++)))
            ++count;
        if(set.contains(s.charAt(j--)))
            --count;
    }
    return count == 0;
//}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}