import org.junit.Assert;
import org.junit.Test;

public class MainClass {

    int x = 14;

    public int getLocalNumber () {
        return x;
    }


    @Test
    public void test1() {
        //getLocalNumber(x);
        Assert.assertTrue("Method doesn't return number 14 ", getLocalNumber() == 14);
    }


}
