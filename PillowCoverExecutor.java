class PillowCoverExecutor {

    public static void main(String[] args){

        PillowCover coverOne = new PillowCover();
        coverOne.coverId = 1;
        coverOne.color = "White";
        coverOne.material = "Cotton";

        PillowCover coverTwo = new PillowCover();
        coverTwo.coverId = 2;
        coverTwo.color = "Blue";
        coverTwo.material = "Silk";

        PillowCover coverThree = new PillowCover();
        coverThree.coverId = 3;
        coverThree.color = "Pink";
        coverThree.material = "Polyester";

        PillowCover coverFour = new PillowCover();
        coverFour.coverId = 4;
        coverFour.color = "Green";
        coverFour.material = "Cotton";

        PillowCover coverFive = new PillowCover();
        coverFive.coverId = 5;
        coverFive.color = "Yellow";
        coverFive.material = "Linen";

        PillowCover coverSix = new PillowCover();
        coverSix.coverId = 6;
        coverSix.color = "Red";
        coverSix.material = "Silk";

        PillowCover coverSeven = new PillowCover();
        coverSeven.coverId = 7;
        coverSeven.color = "Purple";
        coverSeven.material = "Cotton";

        PillowCover coverEight = new PillowCover();
        coverEight.coverId = 8;
        coverEight.color = "Grey";
        coverEight.material = "Polyester";

        PillowCover coverNine = new PillowCover();
        coverNine.coverId = 9;
        coverNine.color = "Orange";
        coverNine.material = "Linen";

        PillowCover coverTen = new PillowCover();
        coverTen.coverId = 10;
        coverTen.color = "Brown";
        coverTen.material = "Cotton";

        PillowCover coverEleven = new PillowCover();
        coverEleven.coverId = 11;
        coverEleven.color = "Black";
        coverEleven.material = "Silk";

        PillowCover coverTwelve = new PillowCover();
        coverTwelve.coverId = 12;
        coverTwelve.color = "Cyan";
        coverTwelve.material = "Polyester";

        PillowCover coverThirteen = new PillowCover();
        coverThirteen.coverId = 13;
        coverThirteen.color = "Magenta";
        coverThirteen.material = "Cotton";

        PillowCover coverFourteen = new PillowCover();
        coverFourteen.coverId = 14;
        coverFourteen.color = "Gold";
        coverFourteen.material = "Linen";

        PillowCover coverFifteen = new PillowCover();
        coverFifteen.coverId = 15;
        coverFifteen.color = "Silver";
        coverFifteen.material = "Silk";

        PillowCover covers[] = new PillowCover[15];
        covers[0] = coverOne;
        covers[1] = coverTwo;
        covers[2] = coverThree;
        covers[3] = coverFour;
        covers[4] = coverFive;
        covers[5] = coverSix;
        covers[6] = coverSeven;
        covers[7] = coverEight;
        covers[8] = coverNine;
        covers[9] = coverTen;
        covers[10] = coverEleven;
        covers[11] = coverTwelve;
        covers[12] = coverThirteen;
        covers[13] = coverFourteen;
        covers[14] = coverFifteen;

        for(PillowCover cover : covers){
            System.out.println("The cover Id is " + cover.coverId);
            System.out.println("The cover color is " + cover.color);
            System.out.println("The cover material is " + cover.material);
            System.out.println("                     ");
        }
    }
}