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
    public void largerRightWallTest(){
        //Given
        Integer[] landscape = {7,0,9};

        //When
        int expected = 7;
        int actual = test.calculateVolume(landscape);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void largerLeftWallTest(){
        //Given
        Integer[] landscape = {9,0,7};

        //When
        int expected = 7;
        int actual = test.calculateVolume(landscape);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void basicWithMiddleElevationTest(){
        //Given
        Integer[] landscape = {7,0,1,2,3,4,7};

        //When
        int expected = 25;
        int actual = test.calculateVolume(landscape);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void allWaterFlowsOutTest(){
        //Given
        Integer[] landscape = {7,6,5,4,3,2,1,0};

        //When
        int expected = 0;
        int actual = test.calculateVolume(landscape);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void allWaterFlowsOutTest2(){
        //Given
        Integer[] landscape = {0,1,2,3,4,5,6,7};

        //When
        int expected = 0;
        int actual = test.calculateVolume(landscape);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void highBasicTest(){
        //Given
        Integer[] landscape = {7,6,6,7};

        //When
        int expected = 2;
        int actual = test.calculateVolume(landscape);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void highMiddleTest(){
        //Given
        Integer[] landscape = {10,0,2,3,11,4,0,10};

        //When
        int expected = 41;
        int actual = test.calculateVolume(landscape);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void highMiddleLeftFlowOutTest(){
        //Given
        Integer[] landscape = {1,2,2,3,11,4,0,10};

        //When
        int expected = 16;
        int actual = test.calculateVolume(landscape);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void highMiddleRightFlowOutTest(){
        //Given
        Integer[] landscape = {10,2,2,3,11,4,2,1};

        //When
        int expected = 23;
        int actual = test.calculateVolume(landscape);

        //Then
        Assert.assertEquals(expected,actual);
    }


}
