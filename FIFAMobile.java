class FIFAMobile{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long playerId, long code){
    System.out.println("Player ID: " + playerId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("fifaUser","fifa123");
    login(567890123L,5555L);
  }
}