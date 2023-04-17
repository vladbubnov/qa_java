package unittest.liontest;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class LionTest {

    Lion lion;
    Feline feline = new Feline();;

    @Before
    public void setUp() throws Exception {
         lion = new Lion("Самец", feline);
    }

        @Test
    public void testLionGetFood() throws Exception {
        List actual = lion.getFood();
        List expected = List.of("Животные", "Птицы", "Рыба");

        Assert.assertEquals("Значения теста testLionGetFood не совпадают", expected, actual);
    }

        @Test
    public void testLionGetKittens() {
        int actual = lion.getKittens();
        int expected = 1;

        Assert.assertEquals("Значения теста testLionGetKittens не совпадают", expected, actual);
    }
}
