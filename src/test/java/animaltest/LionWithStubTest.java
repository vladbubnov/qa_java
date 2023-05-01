package animaltest;

import org.junit.Test;
import java.util.List;
import com.example.Lion;
import org.junit.Assert;
import org.mockito.Mock;
import com.example.Feline;
import org.mockito.Mockito;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionWithStubTest {

    @Mock
    Feline feline;

    @Test
    public void testLionGetKittensWithStub() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals("Значения теста testLionGetKittensWithStub не совпадают",
                1, lion.getKittens());
    }

    @Test
    public void testLionGetFoodWithStub() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        Assert.assertEquals("Значения теста testLionGetFoodWithStub не совпадают",
                expectedFood, lion.getFood());
    }
}