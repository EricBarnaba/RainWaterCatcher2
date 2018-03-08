public class RainWaterCatcher {

    public RainWaterCatcher() {

    }

    public int calculateVolume(Integer[] landscape) {

        int leftWallIndex = 0;
        int leftWallHeight = landscape[0];
        int waterInJeopardy = 0;
        int waterContained = 0;

        for (int i = 1; i < landscape.length; i++) {

            if (landscape[i] < leftWallHeight) {
                waterInJeopardy += (leftWallHeight - landscape[i]);
                if (landscape[i] > landscape[i - 1]) {
                    waterContained += (landscape[i] - landscape[i - 1]);
                    waterInJeopardy -= (landscape[i] - landscape[i - 1]);
                }
                if (i == (landscape.length - 1) && landscape[i] > landscape[i - 1]) {
                    if ((waterInJeopardy - ((leftWallHeight - landscape[i]) * ((i - leftWallIndex)))) > 0) {
                        waterContained += (waterInJeopardy - ((leftWallHeight - landscape[i]) * ((i - leftWallIndex))));
                    }
                }

            } else {
                if (landscape[i] >= leftWallHeight) {
                    waterContained += waterInJeopardy;
                    waterInJeopardy = 0;
                    leftWallHeight = landscape[i];
                    leftWallIndex = i;
                }
            }
        }

        if (waterContained > 0) {
            return waterContained;
        } else return 0;

    }


}
