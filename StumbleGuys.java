class StumbleGuys{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long playerId, int pin){
    System.out.println("Player ID: " + playerId);
    System.out.println("PIN: " + pin);
  }

  public static void main(String[] args){
    login("stumbleUser","stumble123");
    login(345678901L,3333);
  }
}