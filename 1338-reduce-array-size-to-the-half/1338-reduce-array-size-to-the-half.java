class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        int size = arr.length;
        int result =0;
        for(Integer a:arr)
            map.put(a,map.getOrDefault(a,0)+1);
        
        for(Map.Entry<Integer, Integer> a :map.entrySet())
            pq.offer(a.getValue());
        
        
        while(size>arr.length/2){
            size-= pq.poll();
            result++;
        }
        
        return result;
        
        
    }
}