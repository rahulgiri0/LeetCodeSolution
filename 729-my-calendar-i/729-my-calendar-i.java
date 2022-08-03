class MyCalendar {

    List<Pair> cal;
    public MyCalendar() {
        this.cal = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for(Pair p: cal){
            
            if(p.start<end && p.end>start)
                return false;
          
        }
        
          cal.add(new Pair(start,end));
        return true;
    }
}

class Pair{
    
    int start;
    int end;
    
    Pair(int start, int end){
        this.start=start;
        this.end = end;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */