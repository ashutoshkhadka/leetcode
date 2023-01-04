import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysChapterTest {
    private ArraysChapter arraysChapter = new ArraysChapter();

    @Test
    public void TestRemoveDuplicates() {
        assertEquals(2, arraysChapter.removeDuplicates(new int[]{1, 2, 2}));
        assertEquals(4, arraysChapter.removeDuplicates(new int[]{1, 1, 2, 2, 3, 3, 4, 4}));
        assertEquals(5, arraysChapter.removeDuplicates(new int[]{1, 1, 2, 2, 3, 3, 4, 5}));
    }

    @Test
    public void TestmaxProfit() {
        assertEquals(3, arraysChapter.maxProfit(new int[]{2, 1, 4}));
        assertEquals(0, arraysChapter.maxProfit(new int[]{7, 6, 4, 3, 1}));
        assertEquals(7, arraysChapter.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(4, arraysChapter.maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void TestRotate() {
        assertArrayEquals(new int[]{3, 4, 1, 2}, arraysChapter.rotate(new int[]{1, 2, 3, 4}, 2));
        assertArrayEquals(new int[]{-1}, arraysChapter.rotate(new int[]{-1}, 2));
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, arraysChapter.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3));
    }

    @Test
    public void TestRotate2() {
        assertArrayEquals(new int[]{3, 4, 1, 2}, arraysChapter.rotate2(new int[]{1, 2, 3, 4}, 2));
        assertArrayEquals(new int[]{-1}, arraysChapter.rotate2(new int[]{-1}, 2));
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, arraysChapter.rotate2(new int[]{1, 2, 3, 4, 5, 6, 7}, 3));
    }

    @Test
    public void TestContainsDuplicate() {
        assertTrue(arraysChapter.containsDuplicate(new int[]{1, 2, 1}));
        assertTrue(arraysChapter.containsDuplicate(new int[]{1, 1}));
        assertFalse(arraysChapter.containsDuplicate(new int[]{1, 2, 3}));
        assertFalse(arraysChapter.containsDuplicate(new int[]{1, 2, 4, 5, 6}));
    }

    @Test
    public void TestSingleNumber() {
        assertEquals(2,arraysChapter.singleNumber(new int[]{1, 1,2}));
        assertEquals(4,arraysChapter.singleNumber(new int[]{4,1,2,1,2}));
        assertEquals(2,arraysChapter.singleNumberXOR(new int[]{1, 1,2}));
        assertEquals(4,arraysChapter.singleNumberXOR(new int[]{4,1,2,1,2}));
    }

    @Test
    public void TestIntersect(){
        assertArrayEquals(new int[]{2,3}, arraysChapter.intersect(new int[]{1,2,3}, new int[]{2,3}));
        assertArrayEquals(new int[]{4,9}, arraysChapter.intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4}));

    }

}