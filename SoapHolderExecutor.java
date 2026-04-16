class SoapHolderExecutor {

    public static void main(String[] args){

        SoapHolder holderOne = new SoapHolder();
        holderOne.holderId = 1;
        holderOne.material = "Plastic";
        holderOne.color = "White";

        SoapHolder holderTwo = new SoapHolder();
        holderTwo.holderId = 2;
        holderTwo.material = "Steel";
        holderTwo.color = "Silver";

        SoapHolder holderThree = new SoapHolder();
        holderThree.holderId = 3;
        holderThree.material = "Wood";
        holderThree.color = "Brown";

        SoapHolder holderFour = new SoapHolder();
        holderFour.holderId = 4;
        holderFour.material = "Fiber";
        holderFour.color = "Blue";

        SoapHolder holderFive = new SoapHolder();
        holderFive.holderId = 5;
        holderFive.material = "Plastic";
        holderFive.color = "Pink";

        SoapHolder holderSix = new SoapHolder();
        holderSix.holderId = 6;
        holderSix.material = "Steel";
        holderSix.color = "Grey";

        SoapHolder holderSeven = new SoapHolder();
        holderSeven.holderId = 7;
        holderSeven.material = "Wood";
        holderSeven.color = "Black";

        SoapHolder holderEight = new SoapHolder();
        holderEight.holderId = 8;
        holderEight.material = "Fiber";
        holderEight.color = "Green";

        SoapHolder holderNine = new SoapHolder();
        holderNine.holderId = 9;
        holderNine.material = "Plastic";
        holderNine.color = "Yellow";

        SoapHolder holderTen = new SoapHolder();
        holderTen.holderId = 10;
        holderTen.material = "Steel";
        holderTen.color = "Gold";

        SoapHolder holderEleven = new SoapHolder();
        holderEleven.holderId = 11;
        holderEleven.material = "Wood";
        holderEleven.color = "Red";

        SoapHolder holderTwelve = new SoapHolder();
        holderTwelve.holderId = 12;
        holderTwelve.material = "Fiber";
        holderTwelve.color = "Purple";

        SoapHolder holderThirteen = new SoapHolder();
        holderThirteen.holderId = 13;
        holderThirteen.material = "Plastic";
        holderThirteen.color = "Orange";

        SoapHolder holderFourteen = new SoapHolder();
        holderFourteen.holderId = 14;
        holderFourteen.material = "Steel";
        holderFourteen.color = "Cyan";

        SoapHolder holderFifteen = new SoapHolder();
        holderFifteen.holderId = 15;
        holderFifteen.material = "Wood";
        holderFifteen.color = "Magenta";

        SoapHolder holders[] = new SoapHolder[15];
        holders[0] = holderOne;
        holders[1] = holderTwo;
        holders[2] = holderThree;
        holders[3] = holderFour;
        holders[4] = holderFive;
        holders[5] = holderSix;
        holders[6] = holderSeven;
        holders[7] = holderEight;
        holders[8] = holderNine;
        holders[9] = holderTen;
        holders[10] = holderEleven;
        holders[11] = holderTwelve;
        holders[12] = holderThirteen;
        holders[13] = holderFourteen;
        holders[14] = holderFifteen;

        for(SoapHolder holder : holders){
            System.out.println("The holder Id is " + holder.holderId);
            System.out.println("The holder material is " + holder.material);
            System.out.println("The holder color is " + holder.color);
            System.out.println("                     ");
        }
    }
}