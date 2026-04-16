class PowerStripExecutor {

    public static void main(String[] args){

        PowerStrip stripOne = new PowerStrip();
        stripOne.stripId = 1;
        stripOne.numberOfSockets = 4;
        stripOne.color = "White";

        PowerStrip stripTwo = new PowerStrip();
        stripTwo.stripId = 2;
        stripTwo.numberOfSockets = 6;
        stripTwo.color = "Black";

        PowerStrip stripThree = new PowerStrip();
        stripThree.stripId = 3;
        stripThree.numberOfSockets = 5;
        stripThree.color = "Grey";

        PowerStrip stripFour = new PowerStrip();
        stripFour.stripId = 4;
        stripFour.numberOfSockets = 8;
        stripFour.color = "Blue";

        PowerStrip stripFive = new PowerStrip();
        stripFive.stripId = 5;
        stripFive.numberOfSockets = 3;
        stripFive.color = "Red";

        PowerStrip stripSix = new PowerStrip();
        stripSix.stripId = 6;
        stripSix.numberOfSockets = 7;
        stripSix.color = "Green";

        PowerStrip stripSeven = new PowerStrip();
        stripSeven.stripId = 7;
        stripSeven.numberOfSockets = 4;
        stripSeven.color = "Yellow";

        PowerStrip stripEight = new PowerStrip();
        stripEight.stripId = 8;
        stripEight.numberOfSockets = 6;
        stripEight.color = "Pink";

        PowerStrip stripNine = new PowerStrip();
        stripNine.stripId = 9;
        stripNine.numberOfSockets = 5;
        stripNine.color = "Orange";

        PowerStrip stripTen = new PowerStrip();
        stripTen.stripId = 10;
        stripTen.numberOfSockets = 9;
        stripTen.color = "Purple";

        PowerStrip stripEleven = new PowerStrip();
        stripEleven.stripId = 11;
        stripEleven.numberOfSockets = 2;
        stripEleven.color = "Brown";

        PowerStrip stripTwelve = new PowerStrip();
        stripTwelve.stripId = 12;
        stripTwelve.numberOfSockets = 10;
        stripTwelve.color = "Cyan";

        PowerStrip stripThirteen = new PowerStrip();
        stripThirteen.stripId = 13;
        stripThirteen.numberOfSockets = 8;
        stripThirteen.color = "Magenta";

        PowerStrip stripFourteen = new PowerStrip();
        stripFourteen.stripId = 14;
        stripFourteen.numberOfSockets = 6;
        stripFourteen.color = "Silver";

        PowerStrip stripFifteen = new PowerStrip();
        stripFifteen.stripId = 15;
        stripFifteen.numberOfSockets = 7;
        stripFifteen.color = "Gold";

        PowerStrip strips[] = new PowerStrip[15];
        strips[0] = stripOne;
        strips[1] = stripTwo;
        strips[2] = stripThree;
        strips[3] = stripFour;
        strips[4] = stripFive;
        strips[5] = stripSix;
        strips[6] = stripSeven;
        strips[7] = stripEight;
        strips[8] = stripNine;
        strips[9] = stripTen;
        strips[10] = stripEleven;
        strips[11] = stripTwelve;
        strips[12] = stripThirteen;
        strips[13] = stripFourteen;
        strips[14] = stripFifteen;

        for(PowerStrip strip : strips){
            System.out.println("The strip Id is " + strip.stripId);
            System.out.println("The number of sockets is " + strip.numberOfSockets);
            System.out.println("The strip color is " + strip.color);
            System.out.println("                     ");
        }
    }
}