import org.junit.Assert;
import org.junit.Test;

public class MainClass {
    private int class_number = 20;

    public int getClassNumber() {
        return class_number;
    }

    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("Returned number less than 45 ", getClassNumber() > 45);
    }

}
