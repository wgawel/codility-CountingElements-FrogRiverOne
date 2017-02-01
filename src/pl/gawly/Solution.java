package pl.gawly;

public class Solution {

    public int solution(int X, int[] A) {
        boolean[] positions = new boolean[X];

        for(int i = 0; i < A.length; i++) {
            if (!positions[A[i]-1]) {
                if (--X == 0) {
                    return i;
                }
                positions[A[i]-1] = true;
            }
        }

        return -1;
    }
}
