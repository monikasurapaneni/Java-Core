class CandyCrush{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long gameId, long code){
    System.out.println("Game ID: " + gameId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("candyUser","candy123");
    login(567890123L,5555L);
  }
}