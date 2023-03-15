import org.junit.jupiter.api.RepeatedTest;
import random.PowerBall;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PowerBallTests
{
    @RepeatedTest(5)
    public void rangeTest()
    {
        PowerBall powerball = new PowerBall();
        int[] numbers = powerball.getNumbers();

        //verify that the first five are in the range [1,69]
        //loop over first 5 indices in the array
        for (int i = 0; i < 5; i++)
        {
            //checkRange that the numbers at the current index are greater than or
            // equal to 1 and less than or equal to 69
            checkRange(1, 69, numbers[i]);
        }

        //verify the sixth number is in the range [1,26]
        checkRange(1, 26, numbers[5]);
    }

    private void checkRange(int low, int high, int value)
    {
        //assertTrue that the numbers at the current index are greater than or
        // equal to 1 and less than or equal to 69
        assertTrue(value >= low);
        assertTrue(value <= high);
    }
}
