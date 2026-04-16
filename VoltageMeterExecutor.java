class VoltageMeterExecutor {

    public static void main(String[] args){

        VoltageMeter meterOne = new VoltageMeter();
        meterOne.meterId = 1;
        meterOne.voltage = 220.5;
        meterOne.status = "Normal";

        VoltageMeter meterTwo = new VoltageMeter();
        meterTwo.meterId = 2;
        meterTwo.voltage = 180.2;
        meterTwo.status = "Low";

        VoltageMeter meterThree = new VoltageMeter();
        meterThree.meterId = 3;
        meterThree.voltage = 250.0;
        meterThree.status = "High";

        VoltageMeter meterFour = new VoltageMeter();
        meterFour.meterId = 4;
        meterFour.voltage = 230.1;
        meterFour.status = "Normal";

        VoltageMeter meterFive = new VoltageMeter();
        meterFive.meterId = 5;
        meterFive.voltage = 170.3;
        meterFive.status = "Low";

        VoltageMeter meterSix = new VoltageMeter();
        meterSix.meterId = 6;
        meterSix.voltage = 260.4;
        meterSix.status = "High";

        VoltageMeter meterSeven = new VoltageMeter();
        meterSeven.meterId = 7;
        meterSeven.voltage = 225.6;
        meterSeven.status = "Normal";

        VoltageMeter meterEight = new VoltageMeter();
        meterEight.meterId = 8;
        meterEight.voltage = 190.0;
        meterEight.status = "Low";

        VoltageMeter meterNine = new VoltageMeter();
        meterNine.meterId = 9;
        meterNine.voltage = 255.2;
        meterNine.status = "High";

        VoltageMeter meterTen = new VoltageMeter();
        meterTen.meterId = 10;
        meterTen.voltage = 240.7;
        meterTen.status = "Normal";

        VoltageMeter meterEleven = new VoltageMeter();
        meterEleven.meterId = 11;
        meterEleven.voltage = 175.9;
        meterEleven.status = "Low";

        VoltageMeter meterTwelve = new VoltageMeter();
        meterTwelve.meterId = 12;
        meterTwelve.voltage = 265.3;
        meterTwelve.status = "High";

        VoltageMeter meterThirteen = new VoltageMeter();
        meterThirteen.meterId = 13;
        meterThirteen.voltage = 235.8;
        meterThirteen.status = "Normal";

        VoltageMeter meterFourteen = new VoltageMeter();
        meterFourteen.meterId = 14;
        meterFourteen.voltage = 185.4;
        meterFourteen.status = "Low";

        VoltageMeter meterFifteen = new VoltageMeter();
        meterFifteen.meterId = 15;
        meterFifteen.voltage = 270.6;
        meterFifteen.status = "High";

        VoltageMeter meters[] = new VoltageMeter[15];
        meters[0] = meterOne;
        meters[1] = meterTwo;
        meters[2] = meterThree;
        meters[3] = meterFour;
        meters[4] = meterFive;
        meters[5] = meterSix;
        meters[6] = meterSeven;
        meters[7] = meterEight;
        meters[8] = meterNine;
        meters[9] = meterTen;
        meters[10] = meterEleven;
        meters[11] = meterTwelve;
        meters[12] = meterThirteen;
        meters[13] = meterFourteen;
        meters[14] = meterFifteen;

        for(VoltageMeter meter : meters){
            System.out.println("The meter Id is " + meter.meterId);
            System.out.println("The voltage is " + meter.voltage);
            System.out.println("The status is " + meter.status);
            System.out.println("                     ");
        }
    }
}