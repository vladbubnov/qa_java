package animaltest;

import org.junit.Test;
import java.util.List;
import org.junit.Assert;
import com.example.Feline;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void testFelineEatMeat() throws Exception {
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals("Значения теста testFelineEatMeat не совпадают", expected, actual);
    }

    @Test
    public void testFelineGetFamily() {
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        Assert.assertEquals("Значения теста testFelineGetFamily не совпадают", expected, actual);
    }

    @Test
    public void testFelineGetKittens() {
        int actual = feline.getKittens();
        int expected = 1;
        Assert.assertEquals("Значения теста testFelineGetKittens не совпадают", expected, actual);
    }

    @Test
    public void testFelineGetKittensWithParameters() {
        int actual = feline.getKittens(2);
        int expected = 2;
        Assert.assertEquals("Значения теста testFelineGetKittensWithParameters не совпадают", expected, actual);
    }
}