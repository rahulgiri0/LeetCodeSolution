class Solution {
    public double myPow(double x, int n) {
        
        if(n==0){
            return 1.00;
        }
        
        double p = myPow( x,n/2);
        double pow= p*p;
        
        if(n%2!=0){
            if(n>0)
            pow = pow*x;
            else
                pow/=x;
        }
       
        return pow;
        
    }
}