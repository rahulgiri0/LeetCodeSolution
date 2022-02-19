import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) ->  a[0] - b[0]);
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(intervals[0][0],intervals[0][1]));
        
        for(int i=0;i<intervals.length;i++){
            
            if(intervals[i][0]<=st.peek().end){
                Pair p = st.pop();
                st.push(new Pair(p.start,intervals[i][1]>p.end?intervals[i][1]:p.end));
            }
            else
                st.push(new Pair(intervals[i][0],intervals[i][1]));
        }
        
      int[][] ans = new int[st.size()][2];
        int r = st.size()-1;
     while(!st.isEmpty()){
         Pair p = st.pop();
         ans[r][0]=p.start;
         ans[r][1]=p.end;
         r--;
         
     }
        
        return ans;
    }
}
class Pair{
    int start;
    int end;
    
    public Pair(int start, int end){
        this.start=start;
        this.end = end;
    }
}