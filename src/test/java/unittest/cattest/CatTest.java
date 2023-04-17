package unittest.cattest;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CatTest {

    Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Test
    public void testCatGetSound() {
        String actual = cat.getSound();
        String expected = "Мяу";

        Assert.assertEquals("Значения теста testCatGetSound не совпадают", expected, actual);
    }

    @Test
    public void testCatGetFood() throws Exception {
        List actual = cat.getFood();
        List expected = List.of("Животные", "Птицы", "Рыба");

        Assert.assertEquals("Значения теста testCatGetFood не совпадают", expected, actual);
    }
}
