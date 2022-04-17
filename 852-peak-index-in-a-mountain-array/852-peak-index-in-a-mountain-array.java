class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            
            int mid = start + (end-start)/2;
            
            if((mid==0 || arr[mid]>=arr[mid-1]) && (mid ==arr.length-1 || arr[mid]>=arr[mid+1]))
                return mid;
            
            else if(mid > 0 && arr[mid]<arr[mid-1])
                end= mid-1;
            
            else if(mid<arr.length && arr[mid]<arr[mid+1])
                start= mid+1;
        }
        
        
        return -1;
    }
}