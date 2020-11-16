class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        // a^b^c.....z = xor1
        // a^b^c.....y = xor2
        // xor1^xor2 = z
        int xor1 = 0, xor2 = 0;
        for(int i=0;i<array.length;i++)
            xor1 ^= array[i];
        for(int i=1;i<=n;i++)
            xor2 ^= i;
        return xor1^xor2;
    }
}
