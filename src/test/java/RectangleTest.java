import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
Rectangle rect = new Rectangle(2,3);
    @Test
    public void getArea() {
        Assert.assertEquals(rect.getArea(), 6);
    }

    @Test
    public void getP() {
    }
}