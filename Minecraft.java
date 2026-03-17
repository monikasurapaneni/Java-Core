class Minecraft{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long playerId, long code){
    System.out.println("Player ID: " + playerId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("mine@gmail.com","mine123");
    login(901234567L,9999L);
  }
}