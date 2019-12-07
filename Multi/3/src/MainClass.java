import org.junit.Assert;
import org.junit.Test;

public class MainClass {

    private String classSring = "Hello, world";

    public String getClassString () {
        return classSring;
    }

    @Test
    public void testGetClassString() {
        Assert.assertTrue("Returned string does not have word Hello inside ",getClassString().contains("Hello") || getClassString().contains("hello"));
    }

}
