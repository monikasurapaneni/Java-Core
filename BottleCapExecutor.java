class BottleCapExecutor {

    public static void main(String[] args){

        BottleCap capOne = new BottleCap();
        capOne.capId = 1;
        capOne.color = "Red";
        capOne.size = 10;

        BottleCap capTwo = new BottleCap();
        capTwo.capId = 2;
        capTwo.color = "Blue";
        capTwo.size = 12;

        BottleCap capThree = new BottleCap();
        capThree.capId = 3;
        capThree.color = "Green";
        capThree.size = 8;

        BottleCap capFour = new BottleCap();
        capFour.capId = 4;
        capFour.color = "Black";
        capFour.size = 9;

        BottleCap capFive = new BottleCap();
        capFive.capId = 5;
        capFive.color = "White";
        capFive.size = 11;

        BottleCap capSix = new BottleCap();
        capSix.capId = 6;
        capSix.color = "Yellow";
        capSix.size = 7;

        BottleCap capSeven = new BottleCap();
        capSeven.capId = 7;
        capSeven.color = "Orange";
        capSeven.size = 10;

        BottleCap capEight = new BottleCap();
        capEight.capId = 8;
        capEight.color = "Pink";
        capEight.size = 6;

        BottleCap capNine = new BottleCap();
        capNine.capId = 9;
        capNine.color = "Purple";
        capNine.size = 13;

        BottleCap capTen = new BottleCap();
        capTen.capId = 10;
        capTen.color = "Brown";
        capTen.size = 9;

        BottleCap capEleven = new BottleCap();
        capEleven.capId = 11;
        capEleven.color = "Grey";
        capEleven.size = 8;

        BottleCap capTwelve = new BottleCap();
        capTwelve.capId = 12;
        capTwelve.color = "Cyan";
        capTwelve.size = 7;

        BottleCap capThirteen = new BottleCap();
        capThirteen.capId = 13;
        capThirteen.color = "Magenta";
        capThirteen.size = 12;

        BottleCap capFourteen = new BottleCap();
        capFourteen.capId = 14;
        capFourteen.color = "Gold";
        capFourteen.size = 11;

        BottleCap capFifteen = new BottleCap();
        capFifteen.capId = 15;
        capFifteen.color = "Silver";
        capFifteen.size = 10;

        BottleCap caps[] = new BottleCap[15];
        caps[0] = capOne;
        caps[1] = capTwo;
        caps[2] = capThree;
        caps[3] = capFour;
        caps[4] = capFive;
        caps[5] = capSix;
        caps[6] = capSeven;
        caps[7] = capEight;
        caps[8] = capNine;
        caps[9] = capTen;
        caps[10] = capEleven;
        caps[11] = capTwelve;
        caps[12] = capThirteen;
        caps[13] = capFourteen;
        caps[14] = capFifteen;

        for(BottleCap cap : caps){
            System.out.println("The cap Id is " + cap.capId);
            System.out.println("The cap color is " + cap.color);
            System.out.println("The cap size is " + cap.size);
            System.out.println("                     ");
        }
    }
}