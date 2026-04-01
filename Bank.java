class Bank {

    String bankName;
    String ifscCode;
    String location;
    int numberOfEmployees;
    String bankType;

    AccountHolder accountHolder; 

    public void getBankDetails() {
        System.out.println("Bank Details:");
        System.out.println("Bank Name: " + bankName);
        System.out.println("IFSC Code: " + ifscCode);
        System.out.println("Location: " + location);
        System.out.println("Employees: " + numberOfEmployees);
        System.out.println("Bank Type: " + bankType);
        System.out.println("--------------------------------");

        accountHolder.getAccountHolderDetails();

        System.out.println("=================================");
    }
}