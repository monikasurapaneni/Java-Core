class Client {

    String clientName;
    String company;
    String projectType;
    double budget;
    boolean isInternational;

    public void getClientDetails() {
        System.out.println("Client Details:");
        System.out.println("Client Name: " + clientName);
        System.out.println("Company: " + company);
        System.out.println("Project Type: " + projectType);
        System.out.println("Budget: " + budget);
        System.out.println("International Client: " + isInternational);
        System.out.println("-----------------------------");
    }
}