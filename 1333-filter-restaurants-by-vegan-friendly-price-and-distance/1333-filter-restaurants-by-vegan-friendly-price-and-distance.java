class Solution {
public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        
    //first sort on the basis of rating 
    //then sort on the  basis of id if the ratings are same
    // sorting a 2d dimension array
    
    List<Integer> li = new ArrayList<Integer>();
    // if rating equal sort acc to id otherwise sort acc to rating
    PriorityQueue<int[]> pq = new PriorityQueue<>( (a,b) -> a[1]==b[1]?b[0]-a[0]:b[1]-a[1]);
    for(int i=0;i<restaurants.length;i++){
        if(veganFriendly==1){
            if(veganFriendly!=restaurants[i][2]) continue;
        }
        if(restaurants[i][3]<=maxPrice && restaurants[i][4]<=maxDistance){
            pq.add(restaurants[i]);
        }
    }
    while(!pq.isEmpty()){
        li.add(pq.poll()[0]);   // add the id part to arraylist
    }
    
    return li;
    
   // Arrays.sort(restaurants)
    
    
    
    }
}