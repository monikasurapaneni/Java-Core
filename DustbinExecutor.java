class DustbinExecutor {

    public static void main(String[] args){

        Dustbin dustbinOne = new Dustbin();
        dustbinOne.dustbinId = 1;
        dustbinOne.color = "Green";
        dustbinOne.capacity = 10;

        Dustbin dustbinTwo = new Dustbin();
        dustbinTwo.dustbinId = 2;
        dustbinTwo.color = "Blue";
        dustbinTwo.capacity = 15;

        Dustbin dustbinThree = new Dustbin();
        dustbinThree.dustbinId = 3;
        dustbinThree.color = "Red";
        dustbinThree.capacity = 12;

        Dustbin dustbinFour = new Dustbin();
        dustbinFour.dustbinId = 4;
        dustbinFour.color = "Black";
        dustbinFour.capacity = 20;

        Dustbin dustbinFive = new Dustbin();
        dustbinFive.dustbinId = 5;
        dustbinFive.color = "Yellow";
        dustbinFive.capacity = 18;

        Dustbin dustbinSix = new Dustbin();
        dustbinSix.dustbinId = 6;
        dustbinSix.color = "White";
        dustbinSix.capacity = 14;

        Dustbin dustbinSeven = new Dustbin();
        dustbinSeven.dustbinId = 7;
        dustbinSeven.color = "Grey";
        dustbinSeven.capacity = 16;

        Dustbin dustbinEight = new Dustbin();
        dustbinEight.dustbinId = 8;
        dustbinEight.color = "Brown";
        dustbinEight.capacity = 11;

        Dustbin dustbinNine = new Dustbin();
        dustbinNine.dustbinId = 9;
        dustbinNine.color = "Pink";
        dustbinNine.capacity = 13;

        Dustbin dustbinTen = new Dustbin();
        dustbinTen.dustbinId = 10;
        dustbinTen.color = "Orange";
        dustbinTen.capacity = 17;

        Dustbin dustbinEleven = new Dustbin();
        dustbinEleven.dustbinId = 11;
        dustbinEleven.color = "Purple";
        dustbinEleven.capacity = 19;

        Dustbin dustbinTwelve = new Dustbin();
        dustbinTwelve.dustbinId = 12;
        dustbinTwelve.color = "Cyan";
        dustbinTwelve.capacity = 21;

        Dustbin dustbinThirteen = new Dustbin();
        dustbinThirteen.dustbinId = 13;
        dustbinThirteen.color = "Silver";
        dustbinThirteen.capacity = 22;

        Dustbin dustbinFourteen = new Dustbin();
        dustbinFourteen.dustbinId = 14;
        dustbinFourteen.color = "Gold";
        dustbinFourteen.capacity = 23;

        Dustbin dustbinFifteen = new Dustbin();
        dustbinFifteen.dustbinId = 15;
        dustbinFifteen.color = "Maroon";
        dustbinFifteen.capacity = 24;

        Dustbin dustbins[] = new Dustbin[15];
        dustbins[0] = dustbinOne;
        dustbins[1] = dustbinTwo;
        dustbins[2] = dustbinThree;
        dustbins[3] = dustbinFour;
        dustbins[4] = dustbinFive;
        dustbins[5] = dustbinSix;
        dustbins[6] = dustbinSeven;
        dustbins[7] = dustbinEight;
        dustbins[8] = dustbinNine;
        dustbins[9] = dustbinTen;
        dustbins[10] = dustbinEleven;
        dustbins[11] = dustbinTwelve;
        dustbins[12] = dustbinThirteen;
        dustbins[13] = dustbinFourteen;
        dustbins[14] = dustbinFifteen;

        for(Dustbin dustbin : dustbins){
            System.out.println("The dustbin Id is " + dustbin.dustbinId);
            System.out.println("The dustbin color is " + dustbin.color);
            System.out.println("The dustbin capacity is " + dustbin.capacity);
            System.out.println("                     ");
        }
    }
}