class Freelancer {

    String name;
    String skill;
    int experience;
    double hourlyRate;
    String platform;

    Client client; 

    public void getFreelancerDetails() {
        System.out.println("Freelancer Details:");
        System.out.println("Name: " + name);
        System.out.println("Skill: " + skill);
        System.out.println("Experience: " + experience);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Platform: " + platform);
        System.out.println("--------------------------------");

        client.getClientDetails();

        System.out.println("=================================");
    }
}