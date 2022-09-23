/**
 * @param {number} n
 * @return {number}
 */
var fib = function(n) {
    let dp= Array(n+1);
    if(n <=1)
        return n;
    dp[0]=0;
    dp[1]=1;
    
    for(let i =2; i<dp.length ;i++){
        dp[i]=dp[i-2]+dp[i-1];
    }
    
    return dp[n];
};