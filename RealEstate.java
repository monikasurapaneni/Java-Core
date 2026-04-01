class RealEstate {

    String companyName;
    String location;
    String agentName;
    int totalListings;
    String contactNumber;

    Property property; // HAS-A relationship

    public void getRealEstateDetails() {
        System.out.println("Real Estate Details:");
        System.out.println("Company Name: " + companyName);
        System.out.println("Location: " + location);
        System.out.println("Agent Name: " + agentName);
        System.out.println("Total Listings: " + totalListings);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("--------------------------------");

        property.getPropertyDetails();

        System.out.println("=================================");
    }
}