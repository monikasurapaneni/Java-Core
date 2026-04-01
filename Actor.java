class Actor {

    String actorName;
    int age;
    String nationality;
    int numberOfMovies;
    boolean isAwardWinner;

    public void getActorDetails() {
        System.out.println("Actor Details:");
        System.out.println("Actor Name: " + actorName);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);
        System.out.println("Number of Movies: " + numberOfMovies);
        System.out.println("Award Winner: " + isAwardWinner);
        System.out.println("-----------------------------");
    }
}