class Chef {

    String chefName;
    int experience;
    String specialization;
    double salary;
    boolean isFamous;

    public void getChefDetails() {
        System.out.println("Chef Details:");
        System.out.println("Chef Name: " + chefName);
        System.out.println("Experience (years): " + experience);
        System.out.println("Specialization: " + specialization);
        System.out.println("Salary: " + salary);
        System.out.println("Famous Chef: " + isFamous);
        System.out.println("-----------------------------");
    }
}