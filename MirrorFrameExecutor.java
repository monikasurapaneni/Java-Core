class MirrorFrameExecutor {

    public static void main(String[] args){

        MirrorFrame frameOne = new MirrorFrame();
        frameOne.frameId = 1;
        frameOne.material = "Wood";
        frameOne.color = "Brown";

        MirrorFrame frameTwo = new MirrorFrame();
        frameTwo.frameId = 2;
        frameTwo.material = "Plastic";
        frameTwo.color = "Black";

        MirrorFrame frameThree = new MirrorFrame();
        frameThree.frameId = 3;
        frameThree.material = "Metal";
        frameThree.color = "Silver";

        MirrorFrame frameFour = new MirrorFrame();
        frameFour.frameId = 4;
        frameFour.material = "Wood";
        frameFour.color = "White";

        MirrorFrame frameFive = new MirrorFrame();
        frameFive.frameId = 5;
        frameFive.material = "Fiber";
        frameFive.color = "Gold";

        MirrorFrame frameSix = new MirrorFrame();
        frameSix.frameId = 6;
        frameSix.material = "Plastic";
        frameSix.color = "Blue";

        MirrorFrame frameSeven = new MirrorFrame();
        frameSeven.frameId = 7;
        frameSeven.material = "Metal";
        frameSeven.color = "Grey";

        MirrorFrame frameEight = new MirrorFrame();
        frameEight.frameId = 8;
        frameEight.material = "Wood";
        frameEight.color = "Red";

        MirrorFrame frameNine = new MirrorFrame();
        frameNine.frameId = 9;
        frameNine.material = "Glass";
        frameNine.color = "Transparent";

        MirrorFrame frameTen = new MirrorFrame();
        frameTen.frameId = 10;
        frameTen.material = "Fiber";
        frameTen.color = "Pink";

        MirrorFrame frameEleven = new MirrorFrame();
        frameEleven.frameId = 11;
        frameEleven.material = "Metal";
        frameEleven.color = "Black";

        MirrorFrame frameTwelve = new MirrorFrame();
        frameTwelve.frameId = 12;
        frameTwelve.material = "Wood";
        frameTwelve.color = "Orange";

        MirrorFrame frameThirteen = new MirrorFrame();
        frameThirteen.frameId = 13;
        frameThirteen.material = "Plastic";
        frameThirteen.color = "Green";

        MirrorFrame frameFourteen = new MirrorFrame();
        frameFourteen.frameId = 14;
        frameFourteen.material = "Fiber";
        frameFourteen.color = "Purple";

        MirrorFrame frameFifteen = new MirrorFrame();
        frameFifteen.frameId = 15;
        frameFifteen.material = "Metal";
        frameFifteen.color = "Gold";

        MirrorFrame frames[] = new MirrorFrame[15];
        frames[0] = frameOne;
        frames[1] = frameTwo;
        frames[2] = frameThree;
        frames[3] = frameFour;
        frames[4] = frameFive;
        frames[5] = frameSix;
        frames[6] = frameSeven;
        frames[7] = frameEight;
        frames[8] = frameNine;
        frames[9] = frameTen;
        frames[10] = frameEleven;
        frames[11] = frameTwelve;
        frames[12] = frameThirteen;
        frames[13] = frameFourteen;
        frames[14] = frameFifteen;

        for(MirrorFrame frame : frames){
            System.out.println("The frame Id is " + frame.frameId);
            System.out.println("The frame material is " + frame.material);
            System.out.println("The frame color is " + frame.color);
            System.out.println("                     ");
        }
    }
}