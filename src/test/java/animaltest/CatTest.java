package animaltest;

import org.junit.Test;
import java.util.List;
import com.example.Cat;
import org.junit.Assert;
import com.example.Feline;

public class CatTest {

    Feline feline = new Feline();

    @Test
    public void testCatGetFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = cat.getFood();
        Assert.assertEquals("Значения теста testCatGetFood не совпадают", expectedFood, actualFood);
    }

    @Test
    public void testCatGetSound() {
        Cat cat = new Cat(feline);
        String actualSound = cat.getSound();
        String expectedSound = "Мяу";
        Assert.assertEquals("Значения теста testCatGetSound не совпадают", expectedSound, actualSound);
    }
}