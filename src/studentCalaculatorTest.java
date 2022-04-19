import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class studentCalaculatorTest {

    @Test
    public void studentScoreCalculatorRegular() {

        studentCalaculator sc = new studentCalaculator();

        int mathsScore;
        int literacyScore;
        sc.calcultoreSATScore(mathsScore = 50, literacyScore = 50);
        int expected;
        assertEquals(expected = 2500, sc.getSatScore());

    }

    @Test
    public void studentScoreCalculatorNegative() {

        studentCalaculator sc = new studentCalaculator();

        int mathsScore;
        int literacyScore;
        sc.calcultoreSATScore(mathsScore = -1, literacyScore = 50);
        int expected;
        assertEquals(expected = -1, sc.getSatScore());
    }

    @Test
    public void studentScoreCalculatorLiteracyNegative() {

        studentCalaculator sc = new studentCalaculator();

        int mathsScore;
        int literacyScore;
        sc.calcultoreSATScore(mathsScore = 50, literacyScore = -1);
        int expected;
        assertEquals(expected = -1, sc.getSatScore());


    }

    @Test
    public void studentScoreCalculatorBothNegative() {

        studentCalaculator sc = new studentCalaculator();

        int mathsScore;
        int literacyScore;
        sc.calcultoreSATScore(mathsScore = -1, literacyScore = -1);
        int expected;
        assertEquals(expected = -1, sc.getSatScore());
    }

    @Test
    public void studentScoreCalculatorMathHigh() {

        studentCalaculator sc = new studentCalaculator();

        int mathsScore;
        int literacyScore;
        sc.calcultoreSATScore(mathsScore = 102, literacyScore = 50);
        int expected;
        assertEquals(expected = -1, sc.getSatScore());
    }

    @Test
    public void studentScoreCalculatorLiteracyHigh() {

        studentCalaculator sc = new studentCalaculator();

        int mathsScore;
        int literacyScore;
        sc.calcultoreSATScore(mathsScore = 50, literacyScore = 150);
        int expected;
        assertEquals(expected = -1, sc.getSatScore());
    }

    @Test
    public void studentScoreCalculatorBothHigh() {

        studentCalaculator sc = new studentCalaculator();

        int mathsScore;
        int literacyScore;
        sc.calcultoreSATScore(mathsScore = 150, literacyScore = 150);
        int expected;
        assertEquals(expected = -1, sc.getSatScore());
    }

}