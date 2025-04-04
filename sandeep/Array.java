package sandeep;

public class Array {
    
}
    public int[] buildArray(int[] nums, int[] perm) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Loop through the permutation and build the result array
        for (int i = 0; i < n; i++) {
            result[i] = nums[perm[i]];
        }
        
        return result;
    }
}

