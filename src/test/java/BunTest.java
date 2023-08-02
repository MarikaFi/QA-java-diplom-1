import static org.junit.Assert.*;

import org.junit.Test;
import praktikum.Bun;

public class BunTest {
    private final String expected_name = "expected";
    private final float expected_price = 1.1f;
    private final Bun bun = new Bun(expected_name, expected_price);

    @Test
    public void getName() {
        String actual = bun.getName();
        assertEquals("Наименование отличается", expected_name, actual);
    }

    @Test
    public void getPrice() {
        float actual = bun.getPrice();
        assertEquals("Цена отличается", expected_price, actual, 0);
    }
}
