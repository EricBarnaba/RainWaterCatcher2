import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RainWaterCatcherTest {

    RainWaterCatcher test;

    @Before
    public void setup(){
        test = new RainWaterCatcher();
    }

    @Test
    public void basicTest(){
        //Given
        Integer[] landscape = {7,0,7};

        //When
        int expected = 7;
        int actual = test.calculateVolume(landscape);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void LargerRightWallTest(){
        //Given
        Integer[] landscape = {7,0,9};

        //When
        int expected = 7;
        int actual = test.calculateVolume(landscape);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void LargerLeftWallTest(){
        //Given
        Integer[] landscape = {9,0,7};

        //When
        int expected = 7;
        int actual = test.calculateVolume(landscape);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void BasicWithMiddleElevationTest(){
        //Given
        Integer[] landscape = {7,0,1,2,3,4,7};

        //When
        int expected = 25;
        int actual = test.calculateVolume(landscape);

        //Then
        Assert.assertEquals(expected,actual);
    }


}
