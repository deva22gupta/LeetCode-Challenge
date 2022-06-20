class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
          Arrays.sort(products);
        int left = 0, right = products.length - 1;
        List<List<String>> result = new ArrayList();

		// result must contain search-resultSet for all the chars
        for(int i = 0; i < searchWord.length(); i++) result.add(new ArrayList());
        
        for (int i = 0; i < searchWord.length() && left <= right; ++i) {
            while(left <= right && (products[left].length() <= i || products[left].charAt(i) != searchWord.charAt(i))) ++left;  // if its not matching then increase the left  pointer
            while(left <= right && (products[right].length() <= i || products[right].charAt(i) != searchWord.charAt(i))) --right;
            for(int k = left; k <= Math.min(right, left+3-1); ++k)
                result.get(i).add(products[k]);
        }
        return result;
    }
}