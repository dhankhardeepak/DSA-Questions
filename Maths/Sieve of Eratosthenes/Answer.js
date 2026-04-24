class Solution {
    sieve(n) {
        // code here
        let num = new Array(n + 1).fill(true);
        num[0] = false;
        num[1] = false;
        
        for(let i = 2; i * i < n + 1; i++){
            if(num[i] == true){
                for(let j = 2; i * j < n + 1; j++){
                    num[i * j] = false;
                }
            }
        }
        
        let result = [];
        for(let i = 0; i < n + 1; i++){
            if(num[i] == true){
                result.push(i);
            }
        }
        
        return result;
    }
}