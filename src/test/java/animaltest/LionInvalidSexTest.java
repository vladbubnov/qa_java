package animaltest;

import org.junit.Test;
import com.example.Lion;
import com.example.Feline;

public class LionInvalidSexTest {

    Feline feline = new Feline();

    @Test(expected = Exception.class)
    public void testInvalidSexLion() throws Exception {
        new Lion("Самеййй", feline);
    }
}