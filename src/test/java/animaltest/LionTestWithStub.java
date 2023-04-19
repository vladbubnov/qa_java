package animaltest;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTestWithStub {

    @Mock
    Feline feline;

    @Test
    public void lionGetKittensWithMock() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(lion.getKittens()).thenReturn(1);
        int actual = lion.getKittens();

        Assert.assertEquals(1, actual);
    }

    @Test
    public void lionGetFoodWithMock() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(lion.getFood()).thenReturn(expected);
        List<String> actual = lion.getFood();

        Assert.assertEquals(expected, actual);
    }
}
