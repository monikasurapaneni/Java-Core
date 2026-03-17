class AmongUs{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long gameId, int pin){
    System.out.println("Game ID: " + gameId);
    System.out.println("PIN: " + pin);
  }

  public static void main(String[] args){
    login("amongUser","among123");
    login(912345678L,1010);
  }
}