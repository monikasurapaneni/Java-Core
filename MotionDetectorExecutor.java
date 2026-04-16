class MotionDetectorExecutor {

    public static void main(String[] args){

        MotionDetector detectorOne = new MotionDetector();
        detectorOne.detectorId = 1;
        detectorOne.sensitivity = "High";
        detectorOne.status = "Active";

        MotionDetector detectorTwo = new MotionDetector();
        detectorTwo.detectorId = 2;
        detectorTwo.sensitivity = "Medium";
        detectorTwo.status = "Inactive";

        MotionDetector detectorThree = new MotionDetector();
        detectorThree.detectorId = 3;
        detectorThree.sensitivity = "Low";
        detectorThree.status = "Active";

        MotionDetector detectorFour = new MotionDetector();
        detectorFour.detectorId = 4;
        detectorFour.sensitivity = "High";
        detectorFour.status = "Active";

        MotionDetector detectorFive = new MotionDetector();
        detectorFive.detectorId = 5;
        detectorFive.sensitivity = "Medium";
        detectorFive.status = "Inactive";

        MotionDetector detectorSix = new MotionDetector();
        detectorSix.detectorId = 6;
        detectorSix.sensitivity = "Low";
        detectorSix.status = "Active";

        MotionDetector detectorSeven = new MotionDetector();
        detectorSeven.detectorId = 7;
        detectorSeven.sensitivity = "High";
        detectorSeven.status = "Inactive";

        MotionDetector detectorEight = new MotionDetector();
        detectorEight.detectorId = 8;
        detectorEight.sensitivity = "Medium";
        detectorEight.status = "Active";

        MotionDetector detectorNine = new MotionDetector();
        detectorNine.detectorId = 9;
        detectorNine.sensitivity = "Low";
        detectorNine.status = "Inactive";

        MotionDetector detectorTen = new MotionDetector();
        detectorTen.detectorId = 10;
        detectorTen.sensitivity = "High";
        detectorTen.status = "Active";

        MotionDetector detectorEleven = new MotionDetector();
        detectorEleven.detectorId = 11;
        detectorEleven.sensitivity = "Medium";
        detectorEleven.status = "Active";

        MotionDetector detectorTwelve = new MotionDetector();
        detectorTwelve.detectorId = 12;
        detectorTwelve.sensitivity = "Low";
        detectorTwelve.status = "Inactive";

        MotionDetector detectorThirteen = new MotionDetector();
        detectorThirteen.detectorId = 13;
        detectorThirteen.sensitivity = "High";
        detectorThirteen.status = "Active";

        MotionDetector detectorFourteen = new MotionDetector();
        detectorFourteen.detectorId = 14;
        detectorFourteen.sensitivity = "Medium";
        detectorFourteen.status = "Inactive";

        MotionDetector detectorFifteen = new MotionDetector();
        detectorFifteen.detectorId = 15;
        detectorFifteen.sensitivity = "Low";
        detectorFifteen.status = "Active";

        MotionDetector detectors[] = new MotionDetector[15];
        detectors[0] = detectorOne;
        detectors[1] = detectorTwo;
        detectors[2] = detectorThree;
        detectors[3] = detectorFour;
        detectors[4] = detectorFive;
        detectors[5] = detectorSix;
        detectors[6] = detectorSeven;
        detectors[7] = detectorEight;
        detectors[8] = detectorNine;
        detectors[9] = detectorTen;
        detectors[10] = detectorEleven;
        detectors[11] = detectorTwelve;
        detectors[12] = detectorThirteen;
        detectors[13] = detectorFourteen;
        detectors[14] = detectorFifteen;

        for(MotionDetector detector : detectors){
            System.out.println("The detector Id is " + detector.detectorId);
            System.out.println("The sensitivity is " + detector.sensitivity);
            System.out.println("The status is " + detector.status);
            System.out.println("                     ");
        }
    }
}