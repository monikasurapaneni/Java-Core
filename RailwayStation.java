class RailwayStation {

    String stationName;
    String location;
    int numberOfPlatforms;
    String zone;
    String stationCode;

    Platform platform;

    public void getRailwayStationDetails() {
        System.out.println("Railway Station Details:");
        System.out.println("Station Name: " + stationName);
        System.out.println("Location: " + location);
        System.out.println("Number of Platforms: " + numberOfPlatforms);
        System.out.println("Zone: " + zone);
        System.out.println("Station Code: " + stationCode);
        System.out.println("--------------------------------");

        platform.getPlatformDetails();

        System.out.println("=================================");
    }
}