class SpaceStationExecutor {

    public static void main(String[] args){

        SpaceStation stationOne = new SpaceStation();
        stationOne.stationId = 1;
        stationOne.stationName = "Alpha";
        stationOne.orbitType = "Low Earth Orbit";

        SpaceStation stationTwo = new SpaceStation();
        stationTwo.stationId = 2;
        stationTwo.stationName = "Beta";
        stationTwo.orbitType = "Geostationary Orbit";

        SpaceStation stationThree = new SpaceStation();
        stationThree.stationId = 3;
        stationThree.stationName = "Gamma";
        stationThree.orbitType = "Polar Orbit";

        SpaceStation stationFour = new SpaceStation();
        stationFour.stationId = 4;
        stationFour.stationName = "Delta";
        stationFour.orbitType = "Low Earth Orbit";

        SpaceStation stationFive = new SpaceStation();
        stationFive.stationId = 5;
        stationFive.stationName = "Epsilon";
        stationFive.orbitType = "Geostationary Orbit";

        SpaceStation stationSix = new SpaceStation();
        stationSix.stationId = 6;
        stationSix.stationName = "Zeta";
        stationSix.orbitType = "Polar Orbit";

        SpaceStation stationSeven = new SpaceStation();
        stationSeven.stationId = 7;
        stationSeven.stationName = "Eta";
        stationSeven.orbitType = "Low Earth Orbit";

        SpaceStation stationEight = new SpaceStation();
        stationEight.stationId = 8;
        stationEight.stationName = "Theta";
        stationEight.orbitType = "Geostationary Orbit";

        SpaceStation stationNine = new SpaceStation();
        stationNine.stationId = 9;
        stationNine.stationName = "Iota";
        stationNine.orbitType = "Polar Orbit";

        SpaceStation stationTen = new SpaceStation();
        stationTen.stationId = 10;
        stationTen.stationName = "Kappa";
        stationTen.orbitType = "Low Earth Orbit";

        SpaceStation stationEleven = new SpaceStation();
        stationEleven.stationId = 11;
        stationEleven.stationName = "Lambda";
        stationEleven.orbitType = "Geostationary Orbit";

        SpaceStation stationTwelve = new SpaceStation();
        stationTwelve.stationId = 12;
        stationTwelve.stationName = "Mu";
        stationTwelve.orbitType = "Polar Orbit";

        SpaceStation stationThirteen = new SpaceStation();
        stationThirteen.stationId = 13;
        stationThirteen.stationName = "Nu";
        stationThirteen.orbitType = "Low Earth Orbit";

        SpaceStation stationFourteen = new SpaceStation();
        stationFourteen.stationId = 14;
        stationFourteen.stationName = "Xi";
        stationFourteen.orbitType = "Geostationary Orbit";

        SpaceStation stationFifteen = new SpaceStation();
        stationFifteen.stationId = 15;
        stationFifteen.stationName = "Omicron";
        stationFifteen.orbitType = "Polar Orbit";

        SpaceStation stations[] = new SpaceStation[15];

        stations[0] = stationOne;
        stations[1] = stationTwo;
        stations[2] = stationThree;
        stations[3] = stationFour;
        stations[4] = stationFive;
        stations[5] = stationSix;
        stations[6] = stationSeven;
        stations[7] = stationEight;
        stations[8] = stationNine;
        stations[9] = stationTen;
        stations[10] = stationEleven;
        stations[11] = stationTwelve;
        stations[12] = stationThirteen;
        stations[13] = stationFourteen;
        stations[14] = stationFifteen;

        for(SpaceStation station : stations){
            System.out.println("The station Id is " + station.stationId);
            System.out.println("The station name is " + station.stationName);
            System.out.println("The orbit type is " + station.orbitType);
            System.out.println("                     ");
        }
    }
}