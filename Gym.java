class Gym {

    String gymName;
    String location;
    int numberOfMembers;
    String gymType;
    double monthlyFee;

    Trainer trainer; 

    public void getGymDetails() {
        System.out.println("Gym Details:");
        System.out.println("Gym Name: " + gymName);
        System.out.println("Location: " + location);
        System.out.println("Members: " + numberOfMembers);
        System.out.println("Gym Type: " + gymType);
        System.out.println("Monthly Fee: " + monthlyFee);
        System.out.println("--------------------------------");

        trainer.getTrainerDetails();

        System.out.println("=================================");
    }
}