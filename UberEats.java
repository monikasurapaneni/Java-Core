class UberEats{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long accountId, long code){
    System.out.println("Account ID: " + accountId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("ubereatsUser","uber123");
    login(456789123L,2222L);
  }
}