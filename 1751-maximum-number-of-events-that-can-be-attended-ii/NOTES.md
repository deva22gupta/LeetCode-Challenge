0
January 25, 2022 9:53 AM
​
Read More
@Invulnerable I did get that if we sort by end-time we won't be able to use binary search. But still unable to get why it is giving the wrong output in an implementation where the binary search is not applied. Would be grateful if u can explain a bit or prove it by example.
​
0
Reply
Share
Report
Invulnerable's avatar
Invulnerable
​
1499
February 9, 2021 1:34 PM
​
Read More
Because then we will not be able to find the next event by using this:
​
for(i = pos + 1; i < n; i++)
if(events[i][0] > events[pos][1])
break;
​
Here we are simply breaking when we found a event starting time greater than the ending of current event. But if we sort it according to ending time there may be some event after this which we can too attend and is optimal as well.
​
Simply we cannot binary search the next event if we sort using ending time.