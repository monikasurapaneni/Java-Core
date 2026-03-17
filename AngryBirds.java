class AngryBirds{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long gameId, long code){
    System.out.println("Game ID: " + gameId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("angry@gmail.com","angry123");
    login(234567890L,2222L);
  }
}