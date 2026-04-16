class SatelliteSignalExecutor {

    public static void main(String[] args){

        SatelliteSignal signalOne = new SatelliteSignal();
        signalOne.signalId = 1;
        signalOne.frequency = 2.4;
        signalOne.strength = "Strong";

        SatelliteSignal signalTwo = new SatelliteSignal();
        signalTwo.signalId = 2;
        signalTwo.frequency = 5.0;
        signalTwo.strength = "Medium";

        SatelliteSignal signalThree = new SatelliteSignal();
        signalThree.signalId = 3;
        signalThree.frequency = 1.8;
        signalThree.strength = "Weak";

        SatelliteSignal signalFour = new SatelliteSignal();
        signalFour.signalId = 4;
        signalFour.frequency = 3.5;
        signalFour.strength = "Strong";

        SatelliteSignal signalFive = new SatelliteSignal();
        signalFive.signalId = 5;
        signalFive.frequency = 4.2;
        signalFive.strength = "Medium";

        SatelliteSignal signalSix = new SatelliteSignal();
        signalSix.signalId = 6;
        signalSix.frequency = 2.1;
        signalSix.strength = "Weak";

        SatelliteSignal signalSeven = new SatelliteSignal();
        signalSeven.signalId = 7;
        signalSeven.frequency = 6.0;
        signalSeven.strength = "Strong";

        SatelliteSignal signalEight = new SatelliteSignal();
        signalEight.signalId = 8;
        signalEight.frequency = 3.3;
        signalEight.strength = "Medium";

        SatelliteSignal signalNine = new SatelliteSignal();
        signalNine.signalId = 9;
        signalNine.frequency = 1.5;
        signalNine.strength = "Weak";

        SatelliteSignal signalTen = new SatelliteSignal();
        signalTen.signalId = 10;
        signalTen.frequency = 4.8;
        signalTen.strength = "Strong";

        SatelliteSignal signalEleven = new SatelliteSignal();
        signalEleven.signalId = 11;
        signalEleven.frequency = 2.9;
        signalEleven.strength = "Medium";

        SatelliteSignal signalTwelve = new SatelliteSignal();
        signalTwelve.signalId = 12;
        signalTwelve.frequency = 1.2;
        signalTwelve.strength = "Weak";

        SatelliteSignal signalThirteen = new SatelliteSignal();
        signalThirteen.signalId = 13;
        signalThirteen.frequency = 5.5;
        signalThirteen.strength = "Strong";

        SatelliteSignal signalFourteen = new SatelliteSignal();
        signalFourteen.signalId = 14;
        signalFourteen.frequency = 3.0;
        signalFourteen.strength = "Medium";

        SatelliteSignal signalFifteen = new SatelliteSignal();
        signalFifteen.signalId = 15;
        signalFifteen.frequency = 2.7;
        signalFifteen.strength = "Weak";

        SatelliteSignal signals[] = new SatelliteSignal[15];
        signals[0] = signalOne;
        signals[1] = signalTwo;
        signals[2] = signalThree;
        signals[3] = signalFour;
        signals[4] = signalFive;
        signals[5] = signalSix;
        signals[6] = signalSeven;
        signals[7] = signalEight;
        signals[8] = signalNine;
        signals[9] = signalTen;
        signals[10] = signalEleven;
        signals[11] = signalTwelve;
        signals[12] = signalThirteen;
        signals[13] = signalFourteen;
        signals[14] = signalFifteen;

        for(SatelliteSignal signal : signals){
            System.out.println("The signal Id is " + signal.signalId);
            System.out.println("The frequency is " + signal.frequency);
            System.out.println("The strength is " + signal.strength);
            System.out.println("                     ");
        }
    }
}