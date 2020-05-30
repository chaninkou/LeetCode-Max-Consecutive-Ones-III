package oneOrZero;

public class FindMaxConsecutiveWithReplacementFunction {
	// Sliding window method
    public int longestOnes(int[] A, int K) {
        if(A.length == 0 || A == null){
            return 0;
        }
        
        // start pointer move as there is not enough replacement for 0
        int zeroCount = 0;
        
        int start = 0;
        
        int max = 0;
        
        for(int end = 0; end < A.length; end++){
            if(A[end] == 0){
                zeroCount++;
            }
            
            // making sure that 0 can be replaced by 1
            while(zeroCount > K){
                if(A[start] == 0){
                    zeroCount--;
                }
                
                start++;
            }
            
            max = Math.max(max, end - start + 1);
        }
        
        return max;
    }
}
