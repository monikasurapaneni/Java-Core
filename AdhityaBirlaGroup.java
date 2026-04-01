class AdityaBirlaGroup {

    String companyName;
    String headquarters;
    String industryType;
    int numberOfEmployees;
    double revenue;

    RCB team; 

    public void getCompanyDetails() {
        System.out.println("Company Details:");
        System.out.println("Company Name: " + companyName);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Industry Type: " + industryType);
        System.out.println("Employees: " + numberOfEmployees);
        System.out.println("Revenue: " + revenue);
        System.out.println("--------------------------------");

        team.getTeamDetails();

        System.out.println("=================================");
    }
}