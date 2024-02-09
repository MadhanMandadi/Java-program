package exceptions;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class FileReaderTest {
    FileReader fileReader = new FileReader();
    @Test
    public void testFileReader() {
        String output = fileReader.readFile("C:\\Users\\manda\\OneDrive\\Documents\\cloud.txt");
        Assert.assertEquals("Hello I am SaiMadhan Reddy", output);
    }
    @Test
    public void testFileException() {
        Exception exception = Assert.assertThrows(RuntimeException.class,
                () -> fileReader.readFile("data1.txt"));
        Assert.assertEquals(exception.getMessage(), "File not found");
    }
}