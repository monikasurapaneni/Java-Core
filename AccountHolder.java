class AccountHolder {

    String name;
    int age;
    String accountType;
    double balance;
    String branch;

    public void getAccountHolderDetails() {
        System.out.println("Account Holder Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println("Branch: " + branch);
        System.out.println("-----------------------------");
    }
}