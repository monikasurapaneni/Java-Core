class Trainer {

    String trainerName;
    int experience;
    String specialization;
    double salary;
    boolean certified;

    public void getTrainerDetails() {
        System.out.println("Trainer Details:");
        System.out.println("Trainer Name: " + trainerName);
        System.out.println("Experience (years): " + experience);
        System.out.println("Specialization: " + specialization);
        System.out.println("Salary: " + salary);
        System.out.println("Certified: " + certified);
        System.out.println("-----------------------------");
    }
}