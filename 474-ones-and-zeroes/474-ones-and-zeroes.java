class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][][] mem = new int[m+1][n+1][strs.length];
        return helper(strs,m,n,0,mem);
    }
    
    public int helper(String[] strs , int z, int o, int idx,int[][][] mem){
        
        
        if(idx == strs.length || z+o ==0){
            return 0;
            
        }
        if(mem[z][o][idx]>0){
            return mem[z][o][idx];
        }
         int consider =0;
        
        Count count = counter(strs[idx]);
        
        if(z>=count.zero && o>=count.one){
            consider = 1+ helper(strs, z-count.zero,o-count.one,idx+1,mem);
        }
        int skip = helper(strs, z,o,idx+1,mem);
        
        
        mem[z][o][idx] = Math.max(consider,skip);
        return mem[z][o][idx];
    }
    
    
    public Count counter(String str){
        Count count = new Count(0,0);
        
        for(int i =0 ; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '0'){
                count.zero++;
            }
            else
                count.one++;
        }
        
        return count;
        
    }
}

class Count{
    int zero;
    int one;
    
    public Count(int zero, int one){
        this.zero=zero;
        this.one=one;
    }
}