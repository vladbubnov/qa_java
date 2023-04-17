package unittest.liontest;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionHaveManeTest {

    Feline feline = new Feline();
    private final String sexLionValid;
    private final String sexLionInValid;
    private final boolean haveMane;

    public LionHaveManeTest(String sexLion, String sexLionInValid, boolean haveMane) {
        this.sexLionValid = sexLion;
        this.sexLionInValid = sexLionInValid;
        this.haveMane = haveMane;
    }

    @Parameterized.Parameters
    public static Object[][] getSexLion() {
        return new Object[][] {
                {"Самец", "Самей", true},
                {"Самка", "Самкааа", false}
        };
    }

    @Test
    public void testLionDoesHaveMane() throws Exception {
        Lion lion = new Lion(sexLionValid, feline);
        boolean actual = lion.doesHaveMane();

        Assert.assertEquals(haveMane, actual);
    }

    @Test(expected = Exception.class)
    public void testInvalidSexLion() throws Exception {
        Lion lion = new Lion(sexLionInValid, feline);
        boolean actual = lion.doesHaveMane();

        Assert.assertTrue(actual);
    }
}