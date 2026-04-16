class TimePortalExecutor {

    public static void main(String[] args){

        TimePortal portalOne = new TimePortal();
        portalOne.portalId = 1;
        portalOne.destinationEra = "Ancient";
        portalOne.status = "Active";

        TimePortal portalTwo = new TimePortal();
        portalTwo.portalId = 2;
        portalTwo.destinationEra = "Medieval";
        portalTwo.status = "Inactive";

        TimePortal portalThree = new TimePortal();
        portalThree.portalId = 3;
        portalThree.destinationEra = "Future";
        portalThree.status = "Active";

        TimePortal portalFour = new TimePortal();
        portalFour.portalId = 4;
        portalFour.destinationEra = "Prehistoric";
        portalFour.status = "Active";

        TimePortal portalFive = new TimePortal();
        portalFive.portalId = 5;
        portalFive.destinationEra = "Modern";
        portalFive.status = "Inactive";

        TimePortal portalSix = new TimePortal();
        portalSix.portalId = 6;
        portalSix.destinationEra = "Ancient";
        portalSix.status = "Active";

        TimePortal portalSeven = new TimePortal();
        portalSeven.portalId = 7;
        portalSeven.destinationEra = "Future";
        portalSeven.status = "Inactive";

        TimePortal portalEight = new TimePortal();
        portalEight.portalId = 8;
        portalEight.destinationEra = "Medieval";
        portalEight.status = "Active";

        TimePortal portalNine = new TimePortal();
        portalNine.portalId = 9;
        portalNine.destinationEra = "Modern";
        portalNine.status = "Inactive";

        TimePortal portalTen = new TimePortal();
        portalTen.portalId = 10;
        portalTen.destinationEra = "Prehistoric";
        portalTen.status = "Active";

        TimePortal portalEleven = new TimePortal();
        portalEleven.portalId = 11;
        portalEleven.destinationEra = "Future";
        portalEleven.status = "Active";

        TimePortal portalTwelve = new TimePortal();
        portalTwelve.portalId = 12;
        portalTwelve.destinationEra = "Ancient";
        portalTwelve.status = "Inactive";

        TimePortal portalThirteen = new TimePortal();
        portalThirteen.portalId = 13;
        portalThirteen.destinationEra = "Medieval";
        portalThirteen.status = "Active";

        TimePortal portalFourteen = new TimePortal();
        portalFourteen.portalId = 14;
        portalFourteen.destinationEra = "Modern";
        portalFourteen.status = "Inactive";

        TimePortal portalFifteen = new TimePortal();
        portalFifteen.portalId = 15;
        portalFifteen.destinationEra = "Future";
        portalFifteen.status = "Active";

        TimePortal portals[] = new TimePortal[15];
        portals[0] = portalOne;
        portals[1] = portalTwo;
        portals[2] = portalThree;
        portals[3] = portalFour;
        portals[4] = portalFive;
        portals[5] = portalSix;
        portals[6] = portalSeven;
        portals[7] = portalEight;
        portals[8] = portalNine;
        portals[9] = portalTen;
        portals[10] = portalEleven;
        portals[11] = portalTwelve;
        portals[12] = portalThirteen;
        portals[13] = portalFourteen;
        portals[14] = portalFifteen;

        for(TimePortal portal : portals){
            System.out.println("The portal Id is " + portal.portalId);
            System.out.println("The destination era is " + portal.destinationEra);
            System.out.println("The status is " + portal.status);
            System.out.println("                     ");
        }
    }
}