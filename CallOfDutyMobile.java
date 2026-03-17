class CallOfDutyMobile{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long accountId, int pin){
    System.out.println("Account ID: " + accountId);
    System.out.println("PIN: " + pin);
  }

  public static void main(String[] args){
    login("codUser","cod123");
    login(345678901L,3333);
  }
}