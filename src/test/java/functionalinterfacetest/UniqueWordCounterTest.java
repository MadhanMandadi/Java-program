package functionalinterfacetest;

import functionalinterface.CountUniqueWords;
import org.junit.Assert;
import org.junit.Test;

public class UniqueWordCounterTest
{
    CountUniqueWords countWords=new CountUniqueWords();
    @Test
    public void testGetUniqueWords() {
        Assert.assertEquals(6, countWords.getCountUniqueWords("This is a sample string and string have characters"));
        //Failure
        Assert.assertNotEquals(3, countWords.getCountUniqueWords("rama"));
        //Edge case
        Assert.assertEquals(0, countWords.getCountUniqueWords(""));
    }

}