package animaltest;

import org.junit.Test;
import com.example.Lion;
import org.junit.Assert;
import com.example.Feline;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionHaveManeTest {

    private final boolean haveMane;
    private final String sexLionValid;

    Feline feline = new Feline();

    public LionHaveManeTest(String sexLion, boolean haveMane) {
        this.haveMane = haveMane;
        this.sexLionValid = sexLion;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0},{1}")
    public static Object[][] getSexLion() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void testLionDoesHaveMane() throws Exception {
        Lion lion = new Lion(sexLionValid, feline);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(haveMane, actual);
    }
}