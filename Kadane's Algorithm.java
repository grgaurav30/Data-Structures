class Solution{

    // arr: input array
    // n: size of array
    //Function to find  the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
          long total = arr[0];
        long maxtotal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxtotal = Math.max(arr[i], maxtotal + arr[i]);
            total = Math.max(total, maxtotal);
        }

        return total ;
        
        
    }
    
}
