class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] mul = new int[primes.length];
        for(int i=0; i<mul.length; i++)
        {
            mul[i] = 1;
        }
        
        long[] res = new long[n+1];
        
        res[1] = 1;
        for(int i=2; i<=n; i++)
        {
            int min_j = 0;
            
            System.out.println(mul[0] +"  "+res[mul[0]]);
            
            res[i] = primes[0]*res[mul[0]];
            for(int j=1; j<primes.length; j++ )
            {
                if(primes[j]*res[mul[j]] <= res[i])
                {
                    res[i] = primes[j]*res[mul[j]];
                    // min_j = j;
                }
                
            }
            for(int k=0; k<mul.length; k++)
            {
                if(res[i] == primes[k]*res[mul[k]])
                {
                    mul[k]++;
                }
            }
        }
        
        
        for(int i=0; i<res.length; i++)
        {
            System.out.print(res[i] +" ");
        }
        
        return (int)res[n];
        
        
    }
}