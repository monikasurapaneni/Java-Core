class AlightMotion{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long accountId, int pin){
    System.out.println("Account ID: " + accountId);
    System.out.println("PIN: " + pin);
  }

  public static void main(String[] args){
    login("alightUser","alight123");
    login(890123456L,1010);
  }
}