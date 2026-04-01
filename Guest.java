class Guest {

    String guestName;
    String profession;
    int age;
    String topicDiscussed;
    boolean isFamous;

    public void getGuestDetails() {
        System.out.println("Guest Details:");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Profession: " + profession);
        System.out.println("Age: " + age);
        System.out.println("Topic Discussed: " + topicDiscussed);
        System.out.println("Famous: " + isFamous);
        System.out.println("-----------------------------");
    }
}