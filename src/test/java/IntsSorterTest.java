import org.junit.Assert;
import org.junit.Test;
import task1.IntsSorter;

import java.util.LinkedHashSet;


public class IntsSorterTest {

    @Test
    public void getIntsFromStringLineValidInputTest(){
        //given
        String line = "1 2 3 4 5 6 7 8 0 1 2 3";
        int[] intsOrdered = {0,1,2,3,4,5,6,7,8};
        //when
        IntsSorter sorter = new IntsSorter();
        sorter.assignIntsFromStringLine(line);
        LinkedHashSet<Integer> sortedIntsSet = sorter.getIntsSet();
        //then
        int i =0;
        for (Integer sortedInt : sortedIntsSet) {
            Assert.assertEquals(intsOrdered[i], sortedInt.intValue());
            i++;
        }
    }

    @Test(expected = NumberFormatException.class)
    public void getIntsFromStringLineInvalidInputTest(){
        //given
        String line = "1 2 3, 4";
        //when
        IntsSorter sorter = new IntsSorter();
        sorter.assignIntsFromStringLine(line);
    }
}
