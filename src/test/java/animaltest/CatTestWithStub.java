package animaltest;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTestWithStub {

    @Mock
    Feline feline;

    @Test
    public void catGetFoodWithMock() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(cat.getFood()).thenReturn(expectedFood);
        List<String> actualFood = cat.getFood();

        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void testCatGetSound() {
        Cat cat = new Cat(feline);
        String actualSound = cat.getSound();
        String expectedSound = "Мяу";

        Assert.assertEquals("Значения теста testCatGetSound не совпадают", expectedSound, actualSound);
    }
}
