class WindowLatchExecutor {

    public static void main(String[] args){

        WindowLatch latchOne = new WindowLatch();
        latchOne.latchId = 1;
        latchOne.material = "Steel";
        latchOne.type = "Sliding";

        WindowLatch latchTwo = new WindowLatch();
        latchTwo.latchId = 2;
        latchTwo.material = "Aluminum";
        latchTwo.type = "Hook";

        WindowLatch latchThree = new WindowLatch();
        latchThree.latchId = 3;
        latchThree.material = "Plastic";
        latchThree.type = "Magnetic";

        WindowLatch latchFour = new WindowLatch();
        latchFour.latchId = 4;
        latchFour.material = "Brass";
        latchFour.type = "Bolt";

        WindowLatch latchFive = new WindowLatch();
        latchFive.latchId = 5;
        latchFive.material = "Iron";
        latchFive.type = "Sliding";

        WindowLatch latchSix = new WindowLatch();
        latchSix.latchId = 6;
        latchSix.material = "Steel";
        latchSix.type = "Hook";

        WindowLatch latchSeven = new WindowLatch();
        latchSeven.latchId = 7;
        latchSeven.material = "Aluminum";
        latchSeven.type = "Magnetic";

        WindowLatch latchEight = new WindowLatch();
        latchEight.latchId = 8;
        latchEight.material = "Plastic";
        latchEight.type = "Bolt";

        WindowLatch latchNine = new WindowLatch();
        latchNine.latchId = 9;
        latchNine.material = "Brass";
        latchNine.type = "Sliding";

        WindowLatch latchTen = new WindowLatch();
        latchTen.latchId = 10;
        latchTen.material = "Iron";
        latchTen.type = "Hook";

        WindowLatch latchEleven = new WindowLatch();
        latchEleven.latchId = 11;
        latchEleven.material = "Steel";
        latchEleven.type = "Magnetic";

        WindowLatch latchTwelve = new WindowLatch();
        latchTwelve.latchId = 12;
        latchTwelve.material = "Aluminum";
        latchTwelve.type = "Bolt";

        WindowLatch latchThirteen = new WindowLatch();
        latchThirteen.latchId = 13;
        latchThirteen.material = "Plastic";
        latchThirteen.type = "Sliding";

        WindowLatch latchFourteen = new WindowLatch();
        latchFourteen.latchId = 14;
        latchFourteen.material = "Brass";
        latchFourteen.type = "Hook";

        WindowLatch latchFifteen = new WindowLatch();
        latchFifteen.latchId = 15;
        latchFifteen.material = "Iron";
        latchFifteen.type = "Magnetic";

        WindowLatch latches[] = new WindowLatch[15];
        latches[0] = latchOne;
        latches[1] = latchTwo;
        latches[2] = latchThree;
        latches[3] = latchFour;
        latches[4] = latchFive;
        latches[5] = latchSix;
        latches[6] = latchSeven;
        latches[7] = latchEight;
        latches[8] = latchNine;
        latches[9] = latchTen;
        latches[10] = latchEleven;
        latches[11] = latchTwelve;
        latches[12] = latchThirteen;
        latches[13] = latchFourteen;
        latches[14] = latchFifteen;

        for(WindowLatch latch : latches){
            System.out.println("The latch Id is " + latch.latchId);
            System.out.println("The latch material is " + latch.material);
            System.out.println("The latch type is " + latch.type);
            System.out.println("                     ");
        }
    }
}