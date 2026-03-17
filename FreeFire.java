class FreeFire{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long playerId, long code){
    System.out.println("Player ID: " + playerId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("freefire@gmail.com","fire123");
    login(234567890L,2222L);
  }
}