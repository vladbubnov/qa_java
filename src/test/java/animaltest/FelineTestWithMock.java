package animaltest;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTestWithMock {

    @Mock
    Feline feline;

    @Test
    public void testFelineEatMeatWithMock() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }

    @Test
    public void testFelineGetFamilyWithMock() {
        feline.getFamily();
        Mockito.verify(feline, Mockito.times(1)).getFamily();
    }

    @Test
    public void testFelineGetKittensWithMock() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void testFelineGetKittensWithParametersAndMock() {
        feline.getKittens(4);
        Mockito.verify(feline).getKittens(4);
    }
}
