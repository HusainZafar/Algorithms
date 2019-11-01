class Solution:
    # @param n, an integer
    # @return an integer
    def reverseBits(self, n):
        total = 0
        for i in range(32):
            total = total<<1|(n&1)
            n = n>>1
        return total
