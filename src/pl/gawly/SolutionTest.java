package pl.gawly;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void testZero() {
        Assert.assertEquals(0, s.solution(1, new int[] {1}));
    }

    @Test
    public void testExample1() {
        Assert.assertEquals(6, s.solution(5, new int[] {1, 3, 1, 4, 2, 3, 5, 4}));
    }

    @Test
    public void testExample2() {
        Assert.assertEquals(-1, s.solution(5, new int[] {1, 3, 1, 4, 2, 3, 1, 4}));
    }
}
