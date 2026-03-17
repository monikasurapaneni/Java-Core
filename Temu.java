class Temu{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long accountId, long code){
    System.out.println("Account ID: " + accountId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("temuUser","temu123");
    login(567890123L,5252L);
  }
}