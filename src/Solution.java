public class Solution {
    public int solution(int[] A) {
        long fullLength = A.length + 1;
        long total = (fullLength * (fullLength + 1)) / 2;
        long sum = 0L;

        for (int i : A) {
            sum += i;
        }

        return (int)(total - sum);
    }
}
