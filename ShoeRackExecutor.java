class ShoeRackExecutor {

    public static void main(String[] args){

        ShoeRack rackOne = new ShoeRack();
        rackOne.rackId = 1;
        rackOne.numberOfShelves = 3;
        rackOne.material = "Wood";

        ShoeRack rackTwo = new ShoeRack();
        rackTwo.rackId = 2;
        rackTwo.numberOfShelves = 4;
        rackTwo.material = "Plastic";

        ShoeRack rackThree = new ShoeRack();
        rackThree.rackId = 3;
        rackThree.numberOfShelves = 2;
        rackThree.material = "Metal";

        ShoeRack rackFour = new ShoeRack();
        rackFour.rackId = 4;
        rackFour.numberOfShelves = 5;
        rackFour.material = "Wood";

        ShoeRack rackFive = new ShoeRack();
        rackFive.rackId = 5;
        rackFive.numberOfShelves = 3;
        rackFive.material = "Fiber";

        ShoeRack rackSix = new ShoeRack();
        rackSix.rackId = 6;
        rackSix.numberOfShelves = 6;
        rackSix.material = "Plastic";

        ShoeRack rackSeven = new ShoeRack();
        rackSeven.rackId = 7;
        rackSeven.numberOfShelves = 4;
        rackSeven.material = "Metal";

        ShoeRack rackEight = new ShoeRack();
        rackEight.rackId = 8;
        rackEight.numberOfShelves = 2;
        rackEight.material = "Wood";

        ShoeRack rackNine = new ShoeRack();
        rackNine.rackId = 9;
        rackNine.numberOfShelves = 3;
        rackNine.material = "Fiber";

        ShoeRack rackTen = new ShoeRack();
        rackTen.rackId = 10;
        rackTen.numberOfShelves = 5;
        rackTen.material = "Plastic";

        ShoeRack rackEleven = new ShoeRack();
        rackEleven.rackId = 11;
        rackEleven.numberOfShelves = 4;
        rackEleven.material = "Metal";

        ShoeRack rackTwelve = new ShoeRack();
        rackTwelve.rackId = 12;
        rackTwelve.numberOfShelves = 6;
        rackTwelve.material = "Wood";

        ShoeRack rackThirteen = new ShoeRack();
        rackThirteen.rackId = 13;
        rackThirteen.numberOfShelves = 3;
        rackThirteen.material = "Fiber";

        ShoeRack rackFourteen = new ShoeRack();
        rackFourteen.rackId = 14;
        rackFourteen.numberOfShelves = 5;
        rackFourteen.material = "Metal";

        ShoeRack rackFifteen = new ShoeRack();
        rackFifteen.rackId = 15;
        rackFifteen.numberOfShelves = 2;
        rackFifteen.material = "Plastic";

        ShoeRack racks[] = new ShoeRack[15];
        racks[0] = rackOne;
        racks[1] = rackTwo;
        racks[2] = rackThree;
        racks[3] = rackFour;
        racks[4] = rackFive;
        racks[5] = rackSix;
        racks[6] = rackSeven;
        racks[7] = rackEight;
        racks[8] = rackNine;
        racks[9] = rackTen;
        racks[10] = rackEleven;
        racks[11] = rackTwelve;
        racks[12] = rackThirteen;
        racks[13] = rackFourteen;
        racks[14] = rackFifteen;

        for(ShoeRack rack : racks){
            System.out.println("The rack Id is " + rack.rackId);
            System.out.println("The number of shelves is " + rack.numberOfShelves);
            System.out.println("The rack material is " + rack.material);
            System.out.println("                     ");
        }
    }
}