class GovernmentIdentification {

    String idType;
    String idNumber;
    String issuedBy;
    String validity;
    boolean isVerified;

    public void getIdDetails() {
        System.out.println("Government ID Details:");
        System.out.println("ID Type: " + idType);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Issued By: " + issuedBy);
        System.out.println("Validity: " + validity);
        System.out.println("Verified: " + isVerified);
        System.out.println("-----------------------------");
    }
}