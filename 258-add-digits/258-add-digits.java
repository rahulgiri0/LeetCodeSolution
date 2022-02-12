class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        
        
        return addDigits(newNumber(num));
    }
    
    public int newNumber(int num){
        
        int nn=0;
        
        while(num>0){
            
            int rem=num%10;
            nn = nn + rem;
            num/=10;
            
        }
        
        return nn;
        
    }
}