class Person {

    String name;
    int age;
    String gender;
    String address;
    String phoneNumber;

    GovernmentIdentification id; 

    public void getPersonDetails() {
        System.out.println("Person Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("--------------------------------");

        id.getIdDetails();

        System.out.println("=================================");
    }
}