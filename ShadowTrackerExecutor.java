class ShadowTrackerExecutor {

    public static void main(String[] args){

        ShadowTracker trackerOne = new ShadowTracker();
        trackerOne.trackerId = 1;
        trackerOne.shadowType = "Soft";
        trackerOne.movement = "Slow";

        ShadowTracker trackerTwo = new ShadowTracker();
        trackerTwo.trackerId = 2;
        trackerTwo.shadowType = "Dark";
        trackerTwo.movement = "Fast";

        ShadowTracker trackerThree = new ShadowTracker();
        trackerThree.trackerId = 3;
        trackerThree.shadowType = "Blur";
        trackerThree.movement = "Medium";

        ShadowTracker trackerFour = new ShadowTracker();
        trackerFour.trackerId = 4;
        trackerFour.shadowType = "Sharp";
        trackerFour.movement = "Slow";

        ShadowTracker trackerFive = new ShadowTracker();
        trackerFive.trackerId = 5;
        trackerFive.shadowType = "Soft";
        trackerFive.movement = "Fast";

        ShadowTracker trackerSix = new ShadowTracker();
        trackerSix.trackerId = 6;
        trackerSix.shadowType = "Dark";
        trackerSix.movement = "Medium";

        ShadowTracker trackerSeven = new ShadowTracker();
        trackerSeven.trackerId = 7;
        trackerSeven.shadowType = "Blur";
        trackerSeven.movement = "Slow";

        ShadowTracker trackerEight = new ShadowTracker();
        trackerEight.trackerId = 8;
        trackerEight.shadowType = "Sharp";
        trackerEight.movement = "Fast";

        ShadowTracker trackerNine = new ShadowTracker();
        trackerNine.trackerId = 9;
        trackerNine.shadowType = "Soft";
        trackerNine.movement = "Medium";

        ShadowTracker trackerTen = new ShadowTracker();
        trackerTen.trackerId = 10;
        trackerTen.shadowType = "Dark";
        trackerTen.movement = "Slow";

        ShadowTracker trackerEleven = new ShadowTracker();
        trackerEleven.trackerId = 11;
        trackerEleven.shadowType = "Blur";
        trackerEleven.movement = "Fast";

        ShadowTracker trackerTwelve = new ShadowTracker();
        trackerTwelve.trackerId = 12;
        trackerTwelve.shadowType = "Sharp";
        trackerTwelve.movement = "Medium";

        ShadowTracker trackerThirteen = new ShadowTracker();
        trackerThirteen.trackerId = 13;
        trackerThirteen.shadowType = "Soft";
        trackerThirteen.movement = "Slow";

        ShadowTracker trackerFourteen = new ShadowTracker();
        trackerFourteen.trackerId = 14;
        trackerFourteen.shadowType = "Dark";
        trackerFourteen.movement = "Fast";

        ShadowTracker trackerFifteen = new ShadowTracker();
        trackerFifteen.trackerId = 15;
        trackerFifteen.shadowType = "Blur";
        trackerFifteen.movement = "Medium";

        ShadowTracker trackers[] = new ShadowTracker[15];
        trackers[0] = trackerOne;
        trackers[1] = trackerTwo;
        trackers[2] = trackerThree;
        trackers[3] = trackerFour;
        trackers[4] = trackerFive;
        trackers[5] = trackerSix;
        trackers[6] = trackerSeven;
        trackers[7] = trackerEight;
        trackers[8] = trackerNine;
        trackers[9] = trackerTen;
        trackers[10] = trackerEleven;
        trackers[11] = trackerTwelve;
        trackers[12] = trackerThirteen;
        trackers[13] = trackerFourteen;
        trackers[14] = trackerFifteen;

        for(ShadowTracker tracker : trackers){
            System.out.println("The tracker Id is " + tracker.trackerId);
            System.out.println("The shadow type is " + tracker.shadowType);
            System.out.println("The movement is " + tracker.movement);
            System.out.println("                     ");
        }
    }
}